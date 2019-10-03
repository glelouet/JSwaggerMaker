package petstore.swagger.io.apikey;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import petstore.swagger.io.ApiKey;
import petstore.swagger.io.apikey.store.Inventory;

public class Store
    extends DelegateTransfer<ApiKey>
{
    public final Inventory inventory;

    public Store(ApiKey delegate) {
        super(delegate);
        inventory = new Inventory((delegate));
    }
}
