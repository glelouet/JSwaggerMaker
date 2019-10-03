package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class QueueJobs
    extends DelegateTransfer<Anonymous>
{

    public QueueJobs(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * queue jobs
     * </p>
     * 
     * @param port
     *     "DEVELOPER ONLY! WARNING! By default, queue jobs in sidekiq. If disabled, your site will be broken."
     *     
     */
    public void put(boolean port) {
        String url = ("https://discourse.example.com//admin/site_settings/queue_jobs");
        Map<String, Object> content = new HashMap<>();
        content.put("port", (port));
        requestPut(url, null, content, Void.class);
    }
}
