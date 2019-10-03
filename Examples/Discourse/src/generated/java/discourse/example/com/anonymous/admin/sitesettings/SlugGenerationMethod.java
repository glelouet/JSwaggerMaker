package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SlugGenerationMethod
    extends DelegateTransfer<Anonymous>
{

    public SlugGenerationMethod(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * slug generation method
     * </p>
     * 
     * @param slug_generation_method
     *     "Choose a slug generation method. 'encoded' will generate percent encoding string. 'none' will disable slug at all."
     *     
     */
    public void put(discourse.example.com.structures.slug_generation_method slug_generation_method) {
        String url = ("https://discourse.example.com//admin/site_settings/slug_generation_method");
        Map<String, Object> content = new HashMap<>();
        content.put("slug_generation_method", (slug_generation_method));
        requestPut(url, null, content, Void.class);
    }
}
