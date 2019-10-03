package discourse.example.com.anonymous.admin.users;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class LogOut
    extends DelegateTransfer<Anonymous>
{

    public LogOut(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Log a user out
     * </p>
     * 
     * @param id
     */
    public Requested<Object> postById(Object id) {
        String url = ("https://discourse.example.com//admin/users/{id}/log_out".replace("{id}", ""+id));
        return requestPost(url, null, null, Object.class);
    }
}
