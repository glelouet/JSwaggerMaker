package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class RemoveMutedTagsFromLatest
    extends DelegateTransfer<Anonymous>
{

    public RemoveMutedTagsFromLatest(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "remove muted tags from latest"
     * </p>
     * 
     * @param remove_muted_tags_from_latest
     *     "Don't show topics tagged with muted tags in the latest topic list."
     *     
     */
    public void put(boolean remove_muted_tags_from_latest) {
        String url = ("https://discourse.example.com//admin/site_settings/remove_muted_tags_from_latest");
        Map<String, Object> content = new HashMap<>();
        content.put("remove_muted_tags_from_latest", (remove_muted_tags_from_latest));
        requestPut(url, null, content, Void.class);
    }
}
