package api.github.com.anonymous.legacy.user;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.SearchUsersByKeyword;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Search
    extends DelegateTransfer<Anonymous>
{

    public Search(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Find users by keyword.
     * </p>
     * 
     * @param keyword
     *     The search term
     * @param order
     *     The sort field. if sort param is provided. Can be either asc or desc.
     * @param start_page
     *     The page number to fetch
     * @param sort
     *     The sort field. One of stars, forks, or updated. Default: results are sorted by best match.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<SearchUsersByKeyword> getByKeyword(String keyword,
        api.github.com.structures.order order,
        String start_page,
        api.github.com.structures.sort sort,
        String Accept) {
        String url = ("https://api.github.com//legacy/user/search/{keyword}".replace("{keyword}", ""+keyword)+"?"+(order==null?"":"&order="+flatten(order))+(start_page==null?"":"&start_page="+flatten(start_page))+(sort==null?"":"&sort="+flatten(sort)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, SearchUsersByKeyword.class);
    }
}
