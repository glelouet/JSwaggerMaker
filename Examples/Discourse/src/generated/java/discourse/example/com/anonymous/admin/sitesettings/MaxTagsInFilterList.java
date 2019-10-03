package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxTagsInFilterList
    extends DelegateTransfer<Anonymous>
{

    public MaxTagsInFilterList(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "max tags in filter list"
     * </p>
     * 
     * @param max_tags_in_filter_list
     *     "Maximum number of tags to show in the filter dropdown. The most used tags will be shown."
     *     
     */
    public void put(long max_tags_in_filter_list) {
        String url = ("https://discourse.example.com//admin/site_settings/max_tags_in_filter_list");
        Map<String, Object> content = new HashMap<>();
        content.put("max_tags_in_filter_list", (max_tags_in_filter_list));
        requestPut(url, null, content, Void.class);
    }
}
