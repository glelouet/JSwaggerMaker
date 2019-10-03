package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ReadTimeWordCount
    extends DelegateTransfer<Anonymous>
{

    public ReadTimeWordCount(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * read time word count
     * </p>
     * 
     * @param read_time_word_count
     *     "Word count per minute for calculating estimated reading time."
     *     
     */
    public void put(long read_time_word_count) {
        String url = ("https://discourse.example.com//admin/site_settings/read_time_word_count");
        Map<String, Object> content = new HashMap<>();
        content.put("read_time_word_count", (read_time_word_count));
        requestPut(url, null, content, Void.class);
    }
}
