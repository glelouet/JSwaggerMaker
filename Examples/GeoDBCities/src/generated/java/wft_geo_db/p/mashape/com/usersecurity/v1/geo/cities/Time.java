package wft_geo_db.p.mashape.com.usersecurity.v1.geo.cities;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import wft_geo_db.p.mashape.com.UserSecurity;
import wft_geo_db.p.mashape.com.definitions.TimeResponse;

public class Time
    extends DelegateTransfer<UserSecurity>
{

    public Time(UserSecurity delegate) {
        super(delegate);
    }

    /**
     * Get city time
     * 
     * <p>
     * Get city time
     * </p>
     * 
     * @param cityId
     *     The city id (either native 'id' or 'wikiDataId')
     */
    public Requested<TimeResponse> getByCityId(String cityId) {
        String url = ("https://wft-geo-db.p.mashape.com//v1/geo/cities/{cityId}/time".replace("{cityId}", ""+cityId));
        return requestGet(url, null, TimeResponse.class);
    }
}
