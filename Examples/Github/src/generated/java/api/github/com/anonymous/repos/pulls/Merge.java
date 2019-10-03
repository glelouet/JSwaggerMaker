package api.github.com.anonymous.repos.pulls;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.MergePullBody;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Merge
    extends DelegateTransfer<Anonymous>
{

    public Merge(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get if a pull request has been merged.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param number
     *     Id of pull.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void getByOwnerRepoNumber_(String owner,
        String repo,
        long number,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/pulls/{number}/merge".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestGet(url, headerProperties, Void.class);
    }

    /**
     * 
     * <p>
     * Merge a pull request (Merge Button's)
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param number
     *     Id of pull.
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<api.github.com.definitions.Merge> putByOwnerRepoNumber_(String owner,
        String repo,
        long number,
        String Accept,
        MergePullBody body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/pulls/{number}/merge".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", (body));
        return requestPut(url, headerProperties, content, api.github.com.definitions.Merge.class);
    }
}
