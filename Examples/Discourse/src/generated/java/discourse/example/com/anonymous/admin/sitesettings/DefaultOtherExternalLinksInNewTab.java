package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultOtherExternalLinksInNewTab
    extends DelegateTransfer<Anonymous>
{

    public DefaultOtherExternalLinksInNewTab(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default other external links in new tab"
     * </p>
     * 
     * @param default_other_external_links_in_new_tab
     *     "Open external links in a new tab by default."
     *     
     */
    public void put(boolean default_other_external_links_in_new_tab) {
        String url = ("https://discourse.example.com//admin/site_settings/default_other_external_links_in_new_tab");
        Map<String, Object> content = new HashMap<>();
        content.put("default_other_external_links_in_new_tab", (default_other_external_links_in_new_tab));
        requestPut(url, null, content, Void.class);
    }
}
