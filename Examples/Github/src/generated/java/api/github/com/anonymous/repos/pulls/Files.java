package api.github.com.anonymous.repos.pulls;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.Pulls;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Files
    extends DelegateTransfer<Anonymous>
{

    public Files(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List pull requests files.
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
    public Requested<Pulls[]> getByOwnerRepoNumber_(String owner,
        String repo,
        long number,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/pulls/{number}/files".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Pulls[].class);
    }
}
