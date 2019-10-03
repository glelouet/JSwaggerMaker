package api.github.com.anonymous.orgs;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.User;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class PublicMembers
    extends DelegateTransfer<Anonymous>
{

    public PublicMembers(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Public members list.
     * Members of an organization can choose to have their membership publicized
     * or not.
     * </p>
     * 
     * @param org
     *     Name of organisation.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<User[]> getByOrg(String org, String Accept) {
        String url = ("https://api.github.com//orgs/{org}/public_members".replace("{org}", ""+org));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, User[].class);
    }

    /**
     * 
     * <p>
     * Check public membership.
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
        String url = ("https://api.github.com//orgs/{org}/public_members/{username}".replace("{org}", ""+org).replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestGet(url, headerProperties, Void.class);
    }

    /**
     * 
     * <p>
     * Publicize a user's membership.
     * </p>
     * 
     * @param org
     *     Name of organisation.
     * @param username
     *     Name of the user.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void putByOrgUsername(String org, String username, String Accept) {
        String url = ("https://api.github.com//orgs/{org}/public_members/{username}".replace("{org}", ""+org).replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestPut(url, headerProperties, null, Void.class);
    }

    /**
     * 
     * <p>
     * Conceal a user's membership.
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
        String url = ("https://api.github.com//orgs/{org}/public_members/{username}".replace("{org}", ""+org).replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
