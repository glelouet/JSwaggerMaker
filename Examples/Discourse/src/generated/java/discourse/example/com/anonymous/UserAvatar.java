package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.useravatar.RefreshGravatar_json;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class UserAvatar
    extends DelegateTransfer<Anonymous>
{
    public final RefreshGravatar_json refresh_gravatar_json;

    public UserAvatar(Anonymous delegate) {
        super(delegate);
        refresh_gravatar_json = new RefreshGravatar_json((delegate));
    }
}
