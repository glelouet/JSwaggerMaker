package discourse.example.com.anonymous.session;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class ForgotPassword
    extends DelegateTransfer<Anonymous>
{

    public ForgotPassword(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Send password reset email
     * </p>
     * 
     * @param login
     */
    public Requested<Object> post(String login) {
        String url = ("https://discourse.example.com//session/forgot_password");
        Map<String, Object> content = new HashMap<>();
        content.put("login", login);
        return requestPost(url, null, content, Object.class);
    }
}
