package api.github.com.anonymous;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.Repo;
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
     * List all public repositories.
     * This provides a dump of every public repository, in the order that they
     * were created.
     * Note: Pagination is powered exclusively by the since parameter. is the
     * Link header to get the URL for the next page of repositories.
     * </p>
     * 
     * @param since
     *     The time should be passed in as UTC in the ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
     *     Example: "2012-10-09T23:39:01Z".
     *     
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Repo[]> get(String since, String Accept) {
        String url = ("https://api.github.com//repositories"+"?"+(since==null?"":"&since="+flatten(since)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Repo[].class);
    }
}
