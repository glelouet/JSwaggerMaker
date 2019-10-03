package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DigestSuppressCategories
    extends DelegateTransfer<Anonymous>
{

    public DigestSuppressCategories(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * digest suppress categories
     * </p>
     * 
     * @param digest_suppress_categories
     *     pipe delimited category_id's
     */
    public void put(String digest_suppress_categories) {
        String url = ("https://discourse.example.com//admin/site_settings/digest_suppress_categories");
        Map<String, Object> content = new HashMap<>();
        content.put("digest_suppress_categories", (digest_suppress_categories));
        requestPut(url, null, content, Void.class);
    }
}
