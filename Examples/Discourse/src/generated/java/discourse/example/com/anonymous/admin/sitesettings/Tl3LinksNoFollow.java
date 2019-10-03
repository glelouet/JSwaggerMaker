package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl3LinksNoFollow
    extends DelegateTransfer<Anonymous>
{

    public Tl3LinksNoFollow(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl3 links no follow
     * </p>
     * 
     * @param tl3_links_no_follow
     *     "Do not remove rel=nofollow from links posted by trust level 3 users."
     *     
     */
    public void put(boolean tl3_links_no_follow) {
        String url = ("https://discourse.example.com//admin/site_settings/tl3_links_no_follow");
        Map<String, Object> content = new HashMap<>();
        content.put("tl3_links_no_follow", (tl3_links_no_follow));
        requestPut(url, null, content, Void.class);
    }
}
