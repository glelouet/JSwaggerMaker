package esi.evetech.net.evesso.fleets;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.Evesso;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Squads
    extends DelegateTransfer<Evesso>
{

    public Squads(Evesso delegate) {
        super(delegate);
    }

    /**
     * Rename fleet squad
     * 
     * <p>
     * Rename a fleet squad
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param fleet_id
     *     ID for a fleet
     * @param name
     *     name string
     * @param squad_id
     *     The squad to rename
     * @param token
     *     Access token to use if unable to set a header
     */
    public void putByFleetIdSquadId(long fleet_id, String name, long squad_id) {
        String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/squads/{squad_id}/".replace("{fleet_id}", ""+fleet_id).replace("{squad_id}", ""+squad_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        Map<String, Object> content = new HashMap<>();
        content.put("name", (name));
        requestPut(url, null, content, Void.class);
    }

    /**
     * Delete fleet squad
     * 
     * <p>
     * Delete a fleet squad, only empty squads can be deleted
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param fleet_id
     *     ID for a fleet
     * @param squad_id
     *     The squad to delete
     * @param token
     *     Access token to use if unable to set a header
     */
    public void deleteByFleetIdSquadId(long fleet_id, long squad_id) {
        String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/squads/{squad_id}/".replace("{fleet_id}", ""+fleet_id).replace("{squad_id}", ""+squad_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        requestDel(url, null, Void.class);
    }
}
