package api.github.com.anonymous;

import java.util.HashMap;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Meta
    extends DelegateTransfer<Anonymous>
{

    public Meta(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * This gives some information about GitHub.com, the service.
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Meta> get(String Accept) {
        String url = ("https://api.github.com//meta");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Meta.class);
    }
}
