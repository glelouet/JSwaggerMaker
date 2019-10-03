package discourse.example.com.anonymous.users.preferences;

import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.users.preferences.avatar.Pick;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Avatar
    extends DelegateTransfer<Anonymous>
{
    public final Pick pick;

    public Avatar(Anonymous delegate) {
        super(delegate);
        pick = new Pick((delegate));
    }
}
