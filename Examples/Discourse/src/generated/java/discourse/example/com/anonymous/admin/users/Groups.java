package discourse.example.com.anonymous.admin.users;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Groups
    extends DelegateTransfer<Anonymous>
{

    public Groups(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Assign a group to a user
     * </p>
     * 
     * @param id
     * @param group_id
     */
    public void postById(long id, long group_id) {
        String url = ("https://discourse.example.com//admin/users/{id}/groups".replace("{id}", ""+id));
        Map<String, Object> content = new HashMap<>();
        content.put("group_id", group_id);
        requestPost(url, null, content, Void.class);
    }

    /**
     * 
     * <p>
     * Remove a group assigned to a user
     * </p>
     * 
     * @param id
     * @param group_id
     */
    public void deleteByIdGroupId(long id, long group_id) {
        String url = ("https://discourse.example.com//admin/users/{id}/groups/{group_id}".replace("{id}", ""+id).replace("{group_id}", ""+group_id));
        requestDel(url, null, Void.class);
    }
}
