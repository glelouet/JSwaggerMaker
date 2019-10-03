package api.github.com.anonymous.repos.stats;

import java.util.HashMap;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class CodeFrequency
    extends DelegateTransfer<Anonymous>
{

    public CodeFrequency(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get the number of additions and deletions per week.
     * Returns a weekly aggregate of the number of additions and deletions pushed
     * to a repository.
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
        String url = ("https://api.github.com//repos/{owner}/{repo}/stats/code_frequency".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, long[].class);
    }
}
