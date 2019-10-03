package api.github.com.anonymous.repos;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.anonymous.repos.milestones.Labels;
import api.github.com.definitions.Milestone;
import api.github.com.definitions.MilestoneUpdate;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Milestones
    extends DelegateTransfer<Anonymous>
{
    public final Labels labels;

    public Milestones(Anonymous delegate) {
        super(delegate);
        labels = new Labels((delegate));
    }

    /**
     * 
     * <p>
     * List milestones for a repository.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param state
     *     String to filter by state.
     * @param direction
     *     Ignored without 'sort' parameter.
     * @param sort
     *     
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Milestone> getByOwnerRepo(String owner,
        String repo,
        api.github.com.structures.state state,
        String direction,
        api.github.com.structures.sort sort,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/milestones".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(state==null?"":"&state="+flatten(state))+(direction==null?"":"&direction="+flatten(direction))+(sort==null?"":"&sort="+flatten(sort)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Milestone.class);
    }

    /**
     * 
     * <p>
     * Create a milestone.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<Milestone> postByOwnerRepo(String owner,
        String repo,
        String Accept,
        MilestoneUpdate body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/milestones".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, Milestone.class);
    }

    /**
     * 
     * <p>
     * Get a single milestone.
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
    public Requested<Milestone> getByOwnerRepoNumber_(String owner,
        String repo,
        long number,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/milestones/{number}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Milestone.class);
    }

    /**
     * 
     * <p>
     * Delete a milestone.
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
    public void deleteByOwnerRepoNumber_(String owner,
        String repo,
        long number,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/milestones/{number}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
