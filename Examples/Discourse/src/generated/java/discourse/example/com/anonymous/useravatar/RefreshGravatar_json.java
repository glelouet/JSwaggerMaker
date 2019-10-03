package discourse.example.com.anonymous.useravatar;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class RefreshGravatar_json
    extends DelegateTransfer<Anonymous>
{

    public RefreshGravatar_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Refresh a users gravatar
     * </p>
     * 
     * @param username
     */
    public Requested<Object> postByUsername(String username) {
        String url = ("https://discourse.example.com//user_avatar/{username}/refresh_gravatar.json".replace("{username}", ""+username));
        return requestPost(url, null, null, Object.class);
    }
}
