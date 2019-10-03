package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxTopicInvitationsPerDay
    extends DelegateTransfer<Anonymous>
{

    public MaxTopicInvitationsPerDay(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max topic invitations per day
     * </p>
     * 
     * @param max_topic_invitations_per_day
     *     "Maximum number of topic invitations a user can send per day."
     *     
     */
    public void put(long max_topic_invitations_per_day) {
        String url = ("https://discourse.example.com//admin/site_settings/max_topic_invitations_per_day");
        Map<String, Object> content = new HashMap<>();
        content.put("max_topic_invitations_per_day", (max_topic_invitations_per_day));
        requestPut(url, null, content, Void.class);
    }
}
