package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AttachmentContentTypeBlacklist
    extends DelegateTransfer<Anonymous>
{

    public AttachmentContentTypeBlacklist(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * attachment content type blacklist
     * </p>
     * 
     * @param attachment_content_type_blacklist
     *     Pipe delimited list of keywords used to blacklist attachments based on the content type.
     */
    public void put(String attachment_content_type_blacklist) {
        String url = ("https://discourse.example.com//admin/site_settings/attachment_content_type_blacklist");
        Map<String, Object> content = new HashMap<>();
        content.put("attachment_content_type_blacklist", (attachment_content_type_blacklist));
        requestPut(url, null, content, Void.class);
    }
}
