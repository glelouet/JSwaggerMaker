package discourse.example.com.anonymous.admin;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Email_json
    extends DelegateTransfer<Anonymous>
{

    public Email_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Show email settings
     * </p>
     */
    public Requested<Object> get() {
        String url = ("https://discourse.example.com//admin/email.json");
        return requestGet(url, null, Object.class);
    }
}
