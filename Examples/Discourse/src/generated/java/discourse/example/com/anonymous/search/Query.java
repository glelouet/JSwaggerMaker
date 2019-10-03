package discourse.example.com.anonymous.search;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Query
    extends DelegateTransfer<Anonymous>
{

    public Query(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Search for something
     * </p>
     * 
     * @param term
     * @param include_blurbs
     */
    public Requested<Object> get(String term, Boolean include_blurbs) {
        String url = ("https://discourse.example.com//search/query".replace("{term}", ""+term).replace("{include_blurbs}", ""+include_blurbs));
        return requestGet(url, null, Object.class);
    }
}
