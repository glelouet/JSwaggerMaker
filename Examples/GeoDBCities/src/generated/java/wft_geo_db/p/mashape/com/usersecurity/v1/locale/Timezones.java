package wft_geo_db.p.mashape.com.usersecurity.v1.locale;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import wft_geo_db.p.mashape.com.UserSecurity;
import wft_geo_db.p.mashape.com.definitions.TimeZonesResponse;
import wft_geo_db.p.mashape.com.usersecurity.v1.locale.timezones.Datetime;
import wft_geo_db.p.mashape.com.usersecurity.v1.locale.timezones.Time;

public class Timezones
    extends DelegateTransfer<UserSecurity>
{
    public final Datetime datetime;
    public final Time time;

    public Timezones(UserSecurity delegate) {
        super(delegate);
        datetime = new Datetime((delegate));
        time = new Time((delegate));
    }

    /**
     * Get time-zones
     * 
     * <p>
     * Get all known time-zones
     * </p>
     * 
     * @param hateoasMode
     *     Include HATEOAS-style links in results
     * @param limit
     *     The maximum number of results to retrieve
     * @param offset
     *     The zero-ary offset index into the results
     */
    public Requested<TimeZonesResponse> get(Boolean hateoasMode, Integer limit, Integer offset) {
        String url = ("https://wft-geo-db.p.mashape.com//v1/locale/timezones"+"?"+(hateoasMode==null?"":"&hateoasMode="+flatten(hateoasMode))+(limit==null?"":"&limit="+flatten(limit))+(offset==null?"":"&offset="+flatten(offset)));
        return requestGet(url, null, TimeZonesResponse.class);
    }
}
