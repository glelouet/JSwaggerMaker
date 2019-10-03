package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class UserBadges
    extends DelegateTransfer<Anonymous>
{

    public UserBadges(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * get a list of badges assigned to a user
     * </p>
     */
    public Requested<Object> getByUsername() {
        String url = ("https://discourse.example.com//user-badges/{username}.json");
        return requestGet(url, null, Object.class);
    }

    /**
     * 
     * <p>
     * revoke a badge assigned to a user
     * </p>
     * 
     * @param id
     */
    public Requested<Object> deleteById(long id) {
        String url = ("https://discourse.example.com//user_badges/{id}".replace("{id}", ""+id));
        return requestDel(url, null, Object.class);
    }
}
