package api.github.com.anonymous.user;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.User;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Following
    extends DelegateTransfer<Anonymous>
{

    public Following(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List who the authenticated user is following.
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<User[]> get(String Accept) {
        String url = ("https://api.github.com//user/following");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, User[].class);
    }

    /**
     * 
     * <p>
     * Check if you are following a user.
     * </p>
     * 
     * @param username
     *     Name of user.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void getByUsername(String username, String Accept) {
        String url = ("https://api.github.com//user/following/{username}".replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestGet(url, headerProperties, Void.class);
    }

    /**
     * 
     * <p>
     * Follow a user.
     * Following a user requires the user to be logged in and authenticated with
     * basic auth or OAuth with the user:follow scope.
     * </p>
     * 
     * @param username
     *     Name of user.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void putByUsername(String username, String Accept) {
        String url = ("https://api.github.com//user/following/{username}".replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestPut(url, headerProperties, null, Void.class);
    }

    /**
     * 
     * <p>
     * Unfollow a user.
     * Unfollowing a user requires the user to be logged in and authenticated with
     * basic auth or OAuth with the user:follow scope.
     * </p>
     * 
     * @param username
     *     Name of user.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByUsername(String username, String Accept) {
        String url = ("https://api.github.com//user/following/{username}".replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
