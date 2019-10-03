package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AutoRespondToFlagActions
    extends DelegateTransfer<Anonymous>
{

    public AutoRespondToFlagActions(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * auto respond to flag actions
     * </p>
     * 
     * @param auto_respond_to_flag_actions
     *     "Enable automatic reply when disposing a flag."
     *     
     */
    public void put(boolean auto_respond_to_flag_actions) {
        String url = ("https://discourse.example.com//admin/site_settings/auto_respond_to_flag_actions");
        Map<String, Object> content = new HashMap<>();
        content.put("auto_respond_to_flag_actions", (auto_respond_to_flag_actions));
        requestPut(url, null, content, Void.class);
    }
}
