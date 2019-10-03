package api.github.com.anonymous.users;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.anonymous.users.receivedevents.Public;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ReceivedEvents
    extends DelegateTransfer<Anonymous>
{
    public final Public public_;

    public ReceivedEvents(Anonymous delegate) {
        super(delegate);
        public_ = new Public((delegate));
    }

    /**
     * 
     * <p>
     * These are events that you'll only see public events.
     * </p>
     * 
     * @param username
     *     Name of user.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void getByUsername(String username, String Accept) {
        String url = ("https://api.github.com//users/{username}/received_events".replace("{username}", ""+username));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestGet(url, headerProperties, Void.class);
    }
}
