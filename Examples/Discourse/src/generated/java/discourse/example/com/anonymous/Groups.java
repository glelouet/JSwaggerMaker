package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.groups.Members_json;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Groups
    extends DelegateTransfer<Anonymous>
{
    public final Members_json members_json;

    public Groups(Anonymous delegate) {
        super(delegate);
        members_json = new Members_json((delegate));
    }

    /**
     * 
     * <p>
     * Get a specific group
     * </p>
     */
    public Requested<Object> getByName() {
        String url = ("https://discourse.example.com//groups/{name}.json");
        return requestGet(url, null, Object.class);
    }

    /**
     * 
     * <p>
     * Update a group
     * </p>
     */
    public Requested<Object> putByName() {
        String url = ("https://discourse.example.com//groups/{name}.json");
        return requestPut(url, null, null, Object.class);
    }
}
