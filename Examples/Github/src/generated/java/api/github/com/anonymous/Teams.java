package api.github.com.anonymous;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.anonymous.teams.Members;
import api.github.com.anonymous.teams.Memberships;
import api.github.com.anonymous.teams.Repos;
import api.github.com.definitions.Team;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Teams
    extends DelegateTransfer<Anonymous>
{
    public final Members members;
    public final Memberships memberships;
    public final Repos repos;

    public Teams(Anonymous delegate) {
        super(delegate);
        members = new Members((delegate));
        memberships = new Memberships((delegate));
        repos = new Repos((delegate));
    }

    /**
     * 
     * <p>
     * Get team.
     * </p>
     * 
     * @param teamId
     *     Id of team.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Team> getByTeamId(long teamId, String Accept) {
        String url = ("https://api.github.com//teams/{teamId}".replace("{teamId}", ""+teamId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Team.class);
    }

    /**
     * 
     * <p>
     * Delete team.
     * In order to delete a team, the authenticated user must be an owner of the
     * org that the team is associated with.
     * </p>
     * 
     * @param teamId
     *     Id of team.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByTeamId(long teamId, String Accept) {
        String url = ("https://api.github.com//teams/{teamId}".replace("{teamId}", ""+teamId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
