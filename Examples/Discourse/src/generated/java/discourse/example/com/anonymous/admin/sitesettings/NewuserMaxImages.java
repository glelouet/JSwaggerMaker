package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class NewuserMaxImages
    extends DelegateTransfer<Anonymous>
{

    public NewuserMaxImages(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * newuser max images
     * </p>
     * 
     * @param newuser_max_images
     */
    public void put(long newuser_max_images) {
        String url = ("https://discourse.example.com//admin/site_settings/newuser_max_images");
        Map<String, Object> content = new HashMap<>();
        content.put("newuser_max_images", (newuser_max_images));
        requestPut(url, null, content, Void.class);
    }
}
