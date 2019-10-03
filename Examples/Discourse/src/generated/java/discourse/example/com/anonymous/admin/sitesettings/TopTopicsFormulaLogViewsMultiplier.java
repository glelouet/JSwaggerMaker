package discourse.example.com.anonymous.admin.sitesettings;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TopTopicsFormulaLogViewsMultiplier
    extends DelegateTransfer<Anonymous>
{

    public TopTopicsFormulaLogViewsMultiplier(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * top topics formula log views multiplier
     * </p>
     */
    public void put() {
        String url = ("https://discourse.example.com//admin/site_settings/top_topics_formula_log_views_multiplier");
        requestPut(url, null, null, Void.class);
    }
}
