package api.github.com.anonymous.repos;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.Download;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Downloads
    extends DelegateTransfer<Anonymous>
{

    public Downloads(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Deprecated. List downloads for a repository.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Download[]> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/downloads".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Download[].class);
    }

    /**
     * 
     * <p>
     * Deprecated. Get a single download.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param downloadId
     *     Id of download.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Download> getByOwnerRepoDownloadId(String owner,
        String repo,
        long downloadId,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/downloads/{downloadId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{downloadId}", ""+downloadId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Download.class);
    }

    /**
     * 
     * <p>
     * Deprecated. Delete a download.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param downloadId
     *     Id of download.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByOwnerRepoDownloadId(String owner,
        String repo,
        long downloadId,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/downloads/{downloadId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{downloadId}", ""+downloadId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
