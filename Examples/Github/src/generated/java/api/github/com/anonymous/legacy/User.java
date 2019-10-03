package api.github.com.anonymous.legacy;

import api.github.com.Anonymous;
import api.github.com.anonymous.legacy.user.Email;
import api.github.com.anonymous.legacy.user.Search;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class User
    extends DelegateTransfer<Anonymous>
{
    public final Email email;
    public final Search search;

    public User(Anonymous delegate) {
        super(delegate);
        email = new Email((delegate));
        search = new Search((delegate));
    }
}
