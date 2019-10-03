package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class C
    extends DelegateTransfer<Anonymous>
{

    public C(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get a list of topics in the specified category
     * </p>
     * 
     * @param id
     * @param page
     */
    public Requested<Object> getById(long id, Long page) {
        String url = ("https://discourse.example.com//c/{id}.json".replace("{id}", ""+id)+"?"+(page==null?"":"&page="+flatten(page)));
        return requestGet(url, null, Object.class);
    }
}
