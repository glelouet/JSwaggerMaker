package api.github.com.anonymous.repos;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.CompareCommits;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Compare
    extends DelegateTransfer<Anonymous>
{

    public Compare(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Compare two commits
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param baseId
     * @param headId
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<CompareCommits> getByOwnerRepoBaseIdHeadId(String owner,
        String repo,
        String baseId,
        String headId,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/compare/{baseId}...{headId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{baseId}", ""+baseId).replace("{headId}", ""+headId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, CompareCommits.class);
    }
}
