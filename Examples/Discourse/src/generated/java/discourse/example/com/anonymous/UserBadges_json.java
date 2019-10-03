package discourse.example.com.anonymous;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class UserBadges_json
    extends DelegateTransfer<Anonymous>
{

    public UserBadges_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * assign a badge to a user
     * </p>
     * 
     * @param username
     * @param badge_id
     * @param reason
     */
    public Requested<Object> post(String username, long badge_id, String reason) {
        String url = ("https://discourse.example.com//user_badges.json");
        Map<String, Object> content = new HashMap<>();
        content.put("username", username);
        content.put("badge_id", badge_id);
        content.put("reason", reason);
        return requestPost(url, null, content, Object.class);
    }
}
