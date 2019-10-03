package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl1RequiresTopicsEntered
    extends DelegateTransfer<Anonymous>
{

    public Tl1RequiresTopicsEntered(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl1 requires topics entered
     * </p>
     * 
     * @param tl1_requires_topics_entered
     *     "How many topics a new user must enter before promotion to trust level 1."
     *     
     */
    public void put(long tl1_requires_topics_entered) {
        String url = ("https://discourse.example.com//admin/site_settings/tl1_requires_topics_entered");
        Map<String, Object> content = new HashMap<>();
        content.put("tl1_requires_topics_entered", (tl1_requires_topics_entered));
        requestPut(url, null, content, Void.class);
    }
}
