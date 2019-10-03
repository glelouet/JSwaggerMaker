package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TagsSortAlphabetically
    extends DelegateTransfer<Anonymous>
{

    public TagsSortAlphabetically(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "tags sort alphabetically"
     * </p>
     * 
     * @param tags_sort_alphabetically
     *     "Show tags in alphabetical order. Default is to show in order of popularity."
     *     
     */
    public void put(boolean tags_sort_alphabetically) {
        String url = ("https://discourse.example.com//admin/site_settings/tags_sort_alphabetically");
        Map<String, Object> content = new HashMap<>();
        content.put("tags_sort_alphabetically", (tags_sort_alphabetically));
        requestPut(url, null, content, Void.class);
    }
}
