package api.github.com.anonymous.search;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.SearchCode;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Code
    extends DelegateTransfer<Anonymous>
{

    public Code(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Search code.
     * </p>
     * 
     * @param order
     *     The sort field. if sort param is provided. Can be either asc or desc.
     * @param q
     *     The search terms. This can be any combination of the supported code
     *     search parameters:
     *     'Search In' Qualifies which fields are searched. With this qualifier
     *     you can restrict the search to just the file contents, the file path,
     *     or both.
     *     'Languages' Searches code based on the language it's written in.
     *     'Forks' Filters repositories based on the number of forks, and/or
     *     whether code from forked repositories should be included in the results
     *     at all.
     *     'Size' Finds files that match a certain size (in bytes).
     *     'Path' Specifies the path that the resulting file must be at.
     *     'Extension' Matches files with a certain extension.
     *     'Users' or 'Repositories' Limits searches to a specific user or repository.
     *     
     * @param sort
     *     Can only be 'indexed', which indicates how recently a file has been indexed
     *     by the GitHub search infrastructure. If not provided, results are sorted
     *     by best match.
     *     
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<SearchCode> get(api.github.com.structures.order order,
        String q,
        api.github.com.structures.sort sort,
        String Accept) {
        String url = ("https://api.github.com//search/code"+"?"+(order==null?"":"&order="+flatten(order))+(q==null?"":"&q="+flatten(q))+(sort==null?"":"&sort="+flatten(sort)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, SearchCode.class);
    }
}
