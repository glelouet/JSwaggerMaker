package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl2RequiresLikesGiven
    extends DelegateTransfer<Anonymous>
{

    public Tl2RequiresLikesGiven(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl2 requires likes given
     * </p>
     * 
     * @param tl2_requires_likes_given
     *     "How many likes a user must cast before promotion to trust level 2."
     *     
     */
    public void put(long tl2_requires_likes_given) {
        String url = ("https://discourse.example.com//admin/site_settings/tl2_requires_likes_given");
        Map<String, Object> content = new HashMap<>();
        content.put("tl2_requires_likes_given", (tl2_requires_likes_given));
        requestPut(url, null, content, Void.class);
    }
}
