package api.github.com.anonymous.repos;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.Branch;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Branches
    extends DelegateTransfer<Anonymous>
{

    public Branches(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get list of branches
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Branches[]> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/branches".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Branches[].class);
    }

    /**
     * 
     * <p>
     * Get Branch
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param branch
     *     Name of the branch.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Branch> getByOwnerRepoBranch(String owner,
        String repo,
        String branch,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/branches/{branch}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{branch}", ""+branch));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Branch.class);
    }
}
