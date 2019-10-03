package discourse.example.com.anonymous.admin.users;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Activate
    extends DelegateTransfer<Anonymous>
{

    public Activate(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Activate a user
     * </p>
     * 
     * @param id
     */
    public Requested<Object> putById(long id) {
        String url = ("https://discourse.example.com//admin/users/{id}/activate".replace("{id}", ""+id));
        return requestPut(url, null, null, Object.class);
    }
}
