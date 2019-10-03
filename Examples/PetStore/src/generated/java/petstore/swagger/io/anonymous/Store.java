package petstore.swagger.io.anonymous;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import petstore.swagger.io.Anonymous;
import petstore.swagger.io.anonymous.store.Order;

public class Store
    extends DelegateTransfer<Anonymous>
{
    public final Order order;

    public Store(Anonymous delegate) {
        super(delegate);
        order = new Order((delegate));
    }
}
