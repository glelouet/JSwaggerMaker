package discourse.example.com.anonymous;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Posts_json
    extends DelegateTransfer<Anonymous>
{

    public Posts_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get a list of the latest posts across topics
     * </p>
     * 
     * @param before
     */
    public Requested<Object> get(Long before) {
        String url = ("https://discourse.example.com//posts.json".replace("{before}", ""+before));
        return requestGet(url, null, Object.class);
    }

    /**
     * 
     * <p>
     * Create a new topic, a new post, or a private message
     * </p>
     * 
     * @param title
     *     required if creating a new topic or new private message
     *     
     * @param topic_id
     *     required if creating a new post
     * @param raw
     * @param category
     *     optional if creating a new topic,
     *     ignored if creating a new post
     *     
     * @param target_usernames
     *     required for private message, comma separated
     *     
     * @param archetype
     *     required for private message
     *     
     * @param created_at
     *     pick a date other than the default current time
     *     
     */
    public Requested<Object> post(String title,
        long topic_id,
        String raw,
        long category,
        String target_usernames,
        discourse.example.com.structures.archetype archetype,
        String created_at) {
        String url = ("https://discourse.example.com//posts.json");
        Map<String, Object> content = new HashMap<>();
        content.put("title", title);
        content.put("topic_id", topic_id);
        content.put("raw", raw);
        content.put("category", category);
        content.put("target_usernames", target_usernames);
        content.put("archetype", archetype);
        content.put("created_at", created_at);
        return requestPost(url, null, content, Object.class);
    }
}
