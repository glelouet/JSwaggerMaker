package api.github.com.anonymous.notifications.threads;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.PutSubscription;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Subscription
    extends DelegateTransfer<Anonymous>
{

    public Subscription(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get a Thread Subscription.
     * </p>
     * 
     * @param id
     *     Id of thread.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Subscription> getById(long id, String Accept) {
        String url = ("https://api.github.com//notifications/threads/{id}/subscription".replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Subscription.class);
    }

    /**
     * 
     * <p>
     * Set a Thread Subscription.
     * This lets you subscribe to a thread, or ignore it. Subscribing to a thread
     * is unnecessary if the user is already subscribed to the repository. Ignoring
     * a thread will mute all future notifications (until you comment or get @mentioned).
     * </p>
     * 
     * @param id
     *     Id of thread.
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<api.github.com.definitions.Subscription> putById(long id, String Accept, PutSubscription body) {
        String url = ("https://api.github.com//notifications/threads/{id}/subscription".replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", (body));
        return requestPut(url, headerProperties, content, api.github.com.definitions.Subscription.class);
    }

    /**
     * 
     * <p>
     * Delete a Thread Subscription.
     * </p>
     * 
     * @param id
     *     Id of thread.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteById(long id, String Accept) {
        String url = ("https://api.github.com//notifications/threads/{id}/subscription".replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
