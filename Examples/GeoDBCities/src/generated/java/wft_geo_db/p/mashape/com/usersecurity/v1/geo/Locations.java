package wft_geo_db.p.mashape.com.usersecurity.v1.geo;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import wft_geo_db.p.mashape.com.UserSecurity;
import wft_geo_db.p.mashape.com.usersecurity.v1.geo.locations.Nearbycities;
import wft_geo_db.p.mashape.com.usersecurity.v1.geo.locations.Nearbydivisions;

public class Locations
    extends DelegateTransfer<UserSecurity>
{
    public final Nearbycities nearbycities;
    public final Nearbydivisions nearbydivisions;

    public Locations(UserSecurity delegate) {
        super(delegate);
        nearbycities = new Nearbycities((delegate));
        nearbydivisions = new Nearbydivisions((delegate));
    }
}
