package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TagStyle
    extends DelegateTransfer<Anonymous>
{

    public TagStyle(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "tag style"
     * </p>
     * 
     * @param tag_style
     *     "Visual style for tag badges."
     *     
     */
    public void put(discourse.example.com.structures.tag_style tag_style) {
        String url = ("https://discourse.example.com//admin/site_settings/tag_style");
        Map<String, Object> content = new HashMap<>();
        content.put("tag_style", (tag_style));
        requestPut(url, null, content, Void.class);
    }
}
