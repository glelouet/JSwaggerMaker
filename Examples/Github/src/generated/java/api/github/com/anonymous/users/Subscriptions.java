package api.github.com.anonymous.users;

import java.util.HashMap;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Subscriptions
    extends DelegateTransfer<Anonymous>
{

    public Subscriptions(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List repositories being watched by a user.
     * </p>
     * 
     * @param username
     *     Name of user.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void getByUsername(String username, String Accept) {
        String url = ("https://api.github.com//users/{username}/subscriptions".replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestGet(url, headerProperties, Void.class);
    }
}
