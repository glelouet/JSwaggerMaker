package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class CensoredWords
    extends DelegateTransfer<Anonymous>
{

    public CensoredWords(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * censored words
     * </p>
     * 
     * @param censored_words
     */
    public void put(String censored_words) {
        String url = ("https://discourse.example.com//admin/site_settings/censored_words");
        Map<String, Object> content = new HashMap<>();
        content.put("censored_words", (censored_words));
        requestPut(url, null, content, Void.class);
    }
}
