package api.github.com.anonymous.search;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.SearchUsers;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Users
    extends DelegateTransfer<Anonymous>
{

    public Users(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Search users.
     * </p>
     * 
     * @param order
     *     The sort field. if sort param is provided. Can be either asc or desc.
     * @param q
     *     The search terms. This can be any combination of the supported user
     *     search parameters:
     *     'Search In' Qualifies which fields are searched. With this qualifier you
     *     can restrict the search to just the username, public email, full name,
     *     location, or any combination of these.
     *     'Repository count' Filters users based on the number of repositories they
     *     have.
     *     'Location' Filter users by the location indicated in their profile.
     *     'Language' Search for users that have repositories that match a certain
     *     language.
     *     'Created' Filter users based on when they joined.
     *     'Followers' Filter users based on the number of followers they have.
     *     
     * @param sort
     *     If not provided, results are sorted by best match.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<SearchUsers> get(api.github.com.structures.order order,
        String q,
        api.github.com.structures.sort sort,
        String Accept) {
        String url = ("https://api.github.com//search/users"+"?"+(order==null?"":"&order="+flatten(order))+(q==null?"":"&q="+flatten(q))+(sort==null?"":"&sort="+flatten(sort)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, SearchUsers.class);
    }
}
