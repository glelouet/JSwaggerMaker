package petstore.swagger.io.anonymous;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import petstore.swagger.io.Anonymous;
import petstore.swagger.io.anonymous.user.Createwitharray;
import petstore.swagger.io.anonymous.user.Createwithlist;
import petstore.swagger.io.anonymous.user.Login;
import petstore.swagger.io.anonymous.user.Logout;

public class User
    extends DelegateTransfer<Anonymous>
{
    public final Createwitharray createwitharray;
    public final Createwithlist createwithlist;
    public final Login login;
    public final Logout logout;

    public User(Anonymous delegate) {
        super(delegate);
        createwitharray = new Createwitharray((delegate));
        createwithlist = new Createwithlist((delegate));
        login = new Login((delegate));
        logout = new Logout((delegate));
    }

    /**
     * Create user
     * 
     * <p>
     * This can only be done by the logged in user.
     * </p>
     * 
     * @param body
     *     Created user object
     */
    public void post(petstore.swagger.io.definitions.User body) {
        String url = ("https://petstore.swagger.io/v2/user");
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        requestPost(url, null, content, Void.class);
    }

    /**
     * Get user by user name
     * 
     * <p>
     * </p>
     * 
     * @param username
     *     The name that needs to be fetched. Use user1 for testing. 
     */
    public Requested<petstore.swagger.io.definitions.User> getByUsername(String username) {
        String url = ("https://petstore.swagger.io/v2/user/{username}".replace("{username}", ""+username));
        return requestGet(url, null, petstore.swagger.io.definitions.User.class);
    }

    /**
     * Updated user
     * 
     * <p>
     * This can only be done by the logged in user.
     * </p>
     * 
     * @param username
     *     name that need to be updated
     * @param body
     *     Updated user object
     */
    public void putByUsername(String username, petstore.swagger.io.definitions.User body) {
        String url = ("https://petstore.swagger.io/v2/user/{username}".replace("{username}", ""+username));
        Map<String, Object> content = new HashMap<>();
        content.put("body", (body));
        requestPut(url, null, content, Void.class);
    }

    /**
     * Delete user
     * 
     * <p>
     * This can only be done by the logged in user.
     * </p>
     * 
     * @param username
     *     The name that needs to be deleted
     */
    public void deleteByUsername(String username) {
        String url = ("https://petstore.swagger.io/v2/user/{username}".replace("{username}", ""+username));
        requestDel(url, null, Void.class);
    }
}
