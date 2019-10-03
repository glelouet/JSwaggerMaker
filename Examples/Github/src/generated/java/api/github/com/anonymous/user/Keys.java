package api.github.com.anonymous.user;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.UserKeysKeyId;
import api.github.com.definitions.UserKeysPost;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Keys
    extends DelegateTransfer<Anonymous>
{

    public Keys(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List your public keys.
     * Lists the current user's keys. Management of public keys via the API requires
     * that you are authenticated through basic auth, or OAuth with the 'user', 'write:public_key' scopes.
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Object[]> get(String Accept) {
        String url = ("https://api.github.com//user/keys");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Object[].class);
    }

    /**
     * 
     * <p>
     * Create a public key.
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<UserKeysKeyId> post(String Accept, UserKeysPost body) {
        String url = ("https://api.github.com//user/keys");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, UserKeysKeyId.class);
    }

    /**
     * 
     * <p>
     * Get a single public key.
     * </p>
     * 
     * @param keyId
     *     ID of key.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<UserKeysKeyId> getByKeyId(long keyId, String Accept) {
        String url = ("https://api.github.com//user/keys/{keyId}".replace("{keyId}", ""+keyId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, UserKeysKeyId.class);
    }

    /**
     * 
     * <p>
     * Delete a public key. Removes a public key. Requires that you are authenticated via Basic Auth or via OAuth with at least admin:public_key scope.
     * </p>
     * 
     * @param keyId
     *     ID of key.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByKeyId(long keyId, String Accept) {
        String url = ("https://api.github.com//user/keys/{keyId}".replace("{keyId}", ""+keyId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
