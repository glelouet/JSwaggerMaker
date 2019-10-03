package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PreventAnonsFromDownloadingFiles
    extends DelegateTransfer<Anonymous>
{

    public PreventAnonsFromDownloadingFiles(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * prevent anons from downloading files
     * </p>
     * 
     * @param prevent_anons_from_downloading_files
     *     "Prevent anonymous users from downloading attachments. WARNING: this will prevent any non-image site assets posted as attachments from working."
     *     
     */
    public void put(boolean prevent_anons_from_downloading_files) {
        String url = ("https://discourse.example.com//admin/site_settings/prevent_anons_from_downloading_files");
        Map<String, Object> content = new HashMap<>();
        content.put("prevent_anons_from_downloading_files", (prevent_anons_from_downloading_files));
        requestPut(url, null, content, Void.class);
    }
}
