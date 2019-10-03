package wft_geo_db.p.mashape.com.usersecurity.v1.geo.cities;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import wft_geo_db.p.mashape.com.UserSecurity;
import wft_geo_db.p.mashape.com.definitions.DateTimeResponse;

public class Datetime
    extends DelegateTransfer<UserSecurity>
{

    public Datetime(UserSecurity delegate) {
        super(delegate);
    }

    /**
     * Get city date-time
     * 
     * <p>
     * Get city date-time
     * </p>
     * 
     * @param cityId
     *     The city id (either native 'id' or 'wikiDataId')
     */
    public Requested<DateTimeResponse> getByCityId(String cityId) {
        String url = ("https://wft-geo-db.p.mashape.com//v1/geo/cities/{cityId}/dateTime".replace("{cityId}", ""+cityId));
        return requestGet(url, null, DateTimeResponse.class);
    }
}
