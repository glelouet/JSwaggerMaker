package api.github.com.anonymous.orgs;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.PostRepo;
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
     * List repositories for the specified org.
     * </p>
     * 
     * @param org
     *     Name of organisation.
     * @param type
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Repo[]> getByOrg(String org, api.github.com.structures.type type, String Accept) {
        String url = ("https://api.github.com//orgs/{org}/repos".replace("{org}", ""+org)+"?"+(type==null?"":"&type="+flatten(type)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Repo[].class);
    }

    /**
     * 
     * <p>
     * Create a new repository for the authenticated user. OAuth users must supply
     * repo scope.
     * </p>
     * 
     * @param org
     *     Name of organisation.
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<Repo[]> postByOrg(String org, String Accept, PostRepo body) {
        String url = ("https://api.github.com//orgs/{org}/repos".replace("{org}", ""+org));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, Repo[].class);
    }
}
