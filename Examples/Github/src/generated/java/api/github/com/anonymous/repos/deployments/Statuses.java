package api.github.com.anonymous.repos.deployments;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.DeploymentStatuses;
import api.github.com.definitions.DeploymentStatusesCreate;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Statuses
    extends DelegateTransfer<Anonymous>
{

    public Statuses(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Users with pull access can view deployment statuses for a deployment
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param id
     *     The Deployment ID to list the statuses from.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<DeploymentStatuses[]> getByOwnerRepoId(String owner,
        String repo,
        long id,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/deployments/{id}/statuses".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, DeploymentStatuses[].class);
    }

    /**
     * 
     * <p>
     * Create a Deployment Status
     * Users with push access can create deployment statuses for a given deployment:
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param id
     *     The Deployment ID to list the statuses from.
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public void postByOwnerRepoId(String owner,
        String repo,
        long id,
        String Accept,
        DeploymentStatusesCreate body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/deployments/{id}/statuses".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        requestPost(url, headerProperties, content, Void.class);
    }
}
