package api.github.com.anonymous.repos.commits;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.RefStatus;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Status
    extends DelegateTransfer<Anonymous>
{

    public Status(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get the combined Status for a specific Ref
     * The Combined status endpoint is currently available for developers to preview. During the preview period, the API may change without advance notice. Please see the blog post for full details.
     * To access this endpoint during the preview period, you must provide a custom media type in the Accept header:
     * application/vnd.github.she-hulk-preview+json
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param ref
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<RefStatus[]> getByOwnerRepoRef(String owner,
        String repo,
        String ref,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/commits/{ref}/status".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{ref}", ""+ref));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, RefStatus[].class);
    }
}
