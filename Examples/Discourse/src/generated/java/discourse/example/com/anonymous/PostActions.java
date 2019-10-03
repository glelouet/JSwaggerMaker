package discourse.example.com.anonymous;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PostActions
    extends DelegateTransfer<Anonymous>
{

    public PostActions(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Like a post and other actions
     * </p>
     * 
     * @param id
     * @param post_action_type_id
     * @param flag_topic
     */
    public void post(long id, long post_action_type_id, boolean flag_topic) {
        String url = ("https://discourse.example.com//post_actions");
        Map<String, Object> content = new HashMap<>();
        content.put("id", id);
        content.put("post_action_type_id", post_action_type_id);
        content.put("flag_topic", flag_topic);
        requestPost(url, null, content, Void.class);
    }

    /**
     * 
     * <p>
     * Un-like a post
     * </p>
     * 
     * @param id
     * @param post_action_type_id
     */
    public void deleteById(long id, long post_action_type_id) {
        String url = ("https://discourse.example.com//post_actions/{id}".replace("{id}", ""+id));
        requestDel(url, null, Void.class);
    }
}
