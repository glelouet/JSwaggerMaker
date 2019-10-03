package discourse.example.com.anonymous;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Categories_json
    extends DelegateTransfer<Anonymous>
{

    public Categories_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get a list of categories
     * 
     * <p>
     * The Categories endpoint returns a list of all the categories for
     * your discourse site that you have access to.
     * </p>
     */
    public Requested<Object> get() {
        String url = ("https://discourse.example.com//categories.json");
        return requestGet(url, null, Object.class);
    }

    /**
     * 
     * <p>
     * Create a new category
     * </p>
     * 
     * @param name
     * @param color
     * @param text_color
     */
    public Requested<Object> post(String name, String color, String text_color) {
        String url = ("https://discourse.example.com//categories.json");
        Map<String, Object> content = new HashMap<>();
        content.put("name", name);
        content.put("color", color);
        content.put("text_color", text_color);
        return requestPost(url, null, content, Object.class);
    }
}
