package api.github.com.anonymous.users.receivedevents;

import java.util.HashMap;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Public
    extends DelegateTransfer<Anonymous>
{

    public Public(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List public events that a user has received
     * </p>
     * 
     * @param username
     *     Name of user.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void getByUsername(String username, String Accept) {
        String url = ("https://api.github.com//users/{username}/received_events/public".replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestGet(url, headerProperties, Void.class);
    }
}
