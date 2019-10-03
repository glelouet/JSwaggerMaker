package api.github.com.anonymous.repos.milestones;

import java.util.HashMap;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Labels
    extends DelegateTransfer<Anonymous>
{

    public Labels(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get labels for every issue in a milestone.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param number
     *     Number of milestone.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Labels[]> getByOwnerRepoNumber_(String owner,
        String repo,
        long number,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/milestones/{number}/labels".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Labels[].class);
    }
}
