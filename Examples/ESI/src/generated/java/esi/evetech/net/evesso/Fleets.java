package esi.evetech.net.evesso;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.fleets.Members;
import esi.evetech.net.evesso.fleets.Squads;
import esi.evetech.net.evesso.fleets.Wings;
import esi.evetech.net.responses.GetFleetsFleetId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Fleets
    extends DelegateTransfer<Evesso>
{
    public final Members members;
    public final Squads squads;
    public final Wings wings;

    public Fleets(Evesso delegate) {
        super(delegate);
        members = new Members((delegate));
        squads = new Squads((delegate));
        wings = new Wings((delegate));
    }

    /**
     * Get fleet information
     * 
     * <p>
     * Return details about a fleet<br />
     * This route is cached for up to 5 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param fleet_id
     *     ID for a fleet
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetFleetsFleetId> getByFleetId(long fleet_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/".replace("{fleet_id}", ""+fleet_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetFleetsFleetId.class);
    }

    /**
     * Update fleet
     * 
     * <p>
     * Update settings about a fleet
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param fleet_id
     *     ID for a fleet
     * @param is_free_move
     *     Should free-move be enabled in the fleet
     * @param motd
     *     New fleet MOTD in CCP flavoured HTML
     * @param token
     *     Access token to use if unable to set a header
     */
    public void putByFleetId(long fleet_id, boolean is_free_move, String motd) {
        String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/".replace("{fleet_id}", ""+fleet_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        Map<String, Object> content = new HashMap<>();
        content.put("is_free_move", (is_free_move));
        content.put("motd", (motd));
        requestPut(url, null, content, Void.class);
    }
}
