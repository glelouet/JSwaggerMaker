package api.github.com.anonymous.repos;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.NotificationMarkRead;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Notifications
    extends DelegateTransfer<Anonymous>
{

    public Notifications(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List your notifications in a repository
     * List all notifications for the current user.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param all
     *     True to show notifications marked as read.
     * @param participating
     *     True to show only notifications in which the user is directly participating
     *     or mentioned.
     *     
     * @param since
     *     The time should be passed in as UTC in the ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
     *     Example: "2012-10-09T23:39:01Z".
     *     
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Notifications> getByOwnerRepo(String owner,
        String repo,
        Boolean all,
        Boolean participating,
        String since,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/notifications".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(all==null?"":"&all="+flatten(all))+(participating==null?"":"&participating="+flatten(participating))+(since==null?"":"&since="+flatten(since)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Notifications.class);
    }

    /**
     * 
     * <p>
     * Mark notifications as read in a repository.
     * Marking all notifications in a repository as "read" removes them from the
     * default view on GitHub.com.
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
    public void putByOwnerRepo(String owner,
        String repo,
        String Accept,
        NotificationMarkRead body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/notifications".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", (body));
        requestPut(url, headerProperties, content, Void.class);
    }
}
