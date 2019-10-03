package discourse.example.com.anonymous.admin;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Badges_json
    extends DelegateTransfer<Anonymous>
{

    public Badges_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * get a list of badges
     * </p>
     */
    public Requested<Object> get() {
        String url = ("https://discourse.example.com//admin/badges.json");
        return requestGet(url, null, Object.class);
    }

    /**
     * 
     * <p>
     * create a badge
     * </p>
     * 
     * @param allow_title
     * @param multiple_grant
     * @param listable
     * @param auto_revoke
     * @param enabled
     * @param show_posts
     * @param target_posts
     * @param name
     * @param description
     * @param long_description
     * @param icon
     * @param image
     * @param badge_grouping_id
     * @param badge_type_id
     */
    public void post(boolean allow_title,
        boolean multiple_grant,
        boolean listable,
        boolean auto_revoke,
        boolean enabled,
        boolean show_posts,
        boolean target_posts,
        String name,
        String description,
        String long_description,
        String icon,
        String image,
        long badge_grouping_id,
        long badge_type_id) {
        String url = ("https://discourse.example.com//admin/badges.json");
        Map<String, Object> content = new HashMap<>();
        content.put("allow_title", allow_title);
        content.put("multiple_grant", multiple_grant);
        content.put("listable", listable);
        content.put("auto_revoke", auto_revoke);
        content.put("enabled", enabled);
        content.put("show_posts", show_posts);
        content.put("target_posts", target_posts);
        content.put("name", name);
        content.put("description", description);
        content.put("long_description", long_description);
        content.put("icon", icon);
        content.put("image", image);
        content.put("badge_grouping_id", badge_grouping_id);
        content.put("badge_type_id", badge_type_id);
        requestPost(url, null, content, Void.class);
    }
}
