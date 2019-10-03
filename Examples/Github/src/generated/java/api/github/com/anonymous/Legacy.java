package api.github.com.anonymous;

import api.github.com.Anonymous;
import api.github.com.anonymous.legacy.Issues;
import api.github.com.anonymous.legacy.Repos;
import api.github.com.anonymous.legacy.User;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Legacy
    extends DelegateTransfer<Anonymous>
{
    public final Issues issues;
    public final Repos repos;
    public final User user;

    public Legacy(Anonymous delegate) {
        super(delegate);
        issues = new Issues((delegate));
        repos = new Repos((delegate));
        user = new User((delegate));
    }
}
