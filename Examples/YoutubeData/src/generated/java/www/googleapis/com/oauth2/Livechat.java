package www.googleapis.com.oauth2;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import www.googleapis.com.Oauth2;
import www.googleapis.com.oauth2.livechat.Bans;
import www.googleapis.com.oauth2.livechat.Messages;
import www.googleapis.com.oauth2.livechat.Moderators;

public class Livechat
    extends DelegateTransfer<Oauth2>
{
    public final Bans bans;
    public final Messages messages;
    public final Moderators moderators;

    public Livechat(Oauth2 delegate) {
        super(delegate);
        bans = new Bans((delegate));
        messages = new Messages((delegate));
        moderators = new Moderators((delegate));
    }
}
