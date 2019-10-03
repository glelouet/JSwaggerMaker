package api.github.com.anonymous.users;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.User;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Followers
    extends DelegateTransfer<Anonymous>
{

    public Followers(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List a user's followers
     * </p>
     * 
     * @param username
     *     Name of user.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<User[]> getByUsername(String username, String Accept) {
        String url = ("https://api.github.com//users/{username}/followers".replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, User[].class);
    }
}
