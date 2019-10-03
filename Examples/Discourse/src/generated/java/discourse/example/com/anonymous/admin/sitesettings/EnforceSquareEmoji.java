package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnforceSquareEmoji
    extends DelegateTransfer<Anonymous>
{

    public EnforceSquareEmoji(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enforce square emoji
     * </p>
     * 
     * @param enforce_square_emoji
     */
    public void put(boolean enforce_square_emoji) {
        String url = ("https://discourse.example.com//admin/site_settings/enforce_square_emoji");
        Map<String, Object> content = new HashMap<>();
        content.put("enforce_square_emoji", (enforce_square_emoji));
        requestPut(url, null, content, Void.class);
    }
}
