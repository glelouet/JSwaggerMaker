package api.github.com.anonymous.users;

import java.util.HashMap;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Following
    extends DelegateTransfer<Anonymous>
{

    public Following(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Check if one user follows another.
     * </p>
     * 
     * @param username
     *     Name of user.
     * @param targetUser
     *     Name of user.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void getByUsernameTargetUser(String username, String targetUser, String Accept) {
        String url = ("https://api.github.com//users/{username}/following/{targetUser}".replace("{username}", ""+username).replace("{targetUser}", ""+targetUser));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestGet(url, headerProperties, Void.class);
    }
}
