package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Pop3PollingPeriodMins
    extends DelegateTransfer<Anonymous>
{

    public Pop3PollingPeriodMins(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * pop3 polling period mins
     * </p>
     * 
     * @param pop3_polling_period_mins
     *     "The period in minutes between checking the POP3 account for email. NOTE: requires restart."
     *     
     */
    public void put(long pop3_polling_period_mins) {
        String url = ("https://discourse.example.com//admin/site_settings/pop3_polling_period_mins");
        Map<String, Object> content = new HashMap<>();
        content.put("pop3_polling_period_mins", (pop3_polling_period_mins));
        requestPut(url, null, content, Void.class);
    }
}
