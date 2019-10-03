package api.github.com.anonymous.users.events;

import java.util.HashMap;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Orgs
    extends DelegateTransfer<Anonymous>
{

    public Orgs(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * This is the user's organization dashboard. You must be authenticated as the user to view this.
     * </p>
     * 
     * @param username
     *     Name of user.
     * @param org
     * @param Accept
     *     Is used to set specified media type.
     */
    public void getByUsernameOrg(String username, String org, String Accept) {
        String url = ("https://api.github.com//users/{username}/events/orgs/{org}".replace("{username}", ""+username).replace("{org}", ""+org));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestGet(url, headerProperties, Void.class);
    }
}
