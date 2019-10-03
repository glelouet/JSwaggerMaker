package api.github.com.anonymous.repos.stats;

import java.util.HashMap;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class PunchCard
    extends DelegateTransfer<Anonymous>
{

    public PunchCard(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get the number of commits per hour in each day.
     * Each array contains the day number, hour number, and number of commits
     *  0-6 Sunday - Saturday
     *  0-23 Hour of day
     * Number of commits
     * For example, [2, 14, 25] indicates that there were 25 total commits, during
     * the 2.00pm hour on Tuesdays. All times are based on the time zone of
     * individual commits.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<long[]> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/stats/punch_card".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, long[].class);
    }
}
