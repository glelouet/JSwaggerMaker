package api.github.com.anonymous.repos.releases;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.Asset;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Assets
    extends DelegateTransfer<Anonymous>
{

    public Assets(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get a single release asset
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param id
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Asset> getByOwnerRepoId(String owner,
        String repo,
        String id,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/releases/assets/{id}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Asset.class);
    }

    /**
     * 
     * <p>
     * Delete a release asset
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param id
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByOwnerRepoId(String owner,
        String repo,
        String id,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/releases/assets/{id}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }

    /**
     * 
     * <p>
     * List assets for a release
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param id
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Asset[]> getByOwnerRepoId2(String owner,
        String repo,
        String id,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/releases/{id}/assets".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Asset[].class);
    }
}
