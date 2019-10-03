package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.search.Query;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Search
    extends DelegateTransfer<Anonymous>
{
    public final Query query;

    public Search(Anonymous delegate) {
        super(delegate);
        query = new Query((delegate));
    }
}
