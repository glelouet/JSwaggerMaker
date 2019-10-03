package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinBanEntriesForRollUp
    extends DelegateTransfer<Anonymous>
{

    public MinBanEntriesForRollUp(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * min ban entries for roll up
     * </p>
     * 
     * @param min_ban_entries_for_roll_up
     *     "When clicking the Roll up button, will create a new subnet ban entry if there are at least (N) entries."
     *     
     */
    public void put(long min_ban_entries_for_roll_up) {
        String url = ("https://discourse.example.com//admin/site_settings/min_ban_entries_for_roll_up");
        Map<String, Object> content = new HashMap<>();
        content.put("min_ban_entries_for_roll_up", (min_ban_entries_for_roll_up));
        requestPut(url, null, content, Void.class);
    }
}
