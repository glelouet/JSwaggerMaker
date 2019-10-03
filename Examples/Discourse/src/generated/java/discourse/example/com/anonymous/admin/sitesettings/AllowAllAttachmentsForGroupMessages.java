package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowAllAttachmentsForGroupMessages
    extends DelegateTransfer<Anonymous>
{

    public AllowAllAttachmentsForGroupMessages(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * allow all attachments for group messages
     * </p>
     * 
     * @param allow_all_attachments_for_group_messages
     *     "Allow all email attachments for group messages."
     *     
     */
    public void put(boolean allow_all_attachments_for_group_messages) {
        String url = ("https://discourse.example.com//admin/site_settings/allow_all_attachments_for_group_messages");
        Map<String, Object> content = new HashMap<>();
        content.put("allow_all_attachments_for_group_messages", (allow_all_attachments_for_group_messages));
        requestPut(url, null, content, Void.class);
    }
}
