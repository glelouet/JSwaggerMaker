package discourse.example.com.anonymous.u;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class ByExternal
    extends DelegateTransfer<Anonymous>
{

    public ByExternal(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get a single user by SSO external ID
     * </p>
     * 
     * @param external_id
     */
    public Requested<Object> getByExternalId(long external_id) {
        String url = ("https://discourse.example.com//u/by-external/{external_id}.json".replace("{external_id}", ""+external_id));
        return requestGet(url, null, Object.class);
    }
}
