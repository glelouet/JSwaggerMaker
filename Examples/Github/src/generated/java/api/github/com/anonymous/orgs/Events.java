package api.github.com.anonymous.orgs;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.Event;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Events
    extends DelegateTransfer<Anonymous>
{

    public Events(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List public events for an organization.
     * </p>
     * 
     * @param org
     *     Name of organisation.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Event[]> getByOrg(String org, String Accept) {
        String url = ("https://api.github.com//orgs/{org}/events".replace("{org}", ""+org));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Event[].class);
    }
}
