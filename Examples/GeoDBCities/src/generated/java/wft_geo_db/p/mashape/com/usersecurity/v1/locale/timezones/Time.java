package wft_geo_db.p.mashape.com.usersecurity.v1.locale.timezones;

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
     * Get time-zone time
     * 
     * <p>
     * Get time-zone time
     * </p>
     * 
     * @param zoneId
     *     The time-zone id
     */
    public Requested<TimeResponse> getByZoneId(String zoneId) {
        String url = ("https://wft-geo-db.p.mashape.com//v1/locale/timezones/{zoneId}/time".replace("{zoneId}", ""+zoneId));
        return requestGet(url, null, TimeResponse.class);
    }
}
