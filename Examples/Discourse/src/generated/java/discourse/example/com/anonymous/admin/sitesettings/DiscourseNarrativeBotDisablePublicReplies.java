package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DiscourseNarrativeBotDisablePublicReplies
    extends DelegateTransfer<Anonymous>
{

    public DiscourseNarrativeBotDisablePublicReplies(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * discourse narrative bot disable public replies
     * </p>
     * 
     * @param discourse_narrative_bot_disable_public_replies
     *     Disable public replies by Discourse Narrative Bot
     *     
     */
    public void put(boolean discourse_narrative_bot_disable_public_replies) {
        String url = ("https://discourse.example.com//admin/site_settings/discourse_narrative_bot_disable_public_replies");
        Map<String, Object> content = new HashMap<>();
        content.put("discourse_narrative_bot_disable_public_replies", (discourse_narrative_bot_disable_public_replies));
        requestPut(url, null, content, Void.class);
    }
}
