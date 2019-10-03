package discourse.example.com.anonymous.admin;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class SiteSettings_json
    extends DelegateTransfer<Anonymous>
{

    public SiteSettings_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Show site settings
     * </p>
     */
    public Requested<Object> get() {
        String url = ("https://discourse.example.com//admin/site_settings.json");
        return requestGet(url, null, Object.class);
    }
}
