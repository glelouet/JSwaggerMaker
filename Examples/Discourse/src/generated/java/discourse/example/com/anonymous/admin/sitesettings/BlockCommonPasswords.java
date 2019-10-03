package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class BlockCommonPasswords
    extends DelegateTransfer<Anonymous>
{

    public BlockCommonPasswords(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * block common passwords
     * </p>
     * 
     * @param block_common_passwords
     */
    public void put(boolean block_common_passwords) {
        String url = ("https://discourse.example.com//admin/site_settings/block_common_passwords");
        Map<String, Object> content = new HashMap<>();
        content.put("block_common_passwords", (block_common_passwords));
        requestPut(url, null, content, Void.class);
    }
}
