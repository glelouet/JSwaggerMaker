package api.github.com.anonymous.user;

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
     * List the authenticated user's followers
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<User[]> get(String Accept) {
        String url = ("https://api.github.com//user/followers");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, User[].class);
    }
}
