package discourse.example.com.anonymous.admin.customize;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class EmailTemplates_json
    extends DelegateTransfer<Anonymous>
{

    public EmailTemplates_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Show list of email templates
     * </p>
     */
    public Requested<Object> get() {
        String url = ("https://discourse.example.com//admin/customize/email_templates.json");
        return requestGet(url, null, Object.class);
    }
}
