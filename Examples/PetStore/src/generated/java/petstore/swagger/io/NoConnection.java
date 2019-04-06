package petstore.swagger.io;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.ATransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import petstore.swagger.io.definitions.Order;
import petstore.swagger.io.definitions.User;


/**
 * access the swagger with no connection.
 */
class NoConnection
    extends ATransfer
{

    /**
     * Place an order for a pet
     * <p>
     * </p>
     * 
     * @param body
     *     order placed for purchasing the pet
     */
    public Requested<Order> placeOrder(Order body, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/store/order");
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, properties, content, Order.class);
    }

    /**
     * Find purchase order by ID
     * <p>
     * For valid response try integer IDs with value >= 1 and <= 10. Other values will generated exceptions
     * </p>
     * 
     * @param orderId
     *     ID of pet that needs to be fetched
     */
    public Requested<Order> getOrderById(long orderId, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/store/order/{orderId}".replace("{orderId}", ""+orderId));
        return requestGet(url, properties, Order.class);
    }

    /**
     * Delete purchase order by ID
     * <p>
     * For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors
     * </p>
     * 
     * @param orderId
     *     ID of the order that needs to be deleted
     */
    public void deleteOrder(long orderId, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/store/order/{orderId}".replace("{orderId}", ""+orderId));
        requestDel(url, properties);
    }

    /**
     * Create user
     * <p>
     * This can only be done by the logged in user.
     * </p>
     * 
     * @param body
     *     Created user object
     */
    public void createUser(User body, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/user");
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        requestPost(url, properties, content, Void.class);
    }

    /**
     * Creates list of users with given input array
     * <p>
     * </p>
     * 
     * @param body
     *     List of user object
     */
    public void createUsersWithArrayInput(User[] body, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/user/createWithArray");
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        requestPost(url, properties, content, Void.class);
    }

    /**
     * Creates list of users with given input array
     * <p>
     * </p>
     * 
     * @param body
     *     List of user object
     */
    public void createUsersWithListInput(User[] body, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/user/createWithList");
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        requestPost(url, properties, content, Void.class);
    }

    /**
     * Logs user into the system
     * <p>
     * </p>
     * 
     * @param username
     *     The user name for login
     * @param password
     *     The password for login in clear text
     */
    public Requested<String> loginUser(String username, String password, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/user/login"+"?"+(username==null?"":"&username="+flatten(username))+(password==null?"":"&password="+flatten(password)));
        return requestGet(url, properties, String.class);
    }

    /**
     * Logs out current logged in user session
     * <p>
     * </p>
     */
    public void logoutUser(Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/user/logout");
        requestGet(url, properties, Void.class);
    }

    /**
     * Get user by user name
     * <p>
     * </p>
     * 
     * @param username
     *     The name that needs to be fetched. Use user1 for testing. 
     */
    public Requested<User> getUserByName(String username, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/user/{username}".replace("{username}", ""+username));
        return requestGet(url, properties, User.class);
    }

    /**
     * Updated user
     * <p>
     * This can only be done by the logged in user.
     * </p>
     * 
     * @param username
     *     name that need to be updated
     * @param body
     *     Updated user object
     */
    public void updateUser(String username, User body, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/user/{username}".replace("{username}", ""+username));
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        requestPut(url, properties, content);
    }

    /**
     * Delete user
     * <p>
     * This can only be done by the logged in user.
     * </p>
     * 
     * @param username
     *     The name that needs to be deleted
     */
    public void deleteUser(String username, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/user/{username}".replace("{username}", ""+username));
        requestDel(url, properties);
    }
}
