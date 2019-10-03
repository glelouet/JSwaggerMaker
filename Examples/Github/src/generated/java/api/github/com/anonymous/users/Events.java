package api.github.com.anonymous.users;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.anonymous.users.events.Orgs;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Events
    extends DelegateTransfer<Anonymous>
{
    public final Orgs orgs;

    public Events(Anonymous delegate) {
        super(delegate);
        orgs = new Orgs((delegate));
    }

    /**
     * 
     * <p>
     * If you are authenticated as the given user, you will see your private events. Otherwise, you'll only see public events.
     * </p>
     * 
     * @param username
     *     Name of user.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void getByUsername(String username, String Accept) {
        String url = ("https://api.github.com//users/{username}/events".replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestGet(url, headerProperties, Void.class);
    }
}
