package wft_geo_db.p.mashape.com.usersecurity.v1.locale.timezones;

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
     * Get time-zone date-time
     * 
     * <p>
     * Get time-zone date-time
     * </p>
     * 
     * @param zoneId
     *     The time-zone id
     */
    public Requested<DateTimeResponse> getByZoneId(String zoneId) {
        String url = ("https://wft-geo-db.p.mashape.com//v1/locale/timezones/{zoneId}/dateTime".replace("{zoneId}", ""+zoneId));
        return requestGet(url, null, DateTimeResponse.class);
    }
}
