package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DisableDiscourseNarrativeBotWelcomePost
    extends DelegateTransfer<Anonymous>
{

    public DisableDiscourseNarrativeBotWelcomePost(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * disable discourse narrative bot welcome post
     * </p>
     * 
     * @param disable_discourse_narrative_bot_welcome_post
     *     disable discourse narrative bot welcome post
     *     
     */
    public void put(boolean disable_discourse_narrative_bot_welcome_post) {
        String url = ("https://discourse.example.com//admin/site_settings/disable_discourse_narrative_bot_welcome_post");
        Map<String, Object> content = new HashMap<>();
        content.put("disable_discourse_narrative_bot_welcome_post", (disable_discourse_narrative_bot_welcome_post));
        requestPut(url, null, content, Void.class);
    }
}
