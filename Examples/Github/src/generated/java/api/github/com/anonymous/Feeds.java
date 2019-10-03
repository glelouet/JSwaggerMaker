package api.github.com.anonymous;

import java.util.HashMap;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Feeds
    extends DelegateTransfer<Anonymous>
{

    public Feeds(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List Feeds.
     * GitHub provides several timeline resources in Atom format. The Feeds API
     *  lists all the feeds available to the authenticating user.
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Feeds> get(String Accept) {
        String url = ("https://api.github.com//feeds");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Feeds.class);
    }
}
