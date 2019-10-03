package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class CleanUpUploads
    extends DelegateTransfer<Anonymous>
{

    public CleanUpUploads(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * clean up uploads
     * </p>
     * 
     * @param clean_up_uploads
     *     "Remove orphan unreferenced uploads to prevent illegal hosting. WARNING: you may want to back up of your /uploads directory before enabling this setting."
     *     
     */
    public void put(boolean clean_up_uploads) {
        String url = ("https://discourse.example.com//admin/site_settings/clean_up_uploads");
        Map<String, Object> content = new HashMap<>();
        content.put("clean_up_uploads", (clean_up_uploads));
        requestPut(url, null, content, Void.class);
    }
}
