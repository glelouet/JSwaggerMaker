package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class GithubClientSecret
    extends DelegateTransfer<Anonymous>
{

    public GithubClientSecret(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * github client secret
     * </p>
     * 
     * @param github_client_secret
     */
    public void put(String github_client_secret) {
        String url = ("https://discourse.example.com//admin/site_settings/github_client_secret");
        Map<String, Object> content = new HashMap<>();
        content.put("github_client_secret", (github_client_secret));
        requestPut(url, null, content, Void.class);
    }
}
