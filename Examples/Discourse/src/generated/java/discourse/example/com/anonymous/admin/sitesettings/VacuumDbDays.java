package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class VacuumDbDays
    extends DelegateTransfer<Anonymous>
{

    public VacuumDbDays(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * vacuum db days
     * </p>
     * 
     * @param vacuum_db_days
     *     "Run VACUUM ANALYZE to reclaim DB space after migrations (set to 0 to disable)"
     *     
     */
    public void put(long vacuum_db_days) {
        String url = ("https://discourse.example.com//admin/site_settings/vacuum_db_days");
        Map<String, Object> content = new HashMap<>();
        content.put("vacuum_db_days", (vacuum_db_days));
        requestPut(url, null, content, Void.class);
    }
}
