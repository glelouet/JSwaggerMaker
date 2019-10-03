package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class LogMailProcessingFailures
    extends DelegateTransfer<Anonymous>
{

    public LogMailProcessingFailures(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * log mail processing failures
     * </p>
     * 
     * @param log_mail_processing_failures
     *     Log all email processing failures to http://yoursite.com/logs
     */
    public void put(boolean log_mail_processing_failures) {
        String url = ("https://discourse.example.com//admin/site_settings/log_mail_processing_failures");
        Map<String, Object> content = new HashMap<>();
        content.put("log_mail_processing_failures", (log_mail_processing_failures));
        requestPut(url, null, content, Void.class);
    }
}
