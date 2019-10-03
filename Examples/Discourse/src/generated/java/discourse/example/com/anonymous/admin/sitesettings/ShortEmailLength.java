package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ShortEmailLength
    extends DelegateTransfer<Anonymous>
{

    public ShortEmailLength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * short email length
     * </p>
     * 
     * @param short_email_length
     *     Short email length in Bytes
     */
    public void put(long short_email_length) {
        String url = ("https://discourse.example.com//admin/site_settings/short_email_length");
        Map<String, Object> content = new HashMap<>();
        content.put("short_email_length", (short_email_length));
        requestPut(url, null, content, Void.class);
    }
}
