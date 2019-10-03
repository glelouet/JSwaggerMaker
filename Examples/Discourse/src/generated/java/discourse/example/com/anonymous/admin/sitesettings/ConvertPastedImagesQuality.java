package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ConvertPastedImagesQuality
    extends DelegateTransfer<Anonymous>
{

    public ConvertPastedImagesQuality(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * convert pasted images quality
     * </p>
     * 
     * @param convert_pasted_images_quality
     *     "Quality of the converted JPG file (1 is lowest quality, 100 is best quality)."
     *     
     */
    public void put(long convert_pasted_images_quality) {
        String url = ("https://discourse.example.com//admin/site_settings/convert_pasted_images_quality");
        Map<String, Object> content = new HashMap<>();
        content.put("convert_pasted_images_quality", (convert_pasted_images_quality));
        requestPut(url, null, content, Void.class);
    }
}
