package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl3RequiresMaxFlagged
    extends DelegateTransfer<Anonymous>
{

    public Tl3RequiresMaxFlagged(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl3 requires max flagged
     * </p>
     * 
     * @param tl3_requires_max_flagged
     *     "User must not have had more than x posts flagged by x different users in the last (tl3 time period) days to qualify for promotion to trust level 3, where x is this setting's value. (0 or higher)"
     *     
     */
    public void put(long tl3_requires_max_flagged) {
        String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_max_flagged");
        Map<String, Object> content = new HashMap<>();
        content.put("tl3_requires_max_flagged", (tl3_requires_max_flagged));
        requestPut(url, null, content, Void.class);
    }
}
