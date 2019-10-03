package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DiscourseNarrativeBotWelcomePostDelay
    extends DelegateTransfer<Anonymous>
{

    public DiscourseNarrativeBotWelcomePostDelay(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * discourse narrative bot welcome post delay
     * </p>
     * 
     * @param discourse_narrative_bot_welcome_post_delay
     *     Wait (n) seconds before sending the Discourse Narrative Bot welcome post.
     *     
     */
    public void put(long discourse_narrative_bot_welcome_post_delay) {
        String url = ("https://discourse.example.com//admin/site_settings/discourse_narrative_bot_welcome_post_delay");
        Map<String, Object> content = new HashMap<>();
        content.put("discourse_narrative_bot_welcome_post_delay", (discourse_narrative_bot_welcome_post_delay));
        requestPut(url, null, content, Void.class);
    }
}
