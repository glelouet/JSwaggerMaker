package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultCategoriesWatchingFirstPost
    extends DelegateTransfer<Anonymous>
{

    public DefaultCategoriesWatchingFirstPost(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default categories watching first post"
     * </p>
     * 
     * @param default_categories_watching_first_post
     *     "Pipe delimited category id's. List of categories in which first post in each new topic will be watched by default."
     *     
     */
    public void put(String default_categories_watching_first_post) {
        String url = ("https://discourse.example.com//admin/site_settings/default_categories_watching_first_post");
        Map<String, Object> content = new HashMap<>();
        content.put("default_categories_watching_first_post", (default_categories_watching_first_post));
        requestPut(url, null, content, Void.class);
    }
}
