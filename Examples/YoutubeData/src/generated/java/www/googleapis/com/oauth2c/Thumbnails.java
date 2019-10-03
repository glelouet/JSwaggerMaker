package www.googleapis.com.oauth2c;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import www.googleapis.com.Oauth2c;
import www.googleapis.com.oauth2c.thumbnails.Set;

public class Thumbnails
    extends DelegateTransfer<Oauth2c>
{
    public final Set set;

    public Thumbnails(Oauth2c delegate) {
        super(delegate);
        set = new Set((delegate));
    }
}
