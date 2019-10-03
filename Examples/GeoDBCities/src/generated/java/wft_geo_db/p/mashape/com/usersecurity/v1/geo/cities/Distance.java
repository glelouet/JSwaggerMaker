package wft_geo_db.p.mashape.com.usersecurity.v1.geo.cities;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import wft_geo_db.p.mashape.com.UserSecurity;
import wft_geo_db.p.mashape.com.definitions.DistanceResponse;

public class Distance
    extends DelegateTransfer<UserSecurity>
{

    public Distance(UserSecurity delegate) {
        super(delegate);
    }

    /**
     * Get city distance
     * 
     * <p>
     * Get distance to the given city
     * </p>
     * 
     * @param cityId
     *     The city id (either native 'id' or 'wikiDataId')
     * @param fromCityId
     *     Distance from this city
     * @param distanceUnit
     *     The unit of distance: MI | KM
     */
    public Requested<DistanceResponse> getByCityId(String cityId, String fromCityId, String distanceUnit) {
        String url = ("https://wft-geo-db.p.mashape.com//v1/geo/cities/{cityId}/distance".replace("{cityId}", ""+cityId)+"?"+(fromCityId==null?"":"&fromCityId="+flatten(fromCityId))+(distanceUnit==null?"":"&distanceUnit="+flatten(distanceUnit)));
        return requestGet(url, null, DistanceResponse.class);
    }
}
