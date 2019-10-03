package api.github.com.anonymous.legacy.user;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.SearchUserByEmail;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Email
    extends DelegateTransfer<Anonymous>
{

    public Email(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * This API call is added for compatibility reasons only.
     * </p>
     * 
     * @param email
     *     The email address
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<SearchUserByEmail> getByEmail(String email, String Accept) {
        String url = ("https://api.github.com//legacy/user/email/{email}".replace("{email}", ""+email));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, SearchUserByEmail.class);
    }
}
