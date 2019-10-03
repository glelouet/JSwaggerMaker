package api.github.com.anonymous.user;

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
     * List repositories for the authenticated user. Note that this does not include
     * repositories owned by organizations which the user can access. You can lis
     * user organizations and list organization repositories separately.
     * </p>
     * 
     * @param type
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Repo[]> get(api.github.com.structures.type type, String Accept) {
        String url = ("https://api.github.com//user/repos"+"?"+(type==null?"":"&type="+flatten(type)));
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
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<Repo[]> post(String Accept, PostRepo body) {
        String url = ("https://api.github.com//user/repos");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, Repo[].class);
    }
}
