package api.github.com.anonymous;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.anonymous.orgs.Events;
import api.github.com.anonymous.orgs.Issues;
import api.github.com.anonymous.orgs.Members;
import api.github.com.anonymous.orgs.PublicMembers;
import api.github.com.anonymous.orgs.Repos;
import api.github.com.anonymous.orgs.Teams;
import api.github.com.definitions.Organization;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Orgs
    extends DelegateTransfer<Anonymous>
{
    public final Events events;
    public final Issues issues;
    public final Members members;
    public final PublicMembers public_members;
    public final Repos repos;
    public final Teams teams;

    public Orgs(Anonymous delegate) {
        super(delegate);
        events = new Events((delegate));
        issues = new Issues((delegate));
        members = new Members((delegate));
        public_members = new PublicMembers((delegate));
        repos = new Repos((delegate));
        teams = new Teams((delegate));
    }

    /**
     * 
     * <p>
     * Get an Organization.
     * </p>
     * 
     * @param org
     *     Name of organisation.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Organization> getByOrg(String org, String Accept) {
        String url = ("https://api.github.com//orgs/{org}".replace("{org}", ""+org));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Organization.class);
    }
}
