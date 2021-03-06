package api.github.com.anonymous.gists;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.Gists;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Public
    extends DelegateTransfer<Anonymous>
{

    public Public(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List all public gists.
     * </p>
     * 
     * @param since
     *     Timestamp in ISO 8601 format YYYY-MM-DDTHH:MM:SSZ.
     *     Only gists updated at or after this time are returned.
     *     
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Gists[]> get(String since, String Accept) {
        String url = ("https://api.github.com//gists/public"+"?"+(since==null?"":"&since="+flatten(since)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Gists[].class);
    }
}
