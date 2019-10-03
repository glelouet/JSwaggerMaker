package api.github.com.anonymous;

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
     * List public events.
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Event[]> get(String Accept) {
        String url = ("https://api.github.com//events");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Event[].class);
    }
}
