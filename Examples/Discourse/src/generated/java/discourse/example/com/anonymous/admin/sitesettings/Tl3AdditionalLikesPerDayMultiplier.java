package discourse.example.com.anonymous.admin.sitesettings;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl3AdditionalLikesPerDayMultiplier
    extends DelegateTransfer<Anonymous>
{

    public Tl3AdditionalLikesPerDayMultiplier(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl3 additional likes per day multiplier
     * </p>
     */
    public void put() {
        String url = ("https://discourse.example.com//admin/site_settings/tl3_additional_likes_per_day_multiplier");
        requestPut(url, null, null, Void.class);
    }
}
