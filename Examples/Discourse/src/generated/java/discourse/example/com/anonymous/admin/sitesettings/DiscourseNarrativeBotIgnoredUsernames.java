package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DiscourseNarrativeBotIgnoredUsernames
    extends DelegateTransfer<Anonymous>
{

    public DiscourseNarrativeBotIgnoredUsernames(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * discourse narrative bot ignored usernames
     * </p>
     * 
     * @param discourse_narrative_bot_ignored_usernames
     *     Usernames that the Discourse Narrative Bot should ignore. Pipe delimited.
     *     
     */
    public void put(boolean discourse_narrative_bot_ignored_usernames) {
        String url = ("https://discourse.example.com//admin/site_settings/discourse_narrative_bot_ignored_usernames");
        Map<String, Object> content = new HashMap<>();
        content.put("discourse_narrative_bot_ignored_usernames", (discourse_narrative_bot_ignored_usernames));
        requestPut(url, null, content, Void.class);
    }
}
