package wft_geo_db.p.mashape.com.usersecurity.v1;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import wft_geo_db.p.mashape.com.UserSecurity;
import wft_geo_db.p.mashape.com.usersecurity.v1.geo.Admindivisions;
import wft_geo_db.p.mashape.com.usersecurity.v1.geo.Cities;
import wft_geo_db.p.mashape.com.usersecurity.v1.geo.Countries;
import wft_geo_db.p.mashape.com.usersecurity.v1.geo.Locations;

public class Geo
    extends DelegateTransfer<UserSecurity>
{
    public final Admindivisions admindivisions;
    public final Cities cities;
    public final Countries countries;
    public final Locations locations;

    public Geo(UserSecurity delegate) {
        super(delegate);
        admindivisions = new Admindivisions((delegate));
        cities = new Cities((delegate));
        countries = new Countries((delegate));
        locations = new Locations((delegate));
    }
}
