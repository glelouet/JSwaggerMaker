package discourse.example.com.anonymous;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.posts.Locked;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Posts
    extends DelegateTransfer<Anonymous>
{
    public final Locked locked;

    public Posts(Anonymous delegate) {
        super(delegate);
        locked = new Locked((delegate));
    }

    /**
     * 
     * <p>
     * Get a single post
     * </p>
     * 
     * @param id
     */
    public Requested<Object> getById(long id) {
        String url = ("https://discourse.example.com//posts/{id}.json".replace("{id}", ""+id));
        return requestGet(url, null, Object.class);
    }

    /**
     * 
     * <p>
     * Update a single post
     * </p>
     * 
     * @param id
     * @param post_raw_
     * @param post_raw_old_
     * @param post_edit_reason_
     * @param post_cooked_
     */
    public Requested<Object> putById(long id,
        String post_raw_,
        String post_raw_old_,
        String post_edit_reason_,
        String post_cooked_) {
        String url = ("https://discourse.example.com//posts/{id}.json".replace("{id}", ""+id));
        Map<String, Object> content = new HashMap<>();
        content.put("post_raw_", (post_raw_));
        content.put("post_raw_old_", (post_raw_old_));
        content.put("post_edit_reason_", (post_edit_reason_));
        content.put("post_cooked_", (post_cooked_));
        return requestPut(url, null, content, Object.class);
    }
}
