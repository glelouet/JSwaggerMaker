package api.github.com.anonymous.teams;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.TeamMembership;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Memberships
    extends DelegateTransfer<Anonymous>
{

    public Memberships(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get team membership.
     * In order to get a user's membership with a team, the authenticated user must be a member of the team or an owner of the team's organization.
     * </p>
     * 
     * @param teamId
     *     Id of team.
     * @param username
     *     Name of a member.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<TeamMembership> getByTeamIdUsername(long teamId, String username, String Accept) {
        String url = ("https://api.github.com//teams/{teamId}/memberships/{username}".replace("{teamId}", ""+teamId).replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, TeamMembership.class);
    }

    /**
     * 
     * <p>
     * Add team membership.
     * In order to add a membership between a user and a team, the authenticated user must have 'admin' permissions to the team or be an owner of the organization that the team is associated with.
     * If the user is already a part of the team's organization (meaning they're on at least one other team in the organization), this endpoint will add the user to the team.
     * If the user is completely unaffiliated with the team's organization (meaning they're on none of the organization's teams), this endpoint will send an invitation to the user via email. This newly-created membership will be in the 'pending' state until the user accepts the invitation, at which point the membership will transition to the 'active' state and the user will be added as a member of the team.
     * </p>
     * 
     * @param teamId
     *     Id of team.
     * @param username
     *     Name of a member.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<TeamMembership> putByTeamIdUsername(long teamId, String username, String Accept) {
        String url = ("https://api.github.com//teams/{teamId}/memberships/{username}".replace("{teamId}", ""+teamId).replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestPut(url, headerProperties, null, TeamMembership.class);
    }

    /**
     * 
     * <p>
     * Remove team membership.
     * In order to remove a membership between a user and a team, the authenticated user must have 'admin' permissions to the team or be an owner of the organization that the team is associated with. NOTE: This does not delete the user, it just removes their membership from the team.
     * </p>
     * 
     * @param teamId
     *     Id of team.
     * @param username
     *     Name of a member.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByTeamIdUsername(long teamId, String username, String Accept) {
        String url = ("https://api.github.com//teams/{teamId}/memberships/{username}".replace("{teamId}", ""+teamId).replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
