package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class UserActions_json
    extends DelegateTransfer<Anonymous>
{

    public UserActions_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get a list of user actions
     * </p>
     * 
     * @param offset
     * @param username
     * @param filter
     */
    public Requested<Object> get(long offset, String username, long filter) {
        String url = ("https://discourse.example.com//user_actions.json"+"?"+"&offset="+flatten(offset)+(username==null?"":"&username="+flatten(username))+"&filter="+flatten(filter));
        return requestGet(url, null, Object.class);
    }
}
