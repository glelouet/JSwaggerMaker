package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ConvertPastedImagesToHqJpg
    extends DelegateTransfer<Anonymous>
{

    public ConvertPastedImagesToHqJpg(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * convert pasted images to hq jpg
     * </p>
     * 
     * @param convert_pasted_images_to_hq_jpg
     *     "Convert pasted images to high-quality JPG files."
     *     
     */
    public void put(boolean convert_pasted_images_to_hq_jpg) {
        String url = ("https://discourse.example.com//admin/site_settings/convert_pasted_images_to_hq_jpg");
        Map<String, Object> content = new HashMap<>();
        content.put("convert_pasted_images_to_hq_jpg", (convert_pasted_images_to_hq_jpg));
        requestPut(url, null, content, Void.class);
    }
}
