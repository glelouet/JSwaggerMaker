package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AttachmentFilenameBlacklist
    extends DelegateTransfer<Anonymous>
{

    public AttachmentFilenameBlacklist(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * attachment filename blacklist
     * </p>
     * 
     * @param attachment_filename_blacklist
     *     Pipe delimited list of keywords used to blacklist attachments based on the filename.
     */
    public void put(String attachment_filename_blacklist) {
        String url = ("https://discourse.example.com//admin/site_settings/attachment_filename_blacklist");
        Map<String, Object> content = new HashMap<>();
        content.put("attachment_filename_blacklist", (attachment_filename_blacklist));
        requestPut(url, null, content, Void.class);
    }
}
