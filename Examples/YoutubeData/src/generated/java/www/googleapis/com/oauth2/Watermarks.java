package www.googleapis.com.oauth2;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import www.googleapis.com.Oauth2;
import www.googleapis.com.oauth2.watermarks.Set;
import www.googleapis.com.oauth2.watermarks.Unset;

public class Watermarks
    extends DelegateTransfer<Oauth2>
{
    public final Set set;
    public final Unset unset;

    public Watermarks(Oauth2 delegate) {
        super(delegate);
        set = new Set((delegate));
        unset = new Unset((delegate));
    }
}
