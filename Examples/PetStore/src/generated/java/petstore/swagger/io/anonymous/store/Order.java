package petstore.swagger.io.anonymous.store;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import petstore.swagger.io.Anonymous;

public class Order
    extends DelegateTransfer<Anonymous>
{

    public Order(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Place an order for a pet
     * 
     * <p>
     * </p>
     * 
     * @param body
     *     order placed for purchasing the pet
     */
    public Requested<petstore.swagger.io.definitions.Order> post(petstore.swagger.io.definitions.Order body) {
        String url = ("https://petstore.swagger.io/v2/store/order");
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, null, content, petstore.swagger.io.definitions.Order.class);
    }

    /**
     * Find purchase order by ID
     * 
     * <p>
     * For valid response try integer IDs with value >= 1 and <= 10. Other values will generated exceptions
     * </p>
     * 
     * @param orderId
     *     ID of pet that needs to be fetched
     */
    public Requested<petstore.swagger.io.definitions.Order> getByOrderId(long orderId) {
        String url = ("https://petstore.swagger.io/v2/store/order/{orderId}".replace("{orderId}", ""+orderId));
        return requestGet(url, null, petstore.swagger.io.definitions.Order.class);
    }

    /**
     * Delete purchase order by ID
     * 
     * <p>
     * For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors
     * </p>
     * 
     * @param orderId
     *     ID of the order that needs to be deleted
     */
    public void deleteByOrderId(long orderId) {
        String url = ("https://petstore.swagger.io/v2/store/order/{orderId}".replace("{orderId}", ""+orderId));
        requestDel(url, null, Void.class);
    }
}
