package esi.evetech.net.evesso.fleets.wings;

import esi.evetech.net.Evesso;
import esi.evetech.net.responses.PostFleetsFleetIdWingsWingIdSquadsCreated;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Squads
    extends DelegateTransfer<Evesso>
{

    public Squads(Evesso delegate) {
        super(delegate);
    }

    /**
     * Create fleet squad
     * 
     * <p>
     * Create a new squad in a fleet
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param fleet_id
     *     ID for a fleet
     * @param token
     *     Access token to use if unable to set a header
     * @param wing_id
     *     The wing_id to create squad in
     */
    public Requested<PostFleetsFleetIdWingsWingIdSquadsCreated> postByFleetIdWingId(long fleet_id, long wing_id) {
        String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/wings/{wing_id}/squads/".replace("{fleet_id}", ""+fleet_id).replace("{wing_id}", ""+wing_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        return requestPost(url, null, null, PostFleetsFleetIdWingsWingIdSquadsCreated.class);
    }
}
