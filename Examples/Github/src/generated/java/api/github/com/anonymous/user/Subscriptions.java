package api.github.com.anonymous.user;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.Repo;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Subscriptions
    extends DelegateTransfer<Anonymous>
{

    public Subscriptions(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List repositories being watched by the authenticated user.
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Repo[]> get(String Accept) {
        String url = ("https://api.github.com//user/subscriptions");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Repo[].class);
    }

    /**
     * 
     * <p>
     * Check if you are watching a repository.
     * </p>
     * 
     * @param owner
     *     Name of the owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//user/subscriptions/{owner}/{repo}".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestGet(url, headerProperties, Void.class);
    }

    /**
     * 
     * <p>
     * Watch a repository.
     * </p>
     * 
     * @param owner
     *     Name of the owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void putByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//user/subscriptions/{owner}/{repo}".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestPut(url, headerProperties, null, Void.class);
    }

    /**
     * 
     * <p>
     * Stop watching a repository
     * </p>
     * 
     * @param owner
     *     Name of the owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//user/subscriptions/{owner}/{repo}".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
