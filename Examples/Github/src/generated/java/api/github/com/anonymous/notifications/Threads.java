package api.github.com.anonymous.notifications;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.anonymous.notifications.threads.Subscription;
import api.github.com.definitions.Notifications;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Threads
    extends DelegateTransfer<Anonymous>
{
    public final Subscription subscription;

    public Threads(Anonymous delegate) {
        super(delegate);
        subscription = new Subscription((delegate));
    }

    /**
     * 
     * <p>
     * View a single thread.
     * </p>
     * 
     * @param id
     *     Id of thread.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Notifications> getById(long id, String Accept) {
        String url = ("https://api.github.com//notifications/threads/{id}".replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Notifications.class);
    }
}
