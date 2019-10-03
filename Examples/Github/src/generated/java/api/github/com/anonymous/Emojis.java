package api.github.com.anonymous;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Emojis
    extends DelegateTransfer<Anonymous>
{

    public Emojis(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Lists all the emojis available to use on GitHub.
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Map<String, String>> get(String Accept) {
        String url = ("https://api.github.com//emojis");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGetMap(url, headerProperties, String.class);
    }
}
