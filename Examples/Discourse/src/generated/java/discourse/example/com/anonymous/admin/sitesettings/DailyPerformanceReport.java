package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DailyPerformanceReport
    extends DelegateTransfer<Anonymous>
{

    public DailyPerformanceReport(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "daily performance report"
     * </p>
     * 
     * @param daily_performance_report
     *     "Analyze NGINX logs daily and post a Staff Only topic with details"
     *     
     */
    public void put(boolean daily_performance_report) {
        String url = ("https://discourse.example.com//admin/site_settings/daily_performance_report");
        Map<String, Object> content = new HashMap<>();
        content.put("daily_performance_report", (daily_performance_report));
        requestPut(url, null, content, Void.class);
    }
}
