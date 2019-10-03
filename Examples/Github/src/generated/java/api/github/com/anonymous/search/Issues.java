package api.github.com.anonymous.search;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.SearchIssues;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Issues
    extends DelegateTransfer<Anonymous>
{

    public Issues(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Find issues by state and keyword. (This method returns up to 100 results per page.)
     * </p>
     * 
     * @param order
     *     The sort field. if sort param is provided. Can be either asc or desc.
     * @param q
     *     The q search term can also contain any combination of the supported issue search qualifiers:
     * @param sort
     *     The sort field. Can be comments, created, or updated. Default: results are sorted by best match.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<SearchIssues> get(api.github.com.structures.order order,
        String q,
        api.github.com.structures.sort sort,
        String Accept) {
        String url = ("https://api.github.com//search/issues"+"?"+(order==null?"":"&order="+flatten(order))+(q==null?"":"&q="+flatten(q))+(sort==null?"":"&sort="+flatten(sort)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, SearchIssues.class);
    }
}
