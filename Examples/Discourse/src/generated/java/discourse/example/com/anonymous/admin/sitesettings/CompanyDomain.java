package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class CompanyDomain
    extends DelegateTransfer<Anonymous>
{

    public CompanyDomain(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the company domain
     * </p>
     * 
     * @param company_domain
     */
    public void put(String company_domain) {
        String url = ("https://discourse.example.com//admin/site_settings/company_domain");
        Map<String, Object> content = new HashMap<>();
        content.put("company_domain", (company_domain));
        requestPut(url, null, content, Void.class);
    }
}
