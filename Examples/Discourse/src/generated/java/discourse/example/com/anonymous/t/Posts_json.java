package discourse.example.com.anonymous.t;

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
     * Get specific posts in a topic. Used for infinite scrolling or pagination.
     * </p>
     * 
     * @param post_ids__
     *     post_ids can be found in the post_stream
     */
    public Requested<Object> getById(Long post_ids__) {
        String url = ("https://discourse.example.com//t/{id}/posts.json".replace("{post_ids__}", ""+post_ids__));
        return requestGet(url, null, Object.class);
    }
}
