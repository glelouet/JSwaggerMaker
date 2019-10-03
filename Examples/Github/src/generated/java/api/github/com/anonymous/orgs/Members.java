package api.github.com.anonymous.orgs;

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
     * Members list.
     * List all users who are members of an organization. A member is a user tha
     * belongs to at least 1 team in the organization. If the authenticated user
     * is also an owner of this organization then both concealed and public members
     * will be returned. If the requester is not an owner of the organization the
     * query will be redirected to the public members list.
     * </p>
     * 
     * @param org
     *     Name of organisation.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<User[]> getByOrg(String org, String Accept) {
        String url = ("https://api.github.com//orgs/{org}/members".replace("{org}", ""+org));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, User[].class);
    }

    /**
     * 
     * <p>
     * Check if a user is, publicly or privately, a member of the organization.
     * </p>
     * 
     * @param org
     *     Name of organisation.
     * @param username
     *     Name of the user.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void getByOrgUsername(String org, String username, String Accept) {
        String url = ("https://api.github.com//orgs/{org}/members/{username}".replace("{org}", ""+org).replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestGet(url, headerProperties, Void.class);
    }

    /**
     * 
     * <p>
     * Remove a member.
     * Removing a user from this list will remove them from all teams and they
     * will no longer have any access to the organization's repositories.
     * </p>
     * 
     * @param org
     *     Name of organisation.
     * @param username
     *     Name of the user.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByOrgUsername(String org, String username, String Accept) {
        String url = ("https://api.github.com//orgs/{org}/members/{username}".replace("{org}", ""+org).replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
