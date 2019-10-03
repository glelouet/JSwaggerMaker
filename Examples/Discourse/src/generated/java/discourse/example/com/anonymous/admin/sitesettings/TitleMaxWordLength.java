package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TitleMaxWordLength
    extends DelegateTransfer<Anonymous>
{

    public TitleMaxWordLength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * title max word length
     * </p>
     * 
     * @param title_max_word_length
     */
    public void put(long title_max_word_length) {
        String url = ("https://discourse.example.com//admin/site_settings/title_max_word_length");
        Map<String, Object> content = new HashMap<>();
        content.put("title_max_word_length", (title_max_word_length));
        requestPut(url, null, content, Void.class);
    }
}
