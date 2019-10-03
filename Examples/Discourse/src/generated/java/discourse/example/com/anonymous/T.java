package discourse.example.com.anonymous;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.t.Bookmark;
import discourse.example.com.anonymous.t.ChangeTimestamp;
import discourse.example.com.anonymous.t.Invite;
import discourse.example.com.anonymous.t.Notifications;
import discourse.example.com.anonymous.t.Posts_json;
import discourse.example.com.anonymous.t.Status;
import discourse.example.com.anonymous.t.Timer;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class T
    extends DelegateTransfer<Anonymous>
{
    public final Posts_json posts_json;
    public final Invite invite;
    public final Bookmark bookmark;
    public final Status status;
    public final Timer timer;
    public final ChangeTimestamp change_timestamp;
    public final Notifications notifications;

    public T(Anonymous delegate) {
        super(delegate);
        posts_json = new Posts_json((delegate));
        invite = new Invite((delegate));
        bookmark = new Bookmark((delegate));
        status = new Status((delegate));
        timer = new Timer((delegate));
        change_timestamp = new ChangeTimestamp((delegate));
        notifications = new Notifications((delegate));
    }

    /**
     * 
     * <p>
     * Get a single topic
     * </p>
     * 
     * @param id
     * @param print
     *     Will return up to 1000 posts in a topic
     */
    public Requested<Object> getById(long id, Boolean print) {
        String url = ("https://discourse.example.com//t/{id}.json".replace("{id}", ""+id)+"?"+(print==null?"":"&print="+flatten(print)));
        return requestGet(url, null, Object.class);
    }

    /**
     * 
     * <p>
     * Remove a single topic
     * </p>
     * 
     * @param id
     */
    public void deleteById(long id) {
        String url = ("https://discourse.example.com//t/{id}.json".replace("{id}", ""+id));
        requestDel(url, null, Void.class);
    }

    /**
     * 
     * <p>
     * Update a single topic
     * </p>
     * 
     * @param slug
     *     ProTip: You can just use a `-` instead of the actual slug and the topic will be found by the id.
     * @param id
     * @param title
     * @param category_id
     */
    public Requested<Object> putBySlugId(String slug,
        long id,
        String title,
        long category_id) {
        String url = ("https://discourse.example.com//t/{slug}/{id}.json".replace("{slug}", ""+slug).replace("{id}", ""+id));
        Map<String, Object> content = new HashMap<>();
        content.put("title", (title));
        content.put("category_id", (category_id));
        return requestPut(url, null, content, Object.class);
    }
}
