package api.github.com.anonymous;

import java.util.HashMap;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class RateLimit
    extends DelegateTransfer<Anonymous>
{

    public RateLimit(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get your current rate limit status
     * Note: Accessing this endpoint does not count against your rate limit.
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.RateLimit> get(String Accept) {
        String url = ("https://api.github.com//rate_limit");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.RateLimit.class);
    }
}
