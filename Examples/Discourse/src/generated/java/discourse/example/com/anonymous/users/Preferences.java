package discourse.example.com.anonymous.users;

import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.users.preferences.Avatar;
import discourse.example.com.anonymous.users.preferences.Email;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Preferences
    extends DelegateTransfer<Anonymous>
{
    public final Avatar avatar;
    public final Email email;

    public Preferences(Anonymous delegate) {
        super(delegate);
        avatar = new Avatar((delegate));
        email = new Email((delegate));
    }
}
