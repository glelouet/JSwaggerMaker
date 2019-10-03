package api.github.com.anonymous.repos.stats;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.ContributorsStats;
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
     * Get contributors list with additions, deletions, and commit counts.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<ContributorsStats[]> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/stats/contributors".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, ContributorsStats[].class);
    }
}
