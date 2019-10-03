package discourse.example.com.anonymous.groups;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Members_json
    extends DelegateTransfer<Anonymous>
{

    public Members_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get some group members
     * </p>
     */
    public Requested<Object> getByGroupName() {
        String url = ("https://discourse.example.com//groups/{group_name}/members.json");
        return requestGet(url, null, Object.class);
    }

    /**
     * Add user(s) to a group
     * 
     * <p>
     * Add user(s) to a group (comma separated)
     * </p>
     * 
     * @param usernames
     */
    public Requested<Object> putByGroupId(String usernames) {
        String url = ("https://discourse.example.com//groups/{group_id}/members.json");
        Map<String, Object> content = new HashMap<>();
        content.put("usernames", (usernames));
        return requestPut(url, null, content, Object.class);
    }

    /**
     * Remove user(s) from a group
     * 
     * <p>
     * You may use one of the following request body params to specify the user(s) to remove.
     * </p>
     * 
     * @param user_id
     * @param user_ids
     * @param username
     * @param usernames
     * @param user_email
     * @param user_emails
     */
    public Requested<Object> deleteByGroupId(long user_id,
        String user_ids,
        String username,
        String usernames,
        String user_email,
        String user_emails) {
        String url = ("https://discourse.example.com//groups/{group_id}/members.json");
        return requestDel(url, null, Object.class);
    }
}
