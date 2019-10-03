package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DiscourseNarrativeBotWelcomePostType
    extends DelegateTransfer<Anonymous>
{

    public DiscourseNarrativeBotWelcomePostType(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * discourse narrative bot welcome post type
     * </p>
     * 
     * @param discourse_narrative_bot_welcome_post_delay
     *     Type of welcome post that the Discourse Narrative Bot should send out
     *     
     */
    public void put(discourse.example.com.structures.discourse_narrative_bot_welcome_post_delay discourse_narrative_bot_welcome_post_delay) {
        String url = ("https://discourse.example.com//admin/site_settings/discourse_narrative_bot_welcome_post_type");
        Map<String, Object> content = new HashMap<>();
        content.put("discourse_narrative_bot_welcome_post_delay", (discourse_narrative_bot_welcome_post_delay));
        requestPut(url, null, content, Void.class);
    }
}
