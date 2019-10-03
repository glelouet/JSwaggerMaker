package api.github.com.anonymous.legacy;

import api.github.com.Anonymous;
import api.github.com.anonymous.legacy.repos.Search;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Repos
    extends DelegateTransfer<Anonymous>
{
    public final Search search;

    public Repos(Anonymous delegate) {
        super(delegate);
        search = new Search((delegate));
    }
}
