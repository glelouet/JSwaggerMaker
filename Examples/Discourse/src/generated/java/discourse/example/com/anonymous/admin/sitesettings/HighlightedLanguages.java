package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class HighlightedLanguages
    extends DelegateTransfer<Anonymous>
{

    public HighlightedLanguages(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * highlighted languages
     * </p>
     * 
     * @param highlighted_languages
     */
    public void put(String highlighted_languages) {
        String url = ("https://discourse.example.com//admin/site_settings/highlighted_languages");
        Map<String, Object> content = new HashMap<>();
        content.put("highlighted_languages", (highlighted_languages));
        requestPut(url, null, content, Void.class);
    }
}
