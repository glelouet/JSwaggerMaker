package discourse.example.com.anonymous.admin.users;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Anonymize
    extends DelegateTransfer<Anonymous>
{

    public Anonymize(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Anonymize a user's account by changing their username and email address to random values. This is non-reversable
     * </p>
     * 
     * @param id
     */
    public Requested<Object> putById(long id) {
        String url = ("https://discourse.example.com//admin/users/{id}/anonymize".replace("{id}", ""+id));
        return requestPut(url, null, null, Object.class);
    }
}
