package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class PageViewTotalReqs
    extends DelegateTransfer<Anonymous>
{

    public PageViewTotalReqs(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * return pageview stats, defaults to one month
     * </p>
     * 
     * @param start_date
     * @param end_date
     * @param category_id
     * @param group_id
     */
    public Requested<Object> get(String start_date,
        String end_date,
        Long category_id,
        Long group_id) {
        String url = ("https://discourse.example.com//page_view_total_reqs"+"?"+(start_date==null?"":"&start_date="+flatten(start_date))+(end_date==null?"":"&end_date="+flatten(end_date))+(category_id==null?"":"&category_id="+flatten(category_id))+(group_id==null?"":"&group_id="+flatten(group_id)));
        return requestGet(url, null, Object.class);
    }
}
