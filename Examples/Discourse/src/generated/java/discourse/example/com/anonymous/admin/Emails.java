package discourse.example.com.anonymous.admin;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Emails
    extends DelegateTransfer<Anonymous>
{

    public Emails(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * get a list of emails
     * </p>
     * 
     * @param action
     * @param offset
     */
    public Requested<Object[]> getByAction(discourse.example.com.structures.action action, long offset) {
        String url = ("https://discourse.example.com//admin/emails/{action}.json".replace("{action}", ""+action).replace("{offset}", ""+offset));
        return requestGet(url, null, Object[].class);
    }
}
