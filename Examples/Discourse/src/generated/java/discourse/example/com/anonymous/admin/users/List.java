package discourse.example.com.anonymous.admin.users;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class List
    extends DelegateTransfer<Anonymous>
{

    public List(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Returns a list of users
     * </p>
     * 
     * @param flag
     * @param order
     * @param ascending
     *     optional. defaults to descending.
     *     
     * @param page
     * @param show_emails
     */
    public Requested<Object[]> getByFlag(discourse.example.com.structures.flag flag,
        discourse.example.com.structures.order order,
        Boolean ascending,
        Long page,
        Boolean show_emails) {
        String url = ("https://discourse.example.com//admin/users/list/{flag}.json".replace("{flag}", ""+flag)+"?"+(order==null?"":"&order="+flatten(order))+(ascending==null?"":"&ascending="+flatten(ascending))+(page==null?"":"&page="+flatten(page))+(show_emails==null?"":"&show_emails="+flatten(show_emails)));
        return requestGet(url, null, Object[].class);
    }
}
