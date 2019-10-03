package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EmailAccentFgColor
    extends DelegateTransfer<Anonymous>
{

    public EmailAccentFgColor(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * email accent fg color
     * </p>
     * 
     * @param email_accent_fg_color
     *     Enter a color name ('white') or hex value ('#FFFFFF').
     *     
     */
    public void put(String email_accent_fg_color) {
        String url = ("https://discourse.example.com//admin/site_settings/email_accent_fg_color");
        Map<String, Object> content = new HashMap<>();
        content.put("email_accent_fg_color", (email_accent_fg_color));
        requestPut(url, null, content, Void.class);
    }
}
