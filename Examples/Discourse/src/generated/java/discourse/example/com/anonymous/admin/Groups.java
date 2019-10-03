package discourse.example.com.anonymous.admin;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Groups
    extends DelegateTransfer<Anonymous>
{

    public Groups(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Create a group
     * </p>
     * 
     * @param group_name_
     */
    public Requested<Object> post(String group_name_) {
        String url = ("https://discourse.example.com//admin/groups");
        Map<String, Object> content = new HashMap<>();
        content.put("group_name_", group_name_);
        return requestPost(url, null, content, Object.class);
    }

    /**
     * 
     * <p>
     * Delete a group
     * </p>
     */
    public Requested<Object> deleteByGroupId() {
        String url = ("https://discourse.example.com//admin/groups/{group_id}.json");
        return requestDel(url, null, Object.class);
    }
}
