package esi.evetech.net.anonymous.universe;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetUniverseStationsStationId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Stations
    extends DelegateTransfer<Anonymous>
{

    public Stations(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get station information
     * 
     * <p>
     * Get information on a station<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param station_id
     *     station_id integer
     */
    public Requested<GetUniverseStationsStationId> getByStationId(String If_None_Match, int station_id) {
        String url = ("https://esi.evetech.net/v2/universe/stations/{station_id}/".replace("{station_id}", ""+station_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetUniverseStationsStationId.class);
    }
}
