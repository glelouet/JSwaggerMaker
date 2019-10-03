package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SuppressOverlappingTagsInList
    extends DelegateTransfer<Anonymous>
{

    public SuppressOverlappingTagsInList(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "suppress overlapping tags in list"
     * </p>
     * 
     * @param suppress_overlapping_tags_in_list
     *     "If tags match exact words in topic titles, don't show the tag"
     *     
     */
    public void put(boolean suppress_overlapping_tags_in_list) {
        String url = ("https://discourse.example.com//admin/site_settings/suppress_overlapping_tags_in_list");
        Map<String, Object> content = new HashMap<>();
        content.put("suppress_overlapping_tags_in_list", (suppress_overlapping_tags_in_list));
        requestPut(url, null, content, Void.class);
    }
}
