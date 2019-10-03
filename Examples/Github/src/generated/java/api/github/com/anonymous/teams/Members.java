package api.github.com.anonymous.teams;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.User;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Members
    extends DelegateTransfer<Anonymous>
{

    public Members(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List team members.
     * In order to list members in a team, the authenticated user must be a member
     * of the team.
     * </p>
     * 
     * @param teamId
     *     Id of team.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<User[]> getByTeamId(long teamId, String Accept) {
        String url = ("https://api.github.com//teams/{teamId}/members".replace("{teamId}", ""+teamId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, User[].class);
    }

    /**
     * 
     * <p>
     * The "Get team member" API is deprecated and is scheduled for removal in the next major version of the API. We recommend using the Get team membership API instead. It allows you to get both active and pending memberships.
     * Get team member.
     * In order to get if a user is a member of a team, the authenticated user mus
     * be a member of the team.
     * </p>
     * 
     * @param teamId
     *     Id of team.
     * @param username
     *     Name of a member.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void getByTeamIdUsername(long teamId, String username, String Accept) {
        String url = ("https://api.github.com//teams/{teamId}/members/{username}".replace("{teamId}", ""+teamId).replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestGet(url, headerProperties, Void.class);
    }

    /**
     * 
     * <p>
     * The API (described below) is deprecated and is scheduled for removal in the next major version of the API. We recommend using the Add team membership API instead. It allows you to invite new organization members to your teams.
     * Add team member.
     * In order to add a user to a team, the authenticated user must have 'admin'
     * permissions to the team or be an owner of the org that the team is associated
     * with.
     * </p>
     * 
     * @param teamId
     *     Id of team.
     * @param username
     *     Name of a member.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void putByTeamIdUsername(long teamId, String username, String Accept) {
        String url = ("https://api.github.com//teams/{teamId}/members/{username}".replace("{teamId}", ""+teamId).replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestPut(url, headerProperties, null, Void.class);
    }

    /**
     * 
     * <p>
     * The "Remove team member" API is deprecated and is scheduled for removal in the next major version of the API. We recommend using the Remove team membership API instead. It allows you to remove both active and pending memberships.
     * Remove team member.
     * In order to remove a user from a team, the authenticated user must have 'admin'
     * permissions to the team or be an owner of the org that the team is associated
     * with.
     * NOTE This does not delete the user, it just remove them from the team.
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
        String url = ("https://api.github.com//teams/{teamId}/members/{username}".replace("{teamId}", ""+teamId).replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
