package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ShowCreateTopicsNotice
    extends DelegateTransfer<Anonymous>
{

    public ShowCreateTopicsNotice(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * show create topics notice
     * </p>
     * 
     * @param show_create_topics_notice
     *     "If the site has fewer than 5 public topics, show a notice asking admins to create some topics."
     *     
     */
    public void put(boolean show_create_topics_notice) {
        String url = ("https://discourse.example.com//admin/site_settings/show_create_topics_notice");
        Map<String, Object> content = new HashMap<>();
        content.put("show_create_topics_notice", (show_create_topics_notice));
        requestPut(url, null, content, Void.class);
    }
}
