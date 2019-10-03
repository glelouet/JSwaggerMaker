package esi.evetech.net.anonymous.corporations;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetCorporationsCorporationIdAlliancehistory;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Alliancehistory
    extends DelegateTransfer<Anonymous>
{

    public Alliancehistory(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get alliance history
     * 
     * <p>
     * Get a list of all the alliances a corporation has been a member of<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<GetCorporationsCorporationIdAlliancehistory[]> getByCorporationId(int corporation_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v2/corporations/{corporation_id}/alliancehistory/".replace("{corporation_id}", ""+corporation_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCorporationsCorporationIdAlliancehistory[].class);
    }
}
