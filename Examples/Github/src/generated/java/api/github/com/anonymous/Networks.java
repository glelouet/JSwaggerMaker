package api.github.com.anonymous;

import api.github.com.Anonymous;
import api.github.com.anonymous.networks.Events;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Networks
    extends DelegateTransfer<Anonymous>
{
    public final Events events;

    public Networks(Anonymous delegate) {
        super(delegate);
        events = new Events((delegate));
    }
}
