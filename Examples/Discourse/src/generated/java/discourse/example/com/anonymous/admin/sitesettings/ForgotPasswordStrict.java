package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ForgotPasswordStrict
    extends DelegateTransfer<Anonymous>
{

    public ForgotPasswordStrict(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * forgot password strict
     * </p>
     * 
     * @param forgot_password_strict
     */
    public void put(boolean forgot_password_strict) {
        String url = ("https://discourse.example.com//admin/site_settings/forgot_password_strict");
        Map<String, Object> content = new HashMap<>();
        content.put("forgot_password_strict", (forgot_password_strict));
        requestPut(url, null, content, Void.class);
    }
}
