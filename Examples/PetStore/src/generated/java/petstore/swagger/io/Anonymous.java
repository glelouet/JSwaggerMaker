package petstore.swagger.io;

import fr.lelouet.jswaggermaker.client.common.impl.securities.Disconnected;
import petstore.swagger.io.anonymous.Store;
import petstore.swagger.io.anonymous.User;


/**
 * access petstore.swagger.io with no authorization.
 */
public class Anonymous
    extends Disconnected
{
    public final Store store = new Store(this);
    public final User user = new User(this);
}
