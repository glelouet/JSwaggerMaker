package petstore.swagger.io.apikey.store;

import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import petstore.swagger.io.ApiKey;

public class Inventory
    extends DelegateTransfer<ApiKey>
{

    public Inventory(ApiKey delegate) {
        super(delegate);
    }

    /**
     * Returns pet inventories by status
     * 
     * <p>
     * Returns a map of status codes to quantities
     * </p>
     */
    public Requested<Map<String, Integer>> get() {
        String url = ("https://petstore.swagger.io/v2/store/inventory");
        return requestGetMap(url, null, Integer.class);
    }
}
