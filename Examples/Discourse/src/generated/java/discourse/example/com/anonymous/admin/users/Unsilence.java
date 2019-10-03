package discourse.example.com.anonymous.admin.users;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Unsilence
    extends DelegateTransfer<Anonymous>
{

    public Unsilence(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Unsilence a user
     * </p>
     * 
     * @param id
     */
    public Requested<Object> putById(long id) {
        String url = ("https://discourse.example.com//admin/users/{id}/unsilence".replace("{id}", ""+id));
        return requestPut(url, null, null, Object.class);
    }
}
