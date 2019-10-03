package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.notifications.MarkRead_json;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Notifications
    extends DelegateTransfer<Anonymous>
{
    public final MarkRead_json mark_read_json;

    public Notifications(Anonymous delegate) {
        super(delegate);
        mark_read_json = new MarkRead_json((delegate));
    }
}
