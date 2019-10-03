package api.github.com.anonymous;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.anonymous.notifications.Threads;
import api.github.com.definitions.NotificationMarkRead;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Notifications
    extends DelegateTransfer<Anonymous>
{
    public final Threads threads;

    public Notifications(Anonymous delegate) {
        super(delegate);
        threads = new Threads((delegate));
    }

    /**
     * 
     * <p>
     * List your notifications.
     * List all notifications for the current user, grouped by repository.
     * </p>
     * 
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
    public Requested<api.github.com.definitions.Notifications> get(Boolean all,
        Boolean participating,
        String since,
        String Accept) {
        String url = ("https://api.github.com//notifications"+"?"+(all==null?"":"&all="+flatten(all))+(participating==null?"":"&participating="+flatten(participating))+(since==null?"":"&since="+flatten(since)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Notifications.class);
    }

    /**
     * 
     * <p>
     * Mark as read.
     * Marking a notification as "read" removes it from the default view on GitHub.com.
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public void put(String Accept, NotificationMarkRead body) {
        String url = ("https://api.github.com//notifications");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", (body));
        requestPut(url, headerProperties, content, Void.class);
    }
}
