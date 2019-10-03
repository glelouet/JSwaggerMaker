package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class GithubClientId
    extends DelegateTransfer<Anonymous>
{

    public GithubClientId(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * github client id
     * </p>
     * 
     * @param github_client_id
     */
    public void put(String github_client_id) {
        String url = ("https://discourse.example.com//admin/site_settings/github_client_id");
        Map<String, Object> content = new HashMap<>();
        content.put("github_client_id", (github_client_id));
        requestPut(url, null, content, Void.class);
    }
}
