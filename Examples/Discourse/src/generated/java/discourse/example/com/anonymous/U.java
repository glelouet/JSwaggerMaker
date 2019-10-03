package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.u.ByExternal;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class U
    extends DelegateTransfer<Anonymous>
{
    public final ByExternal by_external;

    public U(Anonymous delegate) {
        super(delegate);
        by_external = new ByExternal((delegate));
    }
}
