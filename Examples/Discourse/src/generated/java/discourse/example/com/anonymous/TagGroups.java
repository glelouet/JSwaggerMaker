package discourse.example.com.anonymous;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class TagGroups
    extends DelegateTransfer<Anonymous>
{

    public TagGroups(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get a single tag group
     * </p>
     * 
     * @param id
     */
    public Requested<Object> getById(long id) {
        String url = ("https://discourse.example.com//tag_groups/{id}.json".replace("{id}", ""+id));
        return requestGet(url, null, Object.class);
    }

    /**
     * 
     * <p>
     * Update an existing tag group
     * </p>
     * 
     * @param id
     * @param name
     * @param tag_names
     */
    public Requested<Object> putById(long id, String name, String[] tag_names) {
        String url = ("https://discourse.example.com//tag_groups/{id}.json".replace("{id}", ""+id));
        Map<String, Object> content = new HashMap<>();
        content.put("name", (name));
        content.put("tag_names", (tag_names));
        return requestPut(url, null, content, Object.class);
    }
}
