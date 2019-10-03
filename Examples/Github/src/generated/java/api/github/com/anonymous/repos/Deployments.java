package api.github.com.anonymous.repos;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.anonymous.repos.deployments.Statuses;
import api.github.com.definitions.Deployment;
import api.github.com.definitions.DeploymentResp;
import api.github.com.definitions.RepoDeployments;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Deployments
    extends DelegateTransfer<Anonymous>
{
    public final Statuses statuses;

    public Deployments(Anonymous delegate) {
        super(delegate);
        statuses = new Statuses((delegate));
    }

    /**
     * 
     * <p>
     * Users with pull access can view deployments for a repository
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<RepoDeployments[]> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/deployments".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, RepoDeployments[].class);
    }

    /**
     * 
     * <p>
     * Users with push access can create a deployment for a given ref
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
    public Requested<DeploymentResp> postByOwnerRepo(String owner,
        String repo,
        String Accept,
        Deployment body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/deployments".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, DeploymentResp.class);
    }
}
