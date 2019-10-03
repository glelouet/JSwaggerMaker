package esi.evetech.net.evesso.corporations;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCorporationsCorporationIdFacilities;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Facilities
    extends DelegateTransfer<Evesso>
{
    /**
     * the roles required for {@link #getByCorporationId this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_FACILITIES_ROLES = new String[] {"Factory_Manager"};

    public Facilities(Evesso delegate) {
        super(delegate);
    }

    /**
     * Get corporation facilities
     * 
     * <p>
     * Return a corporation's facilities<br />
     * This route is cached for up to 3600 seconds<br />
     * Requires one of the following EVE corporation role(s): Factory_Manager
     * </p>
     * <p>
     * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_FACILITIES_ROLES here}
     * </p>
     * 
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCorporationsCorporationIdFacilities[]> getByCorporationId(int corporation_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/facilities/".replace("{corporation_id}", ""+corporation_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCorporationsCorporationIdFacilities[].class);
    }
}
