package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class StripImagesFromShortEmails
    extends DelegateTransfer<Anonymous>
{

    public StripImagesFromShortEmails(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * strip images from short emails
     * </p>
     * 
     * @param strip_images_from_short_emails
     *     Strip images from emails having size less than 2800 Bytes
     */
    public void put(boolean strip_images_from_short_emails) {
        String url = ("https://discourse.example.com//admin/site_settings/strip_images_from_short_emails");
        Map<String, Object> content = new HashMap<>();
        content.put("strip_images_from_short_emails", (strip_images_from_short_emails));
        requestPut(url, null, content, Void.class);
    }
}
