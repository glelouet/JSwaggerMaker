package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.admin.Api;
import discourse.example.com.anonymous.admin.Backups;
import discourse.example.com.anonymous.admin.Backups_json;
import discourse.example.com.anonymous.admin.Badges_json;
import discourse.example.com.anonymous.admin.Customize;
import discourse.example.com.anonymous.admin.Email_json;
import discourse.example.com.anonymous.admin.Emails;
import discourse.example.com.anonymous.admin.Flags;
import discourse.example.com.anonymous.admin.Groups;
import discourse.example.com.anonymous.admin.Logs;
import discourse.example.com.anonymous.admin.Plugins;
import discourse.example.com.anonymous.admin.SiteSettings;
import discourse.example.com.anonymous.admin.SiteSettings_json;
import discourse.example.com.anonymous.admin.Users;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Admin
    extends DelegateTransfer<Anonymous>
{
    public final Email_json email_json;
    public final Customize customize;
    public final Users users;
    public final Groups groups;
    public final SiteSettings_json site_settings_json;
    public final SiteSettings site_settings;
    public final Plugins plugins;
    public final Backups_json backups_json;
    public final Backups backups;
    public final Emails emails;
    public final Flags flags;
    public final Badges_json badges_json;
    public final Api api;
    public final Logs logs;

    public Admin(Anonymous delegate) {
        super(delegate);
        email_json = new Email_json((delegate));
        customize = new Customize((delegate));
        users = new Users((delegate));
        groups = new Groups((delegate));
        site_settings_json = new SiteSettings_json((delegate));
        site_settings = new SiteSettings((delegate));
        plugins = new Plugins((delegate));
        backups_json = new Backups_json((delegate));
        backups = new Backups((delegate));
        emails = new Emails((delegate));
        flags = new Flags((delegate));
        badges_json = new Badges_json((delegate));
        api = new Api((delegate));
        logs = new Logs((delegate));
    }
}
