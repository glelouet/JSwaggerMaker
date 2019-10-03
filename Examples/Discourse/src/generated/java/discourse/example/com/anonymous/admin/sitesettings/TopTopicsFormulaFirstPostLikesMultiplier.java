package discourse.example.com.anonymous.admin.sitesettings;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TopTopicsFormulaFirstPostLikesMultiplier
    extends DelegateTransfer<Anonymous>
{

    public TopTopicsFormulaFirstPostLikesMultiplier(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * top topics formula first post likes multiplier
     * </p>
     */
    public void put() {
        String url = ("https://discourse.example.com//admin/site_settings/top_topics_formula_first_post_likes_multiplier");
        requestPut(url, null, null, Void.class);
    }
}
