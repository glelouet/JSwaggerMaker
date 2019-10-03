package api.github.com.anonymous.users;

import java.util.HashMap;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Orgs
    extends DelegateTransfer<Anonymous>
{

    public Orgs(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List all public organizations for a user.
     * </p>
     * 
     * @param username
     *     Name of user.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Object[]> getByUsername(String username, String Accept) {
        String url = ("https://api.github.com//users/{username}/orgs".replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Object[].class);
    }
}
