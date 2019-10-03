package api.github.com.anonymous.repos.stats;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.ParticipationStats;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Participation
    extends DelegateTransfer<Anonymous>
{

    public Participation(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get the weekly commit count for the repo owner and everyone else.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<ParticipationStats> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/stats/participation".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, ParticipationStats.class);
    }
}
