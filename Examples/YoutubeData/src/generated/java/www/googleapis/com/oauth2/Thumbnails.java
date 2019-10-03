package www.googleapis.com.oauth2;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import www.googleapis.com.Oauth2;
import www.googleapis.com.oauth2.thumbnails.Set;

public class Thumbnails
    extends DelegateTransfer<Oauth2>
{
    public final Set set;

    public Thumbnails(Oauth2 delegate) {
        super(delegate);
        set = new Set((delegate));
    }
}
