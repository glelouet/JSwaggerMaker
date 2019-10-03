package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Notifications_json
    extends DelegateTransfer<Anonymous>
{

    public Notifications_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get notifications for the specified user
     * </p>
     * 
     * @param username
     */
    public Requested<Object> get(String username) {
        String url = ("https://discourse.example.com//notifications.json"+"?"+(username==null?"":"&username="+flatten(username)));
        return requestGet(url, null, Object.class);
    }
}
