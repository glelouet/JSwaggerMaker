package api.github.com.anonymous.repos;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.HeadBranch;
import api.github.com.definitions.Ref;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Statuses
    extends DelegateTransfer<Anonymous>
{

    public Statuses(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List Statuses for a specific Ref.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param ref
     *     Ref to list the statuses from. It can be a SHA, a branch name, or a tag name.
     *     
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Ref[]> getByOwnerRepoRef(String owner,
        String repo,
        String ref,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/statuses/{ref}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{ref}", ""+ref));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Ref[].class);
    }

    /**
     * 
     * <p>
     * Create a Status.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param ref
     *     Ref to list the statuses from. It can be a SHA, a branch name, or a tag name.
     *     
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<Ref[]> postByOwnerRepoRef(String owner,
        String repo,
        String ref,
        String Accept,
        HeadBranch body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/statuses/{ref}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{ref}", ""+ref));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, Ref[].class);
    }
}
