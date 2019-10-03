package wft_geo_db.p.mashape.com.usersecurity;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import wft_geo_db.p.mashape.com.UserSecurity;
import wft_geo_db.p.mashape.com.usersecurity.v1.Geo;
import wft_geo_db.p.mashape.com.usersecurity.v1.Locale;

public class V1
    extends DelegateTransfer<UserSecurity>
{
    public final Geo geo;
    public final Locale locale;

    public V1(UserSecurity delegate) {
        super(delegate);
        geo = new Geo((delegate));
        locale = new Locale((delegate));
    }
}
