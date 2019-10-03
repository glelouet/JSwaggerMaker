package api.github.com.anonymous;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.anonymous.markdown.Raw;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Markdown
    extends DelegateTransfer<Anonymous>
{
    public final Raw raw;

    public Markdown(Anonymous delegate) {
        super(delegate);
        raw = new Raw((delegate));
    }

    /**
     * 
     * <p>
     * Render an arbitrary Markdown document
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public void post(String Accept, api.github.com.definitions.Markdown body) {
        String url = ("https://api.github.com//markdown");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        requestPost(url, headerProperties, content, Void.class);
    }
}
