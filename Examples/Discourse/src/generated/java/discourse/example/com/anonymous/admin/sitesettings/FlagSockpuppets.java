package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class FlagSockpuppets
    extends DelegateTransfer<Anonymous>
{

    public FlagSockpuppets(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * flag sockpuppets
     * </p>
     * 
     * @param flag_sockpuppets
     *     "If a new user replies to a topic from the same IP address as the new user who started the topic, flag both of their posts as potential spam."
     *     
     */
    public void put(boolean flag_sockpuppets) {
        String url = ("https://discourse.example.com//admin/site_settings/flag_sockpuppets");
        Map<String, Object> content = new HashMap<>();
        content.put("flag_sockpuppets", (flag_sockpuppets));
        requestPut(url, null, content, Void.class);
    }
}
