package api.github.com.anonymous.repos;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.SubscriptionBody;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Subscription
    extends DelegateTransfer<Anonymous>
{

    public Subscription(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get a Repository Subscription.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Subscription> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/subscription".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Subscription.class);
    }

    /**
     * 
     * <p>
     * Set a Repository Subscription
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
    public Requested<api.github.com.definitions.Subscription> putByOwnerRepo(String owner,
        String repo,
        String Accept,
        SubscriptionBody body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/subscription".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", (body));
        return requestPut(url, headerProperties, content, api.github.com.definitions.Subscription.class);
    }

    /**
     * 
     * <p>
     * Delete a Repository Subscription.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/subscription".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
