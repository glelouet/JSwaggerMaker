package discourse.example.com.anonymous.admin;

import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.admin.customize.EmailTemplates_json;
import discourse.example.com.anonymous.admin.customize.UserFields;
import discourse.example.com.anonymous.admin.customize.UserFields_json;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Customize
    extends DelegateTransfer<Anonymous>
{
    public final EmailTemplates_json email_templates_json;
    public final UserFields_json user_fields_json;
    public final UserFields user_fields;

    public Customize(Anonymous delegate) {
        super(delegate);
        email_templates_json = new EmailTemplates_json((delegate));
        user_fields_json = new UserFields_json((delegate));
        user_fields = new UserFields((delegate));
    }
}
