package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EmojiSet
    extends DelegateTransfer<Anonymous>
{

    public EmojiSet(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * emoji set
     * </p>
     * 
     * @param emoji_set
     */
    public void put(discourse.example.com.structures.emoji_set emoji_set) {
        String url = ("https://discourse.example.com//admin/site_settings/emoji_set");
        Map<String, Object> content = new HashMap<>();
        content.put("emoji_set", (emoji_set));
        requestPut(url, null, content, Void.class);
    }
}
