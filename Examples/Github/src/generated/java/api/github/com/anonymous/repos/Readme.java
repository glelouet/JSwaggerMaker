package api.github.com.anonymous.repos;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.ContentsPath;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Readme
    extends DelegateTransfer<Anonymous>
{

    public Readme(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get the README.
     * This method returns the preferred README for a repository.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param ref
     *     The String name of the Commit/Branch/Tag. Defaults to master.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<ContentsPath> getByOwnerRepo(String owner,
        String repo,
        String ref,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/readme".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(ref==null?"":"&ref="+flatten(ref)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, ContentsPath.class);
    }
}
