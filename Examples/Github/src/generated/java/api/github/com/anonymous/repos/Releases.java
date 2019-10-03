package api.github.com.anonymous.repos;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.anonymous.repos.releases.Assets;
import api.github.com.definitions.Release;
import api.github.com.definitions.ReleaseCreate;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Releases
    extends DelegateTransfer<Anonymous>
{
    public final Assets assets;

    public Releases(Anonymous delegate) {
        super(delegate);
        assets = new Assets((delegate));
    }

    /**
     * 
     * <p>
     * Users with push access to the repository will receive all releases (i.e., published releases and draft releases). Users with pull access will receive published releases only
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Releases[]> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/releases".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Releases[].class);
    }

    /**
     * 
     * <p>
     * Create a release
     * Users with push access to the repository can create a release.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<Release> postByOwnerRepo(String owner,
        String repo,
        String Accept,
        ReleaseCreate body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/releases".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, Release.class);
    }

    /**
     * 
     * <p>
     * Get a single release
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
    public Requested<Release> getByOwnerRepoId(String owner,
        String repo,
        String id,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/releases/{id}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Release.class);
    }

    /**
     * 
     * <p>
     * Users with push access to the repository can delete a release.
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
        String url = ("https://api.github.com//repos/{owner}/{repo}/releases/{id}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
