package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TitlePrettify
    extends DelegateTransfer<Anonymous>
{

    public TitlePrettify(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * title_prettify
     * </p>
     * 
     * @param title_prettify
     */
    public void put(boolean title_prettify) {
        String url = ("https://discourse.example.com//admin/site_settings/title_prettify");
        Map<String, Object> content = new HashMap<>();
        content.put("title_prettify", (title_prettify));
        requestPut(url, null, content, Void.class);
    }
}
