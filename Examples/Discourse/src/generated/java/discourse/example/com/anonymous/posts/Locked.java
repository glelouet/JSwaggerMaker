package discourse.example.com.anonymous.posts;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Locked
    extends DelegateTransfer<Anonymous>
{

    public Locked(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Lock a post from being edited
     * </p>
     * 
     * @param id
     * @param locked
     *     True or False
     *     
     */
    public void putById(long id, boolean locked) {
        String url = ("https://discourse.example.com//posts/{id}/locked".replace("{id}", ""+id));
        Map<String, Object> content = new HashMap<>();
        content.put("locked", (locked));
        requestPut(url, null, content, Void.class);
    }
}
