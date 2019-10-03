package api.github.com.anonymous.repos;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.User;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Stargazers
    extends DelegateTransfer<Anonymous>
{

    public Stargazers(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List Stargazers.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<User[]> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/stargazers".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, User[].class);
    }
}
