package api.github.com.anonymous.users;

import java.util.HashMap;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Gists
    extends DelegateTransfer<Anonymous>
{

    public Gists(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List a users gists.
     * </p>
     * 
     * @param username
     *     Name of user.
     * @param since
     *     The time should be passed in as UTC in the ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
     *     Example: "2012-10-09T23:39:01Z".
     *     
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Gists[]> getByUsername(String username, String since, String Accept) {
        String url = ("https://api.github.com//users/{username}/gists".replace("{username}", ""+username)+"?"+(since==null?"":"&since="+flatten(since)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Gists[].class);
    }
}
