package api.github.com.anonymous.repos.pulls;

import java.util.HashMap;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Commits
    extends DelegateTransfer<Anonymous>
{

    public Commits(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List commits on a pull request.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param number
     *     Id of pull.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Commits[]> getByOwnerRepoNumber_(String owner,
        String repo,
        long number,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/pulls/{number}/commits".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Commits[].class);
    }
}
