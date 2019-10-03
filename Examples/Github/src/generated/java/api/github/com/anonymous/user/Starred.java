package api.github.com.anonymous.user;

import java.util.HashMap;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Starred
    extends DelegateTransfer<Anonymous>
{

    public Starred(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List repositories being starred by the authenticated user.
     * </p>
     * 
     * @param direction
     *     Ignored without 'sort' parameter.
     * @param sort
     *     
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Object[]> get(String direction, api.github.com.structures.sort sort, String Accept) {
        String url = ("https://api.github.com//user/starred"+"?"+(direction==null?"":"&direction="+flatten(direction))+(sort==null?"":"&sort="+flatten(sort)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Object[].class);
    }

    /**
     * 
     * <p>
     * Check if you are starring a repository.
     * </p>
     * 
     * @param owner
     *     Name of a repository owner.
     * @param repo
     *     Name of a repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//user/starred/{owner}/{repo}".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestGet(url, headerProperties, Void.class);
    }

    /**
     * 
     * <p>
     * Star a repository.
     * </p>
     * 
     * @param owner
     *     Name of a repository owner.
     * @param repo
     *     Name of a repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void putByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//user/starred/{owner}/{repo}".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestPut(url, headerProperties, null, Void.class);
    }

    /**
     * 
     * <p>
     * Unstar a repository
     * </p>
     * 
     * @param owner
     *     Name of a repository owner.
     * @param repo
     *     Name of a repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//user/starred/{owner}/{repo}".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
