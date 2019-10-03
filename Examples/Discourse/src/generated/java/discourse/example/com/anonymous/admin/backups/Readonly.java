package discourse.example.com.anonymous.admin.backups;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Readonly
    extends DelegateTransfer<Anonymous>
{

    public Readonly(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * update readonly mode
     * </p>
     * 
     * @param enable
     */
    public void put(boolean enable) {
        String url = ("https://discourse.example.com//admin/backups/readonly");
        Map<String, Object> content = new HashMap<>();
        content.put("enable", (enable));
        requestPut(url, null, content, Void.class);
    }
}
