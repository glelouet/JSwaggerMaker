package discourse.example.com.anonymous;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.users.PasswordReset;
import discourse.example.com.anonymous.users.Preferences;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Users
    extends DelegateTransfer<Anonymous>
{
    public final Preferences preferences;
    public final PasswordReset password_reset;

    public Users(Anonymous delegate) {
        super(delegate);
        preferences = new Preferences((delegate));
        password_reset = new PasswordReset((delegate));
    }

    /**
     * 
     * <p>
     * Get a single user by username
     * </p>
     * 
     * @param username
     */
    public Requested<Object> getByUsername(String username) {
        String url = ("https://discourse.example.com//users/{username}.json".replace("{username}", ""+username));
        return requestGet(url, null, Object.class);
    }

    /**
     * 
     * <p>
     * Creates a new user
     * </p>
     * 
     * @param name
     * @param email
     * @param password
     * @param username
     * @param active
     * @param approved
     * @param user_fields_1_
     */
    public Requested<Object> post(String name,
        String email,
        String password,
        String username,
        boolean active,
        boolean approved,
        String user_fields_1_) {
        String url = ("https://discourse.example.com//users");
        Map<String, Object> content = new HashMap<>();
        content.put("name", name);
        content.put("email", email);
        content.put("password", password);
        content.put("username", username);
        content.put("active", active);
        content.put("approved", approved);
        content.put("user_fields_1_", user_fields_1_);
        return requestPost(url, null, content, Object.class);
    }
}
