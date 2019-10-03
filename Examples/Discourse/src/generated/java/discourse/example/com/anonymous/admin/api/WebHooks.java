package discourse.example.com.anonymous.admin.api;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class WebHooks
    extends DelegateTransfer<Anonymous>
{

    public WebHooks(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * create a web hook
     * </p>
     * 
     * @param payload_url
     * @param content_type
     * @param secret
     * @param wildcard_web_hook
     * @param verify_certificate
     * @param active
     * @param web_hook_event_type_ids
     * @param category_ids
     * @param group_ids
     */
    public Requested<Object> post(String payload_url,
        long content_type,
        String secret,
        boolean wildcard_web_hook,
        boolean verify_certificate,
        boolean active,
        Object[] web_hook_event_type_ids,
        Object[] category_ids,
        Object[] group_ids) {
        String url = ("https://discourse.example.com//admin/api/web_hooks");
        Map<String, Object> content = new HashMap<>();
        content.put("payload_url", payload_url);
        content.put("content_type", content_type);
        content.put("secret", secret);
        content.put("wildcard_web_hook", wildcard_web_hook);
        content.put("verify_certificate", verify_certificate);
        content.put("active", active);
        content.put("web_hook_event_type_ids", web_hook_event_type_ids);
        content.put("category_ids", category_ids);
        content.put("group_ids", group_ids);
        return requestPost(url, null, content, Object.class);
    }
}
