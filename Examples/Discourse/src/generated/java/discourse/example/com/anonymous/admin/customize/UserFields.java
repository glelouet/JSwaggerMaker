package discourse.example.com.anonymous.admin.customize;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class UserFields
    extends DelegateTransfer<Anonymous>
{

    public UserFields(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * delete a user field
     * </p>
     * 
     * @param id
     */
    public Requested<Object> deleteById(long id) {
        String url = ("https://discourse.example.com//admin/customize/user_fields/{id}".replace("{id}", ""+id));
        return requestDel(url, null, Object.class);
    }
}
