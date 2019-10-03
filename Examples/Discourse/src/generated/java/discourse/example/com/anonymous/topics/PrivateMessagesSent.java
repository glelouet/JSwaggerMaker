package discourse.example.com.anonymous.topics;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class PrivateMessagesSent
    extends DelegateTransfer<Anonymous>
{

    public PrivateMessagesSent(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get a list of private messages sent
     * </p>
     */
    public Requested<Object> getByUsername() {
        String url = ("https://discourse.example.com//topics/private-messages-sent/{username}.json");
        return requestGet(url, null, Object.class);
    }
}
