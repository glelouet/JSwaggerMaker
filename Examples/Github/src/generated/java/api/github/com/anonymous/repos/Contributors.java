package api.github.com.anonymous.repos;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.User;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Contributors
    extends DelegateTransfer<Anonymous>
{

    public Contributors(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get list of contributors.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param anon
     *     Set to 1 or true to include anonymous contributors in results.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<User[]> getByOwnerRepo(String owner,
        String repo,
        String anon,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/contributors".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(anon==null?"":"&anon="+flatten(anon)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, User[].class);
    }
}
