package api.github.com.anonymous.repos;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.ForkBody;
import api.github.com.definitions.Repo;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Forks
    extends DelegateTransfer<Anonymous>
{

    public Forks(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List forks.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param sort
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Repo[]> getByOwnerRepo(String owner,
        String repo,
        api.github.com.structures.sort sort,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/forks".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(sort==null?"":"&sort="+flatten(sort)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Repo[].class);
    }

    /**
     * 
     * <p>
     * Create a fork.
     * Forking a Repository happens asynchronously. Therefore, you may have to wai
     * a short period before accessing the git objects. If this takes longer than 5
     * minutes, be sure to contact Support.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<Repo> postByOwnerRepo(String owner,
        String repo,
        String Accept,
        ForkBody body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/forks".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, Repo.class);
    }
}
