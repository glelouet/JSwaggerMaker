package www.googleapis.com.oauth2c;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import www.googleapis.com.Oauth2c;
import www.googleapis.com.oauth2c.watermarks.Set;
import www.googleapis.com.oauth2c.watermarks.Unset;

public class Watermarks
    extends DelegateTransfer<Oauth2c>
{
    public final Set set;
    public final Unset unset;

    public Watermarks(Oauth2c delegate) {
        super(delegate);
        set = new Set((delegate));
        unset = new Unset((delegate));
    }
}
