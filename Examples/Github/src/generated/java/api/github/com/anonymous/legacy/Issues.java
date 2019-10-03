package api.github.com.anonymous.legacy;

import api.github.com.Anonymous;
import api.github.com.anonymous.legacy.issues.Search;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Issues
    extends DelegateTransfer<Anonymous>
{
    public final Search search;

    public Issues(Anonymous delegate) {
        super(delegate);
        search = new Search((delegate));
    }
}
