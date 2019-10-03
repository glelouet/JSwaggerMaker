package discourse.example.com.anonymous;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class TagGroups_json
    extends DelegateTransfer<Anonymous>
{

    public TagGroups_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get a list of tag groups
     * </p>
     */
    public Requested<Object> get() {
        String url = ("https://discourse.example.com//tag_groups.json");
        return requestGet(url, null, Object.class);
    }

    /**
     * 
     * <p>
     * Create a new tag group
     * </p>
     * 
     * @param name
     * @param tag_names
     */
    public Requested<Object> post(String name, String[] tag_names) {
        String url = ("https://discourse.example.com//tag_groups.json");
        Map<String, Object> content = new HashMap<>();
        content.put("name", name);
        content.put("tag_names", tag_names);
        return requestPost(url, null, content, Object.class);
    }
}
