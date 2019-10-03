package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TopicPageTitleIncludesCategory
    extends DelegateTransfer<Anonymous>
{

    public TopicPageTitleIncludesCategory(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * topic page title includes category
     * </p>
     * 
     * @param topic_page_title_includes_category
     *     "Topic page title includes the category name."
     *     
     */
    public void put(boolean topic_page_title_includes_category) {
        String url = ("https://discourse.example.com//admin/site_settings/topic_page_title_includes_category");
        Map<String, Object> content = new HashMap<>();
        content.put("topic_page_title_includes_category", (topic_page_title_includes_category));
        requestPut(url, null, content, Void.class);
    }
}
