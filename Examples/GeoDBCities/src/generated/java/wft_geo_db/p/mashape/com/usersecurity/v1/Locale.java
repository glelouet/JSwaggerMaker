package wft_geo_db.p.mashape.com.usersecurity.v1;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import wft_geo_db.p.mashape.com.UserSecurity;
import wft_geo_db.p.mashape.com.usersecurity.v1.locale.Currencies;
import wft_geo_db.p.mashape.com.usersecurity.v1.locale.Languages;
import wft_geo_db.p.mashape.com.usersecurity.v1.locale.Locales;
import wft_geo_db.p.mashape.com.usersecurity.v1.locale.Timezones;

public class Locale
    extends DelegateTransfer<UserSecurity>
{
    public final Currencies currencies;
    public final Languages languages;
    public final Locales locales;
    public final Timezones timezones;

    public Locale(UserSecurity delegate) {
        super(delegate);
        currencies = new Currencies((delegate));
        languages = new Languages((delegate));
        locales = new Locales((delegate));
        timezones = new Timezones((delegate));
    }
}
