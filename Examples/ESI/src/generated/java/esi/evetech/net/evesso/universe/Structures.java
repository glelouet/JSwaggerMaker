package esi.evetech.net.evesso.universe;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetUniverseStructuresStructureId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Structures
    extends DelegateTransfer<Evesso>
{

    public Structures(Evesso delegate) {
        super(delegate);
    }

    /**
     * Get structure information
     * 
     * <p>
     * Returns information on requested structure if you are on the ACL. Otherwise, returns "Forbidden" for all inputs.<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param structure_id
     *     An Eve structure ID
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetUniverseStructuresStructureId> getByStructureId(String If_None_Match, long structure_id) {
        String url = ("https://esi.evetech.net/v2/universe/structures/{structure_id}/".replace("{structure_id}", ""+structure_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetUniverseStructuresStructureId.class);
    }
}
