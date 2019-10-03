package www.googleapis.com.oauth2c;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import www.googleapis.com.Oauth2c;
import www.googleapis.com.oauth2c.livechat.Bans;
import www.googleapis.com.oauth2c.livechat.Messages;
import www.googleapis.com.oauth2c.livechat.Moderators;

public class Livechat
    extends DelegateTransfer<Oauth2c>
{
    public final Bans bans;
    public final Messages messages;
    public final Moderators moderators;

    public Livechat(Oauth2c delegate) {
        super(delegate);
        bans = new Bans((delegate));
        messages = new Messages((delegate));
        moderators = new Moderators((delegate));
    }
}
