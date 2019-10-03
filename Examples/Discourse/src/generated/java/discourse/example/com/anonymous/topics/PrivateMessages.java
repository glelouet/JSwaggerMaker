package discourse.example.com.anonymous.topics;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class PrivateMessages
    extends DelegateTransfer<Anonymous>
{

    public PrivateMessages(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get a list of private messages for a user
     * </p>
     */
    public Requested<Object> getByUsername() {
        String url = ("https://discourse.example.com//topics/private-messages/{username}.json");
        return requestGet(url, null, Object.class);
    }
}
