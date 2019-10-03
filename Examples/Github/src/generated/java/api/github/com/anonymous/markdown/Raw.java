package api.github.com.anonymous.markdown;

import java.util.HashMap;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Raw
    extends DelegateTransfer<Anonymous>
{

    public Raw(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Render a Markdown document in raw mode
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     */
    public void post(String Accept) {
        String url = ("https://api.github.com//markdown/raw");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestPost(url, headerProperties, null, Void.class);
    }
}
