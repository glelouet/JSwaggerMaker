package api.github.com.anonymous.repos;

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
     * Get list of keys.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Keys[]> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/keys".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Keys[].class);
    }

    /**
     * 
     * <p>
     * Create a key.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<UserKeysKeyId> postByOwnerRepo(String owner,
        String repo,
        String Accept,
        UserKeysPost body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/keys".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
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
     * Get a key
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param keyId
     *     Id of key.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<UserKeysKeyId> getByOwnerRepoKeyId(String owner,
        String repo,
        long keyId,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/keys/{keyId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{keyId}", ""+keyId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, UserKeysKeyId.class);
    }

    /**
     * 
     * <p>
     * Delete a key.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param keyId
     *     Id of key.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByOwnerRepoKeyId(String owner,
        String repo,
        long keyId,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/keys/{keyId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{keyId}", ""+keyId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
