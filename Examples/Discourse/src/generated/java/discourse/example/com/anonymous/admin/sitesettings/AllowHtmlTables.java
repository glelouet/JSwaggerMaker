package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowHtmlTables
    extends DelegateTransfer<Anonymous>
{

    public AllowHtmlTables(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * allow html tables
     * </p>
     * 
     * @param allow_html_tables
     */
    public void put(boolean allow_html_tables) {
        String url = ("https://discourse.example.com//admin/site_settings/allow_html_tables");
        Map<String, Object> content = new HashMap<>();
        content.put("allow_html_tables", (allow_html_tables));
        requestPut(url, null, content, Void.class);
    }
}
