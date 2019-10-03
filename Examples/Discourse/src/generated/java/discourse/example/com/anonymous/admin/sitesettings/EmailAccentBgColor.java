package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EmailAccentBgColor
    extends DelegateTransfer<Anonymous>
{

    public EmailAccentBgColor(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * email accent bg color
     * </p>
     * 
     * @param email_accent_bg_color
     *     Enter a color name ('red') or hex value ('#FF000').
     *     
     */
    public void put(String email_accent_bg_color) {
        String url = ("https://discourse.example.com//admin/site_settings/email_accent_bg_color");
        Map<String, Object> content = new HashMap<>();
        content.put("email_accent_bg_color", (email_accent_bg_color));
        requestPut(url, null, content, Void.class);
    }
}
