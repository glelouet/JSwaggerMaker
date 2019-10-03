package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TitleFancyEntities
    extends DelegateTransfer<Anonymous>
{

    public TitleFancyEntities(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * title fancy entities
     * </p>
     * 
     * @param title_fancy_entities
     */
    public void put(boolean title_fancy_entities) {
        String url = ("https://discourse.example.com//admin/site_settings/title_fancy_entities");
        Map<String, Object> content = new HashMap<>();
        content.put("title_fancy_entities", (title_fancy_entities));
        requestPut(url, null, content, Void.class);
    }
}
