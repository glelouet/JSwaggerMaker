package discourse.example.com.anonymous.admin;

import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.admin.api.WebHooks;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Api
    extends DelegateTransfer<Anonymous>
{
    public final WebHooks web_hooks;

    public Api(Anonymous delegate) {
        super(delegate);
        web_hooks = new WebHooks((delegate));
    }
}
