package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class CompanyFullName
    extends DelegateTransfer<Anonymous>
{

    public CompanyFullName(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the company full name
     * </p>
     * 
     * @param company_full_name
     */
    public void put(String company_full_name) {
        String url = ("https://discourse.example.com//admin/site_settings/company_full_name");
        Map<String, Object> content = new HashMap<>();
        content.put("company_full_name", (company_full_name));
        requestPut(url, null, content, Void.class);
    }
}
