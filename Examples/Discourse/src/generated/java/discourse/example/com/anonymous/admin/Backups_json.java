package discourse.example.com.anonymous.admin;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Backups_json
    extends DelegateTransfer<Anonymous>
{

    public Backups_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * get a list of backups
     * </p>
     */
    public Requested<Object[]> get() {
        String url = ("https://discourse.example.com//admin/backups.json");
        return requestGet(url, null, Object[].class);
    }

    /**
     * 
     * <p>
     * create a backup
     * </p>
     * 
     * @param with_uploads
     */
    public Requested<Object> post(boolean with_uploads) {
        String url = ("https://discourse.example.com//admin/backups.json");
        Map<String, Object> content = new HashMap<>();
        content.put("with_uploads", with_uploads);
        return requestPost(url, null, content, Object.class);
    }
}
