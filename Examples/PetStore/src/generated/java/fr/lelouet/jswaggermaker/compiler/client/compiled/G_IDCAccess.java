package fr.lelouet.jswaggermaker.compiler.client.compiled;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.interfaces.ITransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import fr.lelouet.jswaggermaker.compiler.client.compiled.definitions.ApiResponse;
import fr.lelouet.jswaggermaker.compiler.client.compiled.definitions.Order;
import fr.lelouet.jswaggermaker.compiler.client.compiled.definitions.Pet;
import fr.lelouet.jswaggermaker.compiler.client.compiled.definitions.User;


/**
 * interface to access the ESI without an account.<br />This gives access to static data, eg items, markets, etc.
 */
public interface G_IDCAccess
    extends ITransfer
{

    /**
     * Finds Pets by status
     * <p>
     * Multiple status values can be provided with comma separated strings
     * </p>
     * 
     * @param status
     *     Status values that need to be considered for filter
     */
    public default Requested<Pet[]> findPetsByStatus(String[] status, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/pet/findByStatus"+"?"+(status==null?"":"&status="+flatten(status)));
        return requestGet(url, properties, Pet[].class);
    }

    /**
     * Finds Pets by tags
     * <p>
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * </p>
     * 
     * @param tags
     *     Tags to filter by
     */
    public default Requested<Pet[]> findPetsByTags(String[] tags, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/pet/findByTags"+"?"+(tags==null?"":"&tags="+flatten(tags)));
        return requestGet(url, properties, Pet[].class);
    }

    /**
     * Find pet by ID
     * <p>
     * Returns a single pet
     * </p>
     * 
     * @param petId
     *     ID of pet to return
     */
    public default Requested<Pet> getPetById(long petId, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/pet/{petId}".replace("{petId}", ""+petId));
        return requestGet(url, properties, Pet.class);
    }

    /**
     * uploads an image
     * <p>
     * </p>
     * 
     * @param petId
     *     ID of pet to update
     */
    public default Requested<ApiResponse> uploadFile(long petId, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/pet/{petId}/uploadImage".replace("{petId}", ""+petId));
        return requestPost(url, properties, null, ApiResponse.class);
    }

    /**
     * Returns pet inventories by status
     * <p>
     * Returns a map of status codes to quantities
     * </p>
     */
    public default Requested<Map<String, Integer>> getInventory(Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/store/inventory");
        return requestGet(url, properties, Map.class);
    }

    /**
     * Place an order for a pet
     * <p>
     * </p>
     * 
     * @param body
     *     order placed for purchasing the pet
     */
    public default Requested<Order> placeOrder(Order body, Map<String, String> properties) {
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
    public default Requested<Order> getOrderById(long orderId, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/store/order/{orderId}".replace("{orderId}", ""+orderId));
        return requestGet(url, properties, Order.class);
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
    public default Requested<String> loginUser(String username, String password, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/user/login"+"?"+(username==null?"":"&username="+flatten(username))+(password==null?"":"&password="+flatten(password)));
        return requestGet(url, properties, String.class);
    }

    /**
     * Get user by user name
     * <p>
     * </p>
     * 
     * @param username
     *     The name that needs to be fetched. Use user1 for testing. 
     */
    public default Requested<User> getUserByName(String username, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/user/{username}".replace("{username}", ""+username));
        return requestGet(url, properties, User.class);
    }
}
