package discourse.example.com.anonymous.admin;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Flags
    extends DelegateTransfer<Anonymous>
{

    public Flags(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * get a list of flags
     * </p>
     * 
     * @param type
     * @param offset
     */
    public Requested<Object> getByType(discourse.example.com.structures.type type, long offset) {
        String url = ("https://discourse.example.com//admin/flags/{type}.json".replace("{type}", ""+type).replace("{offset}", ""+offset));
        return requestGet(url, null, Object.class);
    }
}
