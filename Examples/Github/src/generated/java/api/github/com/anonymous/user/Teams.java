package api.github.com.anonymous.user;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.TeamsList;
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
     * List all of the teams across all of the organizations to which the authenticated user belongs. This method requires user or repo scope when authenticating via OAuth.
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<TeamsList[]> get(String Accept) {
        String url = ("https://api.github.com//user/teams");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, TeamsList[].class);
    }
}
