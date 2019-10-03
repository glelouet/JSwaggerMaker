package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl2RequiresTopicsEntered
    extends DelegateTransfer<Anonymous>
{

    public Tl2RequiresTopicsEntered(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl2 requires topics entered
     * </p>
     * 
     * @param tl2_requires_topics_entered
     *     "How many topics a user must enter before promotion to trust level 2."
     *     
     */
    public void put(long tl2_requires_topics_entered) {
        String url = ("https://discourse.example.com//admin/site_settings/tl2_requires_topics_entered");
        Map<String, Object> content = new HashMap<>();
        content.put("tl2_requires_topics_entered", (tl2_requires_topics_entered));
        requestPut(url, null, content, Void.class);
    }
}
