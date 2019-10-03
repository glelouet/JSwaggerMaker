package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class CategoriesTopics
    extends DelegateTransfer<Anonymous>
{

    public CategoriesTopics(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the number of topics to show
     * </p>
     * 
     * @param categories_topics
     */
    public void put(long categories_topics) {
        String url = ("https://discourse.example.com//admin/site_settings/categories_topics");
        Map<String, Object> content = new HashMap<>();
        content.put("categories_topics", (categories_topics));
        requestPut(url, null, content, Void.class);
    }
}
