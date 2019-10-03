package discourse.example.com.anonymous.admin.users;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class GenerateApiKey
    extends DelegateTransfer<Anonymous>
{

    public GenerateApiKey(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Generate/Regenerate api_key for a user
     * </p>
     * 
     * @param id
     */
    public Requested<Object> postById(long id) {
        String url = ("https://discourse.example.com//admin/users/{id}/generate_api_key".replace("{id}", ""+id));
        return requestPost(url, null, null, Object.class);
    }
}
