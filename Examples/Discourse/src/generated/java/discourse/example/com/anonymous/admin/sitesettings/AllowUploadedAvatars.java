package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowUploadedAvatars
    extends DelegateTransfer<Anonymous>
{

    public AllowUploadedAvatars(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * allow uploaded avatars
     * </p>
     * 
     * @param allow_uploaded_avatars
     *     "Allow users to upload custom profile pictures."
     *     
     */
    public void put(boolean allow_uploaded_avatars) {
        String url = ("https://discourse.example.com//admin/site_settings/allow_uploaded_avatars");
        Map<String, Object> content = new HashMap<>();
        content.put("allow_uploaded_avatars", (allow_uploaded_avatars));
        requestPut(url, null, content, Void.class);
    }
}
