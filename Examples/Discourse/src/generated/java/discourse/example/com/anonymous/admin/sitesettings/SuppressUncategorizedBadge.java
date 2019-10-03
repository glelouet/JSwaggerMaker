package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SuppressUncategorizedBadge
    extends DelegateTransfer<Anonymous>
{

    public SuppressUncategorizedBadge(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * suppress uncategorized badge
     * </p>
     * 
     * @param suppress_uncategorized_badge
     *     "Don't show the badge for uncategorized topics in topic lists."
     *     
     */
    public void put(boolean suppress_uncategorized_badge) {
        String url = ("https://discourse.example.com//admin/site_settings/suppress_uncategorized_badge");
        Map<String, Object> content = new HashMap<>();
        content.put("suppress_uncategorized_badge", (suppress_uncategorized_badge));
        requestPut(url, null, content, Void.class);
    }
}
