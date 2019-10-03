package petstore.swagger.io.anonymous.user;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import petstore.swagger.io.Anonymous;

public class Logout
    extends DelegateTransfer<Anonymous>
{

    public Logout(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Logs out current logged in user session
     * 
     * <p>
     * </p>
     */
    public void get() {
        String url = ("https://petstore.swagger.io/v2/user/logout");
        requestGet(url, null, Void.class);
    }
}
