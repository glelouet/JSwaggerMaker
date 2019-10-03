package api.github.com.anonymous.user;

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
     * List public and private organizations for the authenticated user.
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Object[]> get(String Accept) {
        String url = ("https://api.github.com//user/orgs");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Object[].class);
    }
}
