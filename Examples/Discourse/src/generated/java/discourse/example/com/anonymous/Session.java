package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.session.ForgotPassword;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Session
    extends DelegateTransfer<Anonymous>
{
    public final ForgotPassword forgot_password;

    public Session(Anonymous delegate) {
        super(delegate);
        forgot_password = new ForgotPassword((delegate));
    }
}
