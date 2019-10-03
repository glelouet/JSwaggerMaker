package discourse.example.com.anonymous.users.preferences;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Email
    extends DelegateTransfer<Anonymous>
{

    public Email(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update email
     * </p>
     * 
     * @param email
     */
    public void putByUsername(String email) {
        String url = ("https://discourse.example.com//users/{username}/preferences/email");
        Map<String, Object> content = new HashMap<>();
        content.put("email", (email));
        requestPut(url, null, content, Void.class);
    }
}
