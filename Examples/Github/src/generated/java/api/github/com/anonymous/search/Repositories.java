package api.github.com.anonymous.search;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.SearchRepositories;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Repositories
    extends DelegateTransfer<Anonymous>
{

    public Repositories(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Search repositories.
     * </p>
     * 
     * @param order
     *     The sort field. if sort param is provided. Can be either asc or desc.
     * @param q
     *     The search terms. This can be any combination of the supported repository
     *     search parameters:
     *     'Search In' Qualifies which fields are searched. With this qualifier you
     *     can restrict the search to just the repository name, description, readme,
     *     or any combination of these.
     *     'Size' Finds repositories that match a certain size (in kilobytes).
     *     'Forks' Filters repositories based on the number of forks, and/or whether
     *     forked repositories should be included in the results at all.
     *     'Created' and 'Last Updated' Filters repositories based on times of
     *     creation, or when they were last updated.
     *     'Users or Repositories' Limits searches to a specific user or repository.
     *     'Languages' Searches repositories based on the language they are written in.
     *     'Stars' Searches repositories based on the number of stars.
     *     
     * @param sort
     *     If not provided, results are sorted by best match.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<SearchRepositories> get(api.github.com.structures.order order,
        String q,
        api.github.com.structures.sort sort,
        String Accept) {
        String url = ("https://api.github.com//search/repositories"+"?"+(order==null?"":"&order="+flatten(order))+(q==null?"":"&q="+flatten(q))+(sort==null?"":"&sort="+flatten(sort)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, SearchRepositories.class);
    }
}
