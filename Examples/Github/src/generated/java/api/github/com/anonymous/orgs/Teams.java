package api.github.com.anonymous.orgs;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.OrgTeamsPost;
import api.github.com.definitions.Team;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Teams
    extends DelegateTransfer<Anonymous>
{

    public Teams(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List teams.
     * </p>
     * 
     * @param org
     *     Name of organisation.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Teams[]> getByOrg(String org, String Accept) {
        String url = ("https://api.github.com//orgs/{org}/teams".replace("{org}", ""+org));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Teams[].class);
    }

    /**
     * 
     * <p>
     * Create team.
     * In order to create a team, the authenticated user must be an owner of organization.
     * </p>
     * 
     * @param org
     *     Name of organisation.
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<Team> postByOrg(String org, String Accept, OrgTeamsPost body) {
        String url = ("https://api.github.com//orgs/{org}/teams".replace("{org}", ""+org));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, Team.class);
    }
}
