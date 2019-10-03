package discourse.example.com.anonymous.users;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PasswordReset
    extends DelegateTransfer<Anonymous>
{

    public PasswordReset(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Create a new password
     * </p>
     * 
     * @param username
     * @param password
     */
    public void putByToken(String username, String password) {
        String url = ("https://discourse.example.com//users/password-reset/{token}");
        Map<String, Object> content = new HashMap<>();
        content.put("username", (username));
        content.put("password", (password));
        requestPut(url, null, content, Void.class);
    }
}
