package discourse.example.com.anonymous;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Categories
    extends DelegateTransfer<Anonymous>
{

    public Categories(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update a single category
     * </p>
     * 
     * @param name
     * @param color
     * @param text_color
     */
    public Requested<Object> putById(String name, String color, String text_color) {
        String url = ("https://discourse.example.com//categories/{id}");
        Map<String, Object> content = new HashMap<>();
        content.put("name", (name));
        content.put("color", (color));
        content.put("text_color", (text_color));
        return requestPut(url, null, content, Object.class);
    }
}
