package api.github.com.anonymous.repos.stats;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.CommitActivityStats;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class CommitActivity
    extends DelegateTransfer<Anonymous>
{

    public CommitActivity(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get the last year of commit activity data.
     * Returns the last year of commit activity grouped by week. The days array
     * is a group of commits per day, starting on Sunday.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<CommitActivityStats[]> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/stats/commit_activity".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, CommitActivityStats[].class);
    }
}
