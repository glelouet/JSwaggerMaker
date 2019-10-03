package www.googleapis.com.oauth2c;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import www.googleapis.com.Oauth2c;
import www.googleapis.com.oauth2c.channelbanners.Insert;

public class Channelbanners
    extends DelegateTransfer<Oauth2c>
{
    public final Insert insert;

    public Channelbanners(Oauth2c delegate) {
        super(delegate);
        insert = new Insert((delegate));
    }
}
