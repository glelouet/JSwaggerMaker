package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class BlockAutoGeneratedEmails
    extends DelegateTransfer<Anonymous>
{

    public BlockAutoGeneratedEmails(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * block auto generated emails
     * </p>
     * 
     * @param block_auto_generated_emails
     *     Block incoming emails identified as being auto generated.
     */
    public void put(boolean block_auto_generated_emails) {
        String url = ("https://discourse.example.com//admin/site_settings/block_auto_generated_emails");
        Map<String, Object> content = new HashMap<>();
        content.put("block_auto_generated_emails", (block_auto_generated_emails));
        requestPut(url, null, content, Void.class);
    }
}
