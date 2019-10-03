package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl3RequiresLikesGiven
    extends DelegateTransfer<Anonymous>
{

    public Tl3RequiresLikesGiven(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl3 requires likes given
     * </p>
     * 
     * @param tl3_requires_likes_given
     *     "The minimum number of likes that must be given in the last (tl3 time period) days to qualify for promotion to trust level 3."
     *     
     */
    public void put(long tl3_requires_likes_given) {
        String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_likes_given");
        Map<String, Object> content = new HashMap<>();
        content.put("tl3_requires_likes_given", (tl3_requires_likes_given));
        requestPut(url, null, content, Void.class);
    }
}
