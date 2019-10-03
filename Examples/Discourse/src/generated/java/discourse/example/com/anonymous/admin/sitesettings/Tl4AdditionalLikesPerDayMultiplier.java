package discourse.example.com.anonymous.admin.sitesettings;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl4AdditionalLikesPerDayMultiplier
    extends DelegateTransfer<Anonymous>
{

    public Tl4AdditionalLikesPerDayMultiplier(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl4 additional likes per day multiplier
     * </p>
     */
    public void put() {
        String url = ("https://discourse.example.com//admin/site_settings/tl4_additional_likes_per_day_multiplier");
        requestPut(url, null, null, Void.class);
    }
}
