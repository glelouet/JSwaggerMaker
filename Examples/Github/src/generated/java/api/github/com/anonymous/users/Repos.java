package api.github.com.anonymous.users;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.Repo;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Repos
    extends DelegateTransfer<Anonymous>
{

    public Repos(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List public repositories for the specified user.
     * </p>
     * 
     * @param username
     *     Name of user.
     * @param type
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Repo[]> getByUsername(String username, api.github.com.structures.type type, String Accept) {
        String url = ("https://api.github.com//users/{username}/repos".replace("{username}", ""+username)+"?"+(type==null?"":"&type="+flatten(type)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Repo[].class);
    }
}
