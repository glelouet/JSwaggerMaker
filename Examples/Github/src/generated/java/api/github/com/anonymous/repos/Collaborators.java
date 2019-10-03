package api.github.com.anonymous.repos;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.User;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Collaborators
    extends DelegateTransfer<Anonymous>
{

    public Collaborators(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List.
     * When authenticating as an organization owner of an organization-owned
     * repository, all organization owners are included in the list of
     * collaborators. Otherwise, only users with access to the repository are
     * returned in the collaborators list.
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
        String url = ("https://api.github.com//repos/{owner}/{repo}/collaborators".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, User[].class);
    }

    /**
     * 
     * <p>
     * Check if user is a collaborator
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param user
     *     Login of the user.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void getByOwnerRepoUser(String owner,
        String repo,
        String user,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/collaborators/{user}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{user}", ""+user));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestGet(url, headerProperties, Void.class);
    }

    /**
     * 
     * <p>
     * Add collaborator.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param user
     *     Login of the user.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void putByOwnerRepoUser(String owner,
        String repo,
        String user,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/collaborators/{user}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{user}", ""+user));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestPut(url, headerProperties, null, Void.class);
    }

    /**
     * 
     * <p>
     * Remove collaborator.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param user
     *     Login of the user.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByOwnerRepoUser(String owner,
        String repo,
        String user,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/collaborators/{user}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{user}", ""+user));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
