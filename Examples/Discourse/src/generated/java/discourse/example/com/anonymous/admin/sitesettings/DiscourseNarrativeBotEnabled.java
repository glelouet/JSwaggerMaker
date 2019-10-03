package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DiscourseNarrativeBotEnabled
    extends DelegateTransfer<Anonymous>
{

    public DiscourseNarrativeBotEnabled(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enable discourse narrative bot
     * </p>
     * 
     * @param discourse_narrative_bot_enabled
     *     Enable Discourse Narrative Bot
     *     
     */
    public void put(boolean discourse_narrative_bot_enabled) {
        String url = ("https://discourse.example.com//admin/site_settings/discourse_narrative_bot_enabled");
        Map<String, Object> content = new HashMap<>();
        content.put("discourse_narrative_bot_enabled", (discourse_narrative_bot_enabled));
        requestPut(url, null, content, Void.class);
    }
}
