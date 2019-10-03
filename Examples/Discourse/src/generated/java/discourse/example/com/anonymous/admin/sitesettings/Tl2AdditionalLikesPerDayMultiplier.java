package discourse.example.com.anonymous.admin.sitesettings;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl2AdditionalLikesPerDayMultiplier
    extends DelegateTransfer<Anonymous>
{

    public Tl2AdditionalLikesPerDayMultiplier(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl2 additional likes per day multiplier
     * </p>
     */
    public void put() {
        String url = ("https://discourse.example.com//admin/site_settings/tl2_additional_likes_per_day_multiplier");
        requestPut(url, null, null, Void.class);
    }
}
