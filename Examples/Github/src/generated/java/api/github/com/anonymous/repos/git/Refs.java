package api.github.com.anonymous.repos.git;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.HeadBranch;
import api.github.com.definitions.RefsBody;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Refs
    extends DelegateTransfer<Anonymous>
{

    public Refs(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get all References
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Refs[]> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/git/refs".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Refs[].class);
    }

    /**
     * 
     * <p>
     * Create a Reference
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
    public Requested<HeadBranch> postByOwnerRepo(String owner,
        String repo,
        String Accept,
        RefsBody body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/git/refs".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, HeadBranch.class);
    }

    /**
     * 
     * <p>
     * Get a Reference
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
    public Requested<HeadBranch> getByOwnerRepoRef(String owner,
        String repo,
        String ref,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/git/refs/{ref}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{ref}", ""+ref));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, HeadBranch.class);
    }

    /**
     * 
     * <p>
     * Delete a Reference
     * Example: Deleting a branch: DELETE /repos/octocat/Hello-World/git/refs/heads/feature-a 
     * Example: Deleting a tag:        DELETE /repos/octocat/Hello-World/git/refs/tags/v1.0
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
    public void deleteByOwnerRepoRef(String owner,
        String repo,
        String ref,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/git/refs/{ref}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{ref}", ""+ref));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
