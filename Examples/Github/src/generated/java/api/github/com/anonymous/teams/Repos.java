package api.github.com.anonymous.teams;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.Repo;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Repos
    extends DelegateTransfer<Anonymous>
{

    public Repos(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List team repos
     * </p>
     * 
     * @param teamId
     *     Id of team.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Repo[]> getByTeamId(long teamId, String Accept) {
        String url = ("https://api.github.com//teams/{teamId}/repos".replace("{teamId}", ""+teamId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Repo[].class);
    }

    /**
     * 
     * <p>
     * Check if a team manages a repository
     * </p>
     * 
     * @param teamId
     *     Id of team.
     * @param owner
     *     Name of a repository owner.
     * @param repo
     *     Name of a repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void getByTeamIdOwnerRepo(long teamId,
        String owner,
        String repo,
        String Accept) {
        String url = ("https://api.github.com//teams/{teamId}/repos/{owner}/{repo}".replace("{teamId}", ""+teamId).replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestGet(url, headerProperties, Void.class);
    }

    /**
     * 
     * <p>
     * In order to add a repository to a team, the authenticated user must be an owner of the org that the team is associated with. Also, the repository must be owned by the organization, or a direct fork of a repository owned by the organization.
     * </p>
     * 
     * @param teamId
     *     Id of team.
     * @param owner
     *     Name of a organization.
     * @param repo
     *     Name of a repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void putByTeamIdOwnerRepo(long teamId,
        String owner,
        String repo,
        String Accept) {
        String url = ("https://api.github.com//teams/{teamId}/repos/{owner}/{repo}".replace("{teamId}", ""+teamId).replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestPut(url, headerProperties, null, Void.class);
    }

    /**
     * 
     * <p>
     * In order to remove a repository from a team, the authenticated user must be an owner of the org that the team is associated with. NOTE: This does not delete the repository, it just removes it from the team.
     * </p>
     * 
     * @param teamId
     *     Id of team.
     * @param owner
     *     Name of a repository owner.
     * @param repo
     *     Name of a repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByTeamIdOwnerRepo(long teamId,
        String owner,
        String repo,
        String Accept) {
        String url = ("https://api.github.com//teams/{teamId}/repos/{owner}/{repo}".replace("{teamId}", ""+teamId).replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
