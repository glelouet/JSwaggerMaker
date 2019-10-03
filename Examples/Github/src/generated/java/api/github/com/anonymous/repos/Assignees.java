package api.github.com.anonymous.repos;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.User;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Assignees
    extends DelegateTransfer<Anonymous>
{

    public Assignees(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List assignees.
     * This call lists all the available assignees (owner + collaborators) to which
     * issues may be assigned.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<User[]> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/assignees".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, User[].class);
    }

    /**
     * 
     * <p>
     * Check assignee.
     * You may also check to see if a particular user is an assignee for a repository.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param assignee
     *     Login of the assignee.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void getByOwnerRepoAssignee(String owner,
        String repo,
        String assignee,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/assignees/{assignee}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{assignee}", ""+assignee));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestGet(url, headerProperties, Void.class);
    }
}
