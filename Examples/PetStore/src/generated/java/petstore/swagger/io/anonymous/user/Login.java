package petstore.swagger.io.anonymous.user;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import petstore.swagger.io.Anonymous;

public class Login
    extends DelegateTransfer<Anonymous>
{

    public Login(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Logs user into the system
     * 
     * <p>
     * </p>
     * 
     * @param username
     *     The user name for login
     * @param password
     *     The password for login in clear text
     */
    public Requested<String> get(String username, String password) {
        String url = ("https://petstore.swagger.io/v2/user/login"+"?"+(username==null?"":"&username="+flatten(username))+(password==null?"":"&password="+flatten(password)));
        return requestGet(url, null, String.class);
    }
}
