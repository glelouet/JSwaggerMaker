package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TraditionalMarkdownLinebreaks
    extends DelegateTransfer<Anonymous>
{

    public TraditionalMarkdownLinebreaks(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * traditional markdown linebreaks
     * </p>
     * 
     * @param traditional_markdown_linebreaks
     */
    public void put(boolean traditional_markdown_linebreaks) {
        String url = ("https://discourse.example.com//admin/site_settings/traditional_markdown_linebreaks");
        Map<String, Object> content = new HashMap<>();
        content.put("traditional_markdown_linebreaks", (traditional_markdown_linebreaks));
        requestPut(url, null, content, Void.class);
    }
}
