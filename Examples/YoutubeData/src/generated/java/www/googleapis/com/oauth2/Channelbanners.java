package www.googleapis.com.oauth2;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import www.googleapis.com.Oauth2;
import www.googleapis.com.oauth2.channelbanners.Insert;

public class Channelbanners
    extends DelegateTransfer<Oauth2>
{
    public final Insert insert;

    public Channelbanners(Oauth2 delegate) {
        super(delegate);
        insert = new Insert((delegate));
    }
}
