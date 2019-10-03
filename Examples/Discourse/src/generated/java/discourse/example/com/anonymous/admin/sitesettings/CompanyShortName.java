package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class CompanyShortName
    extends DelegateTransfer<Anonymous>
{

    public CompanyShortName(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the company short name
     * </p>
     * 
     * @param company_short_name
     */
    public void put(String company_short_name) {
        String url = ("https://discourse.example.com//admin/site_settings/company_short_name");
        Map<String, Object> content = new HashMap<>();
        content.put("company_short_name", (company_short_name));
        requestPut(url, null, content, Void.class);
    }
}
