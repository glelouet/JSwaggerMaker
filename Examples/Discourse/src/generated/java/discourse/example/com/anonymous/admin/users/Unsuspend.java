package discourse.example.com.anonymous.admin.users;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Unsuspend
    extends DelegateTransfer<Anonymous>
{

    public Unsuspend(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Unsuspend a user
     * </p>
     * 
     * @param id
     */
    public void putById(long id) {
        String url = ("https://discourse.example.com//admin/users/{id}/unsuspend".replace("{id}", ""+id));
        requestPut(url, null, null, Void.class);
    }
}
