package esi.evetech.net.evesso.corporations;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCorporationsCorporationIdStructures;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Structures
    extends DelegateTransfer<Evesso>
{
    /**
     * the roles required for {@link #getByCorporationId this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_STRUCTURES_ROLES = new String[] {"Station_Manager"};

    public Structures(Evesso delegate) {
        super(delegate);
    }

    /**
     * Get corporation structures
     * 
     * <p>
     * Get a list of corporation structures. This route's version includes the changes to structures detailed in this blog: https://www.eveonline.com/article/upwell-2.0-structures-changes-coming-on-february-13th<br />
     * This route is cached for up to 3600 seconds<br />
     * Requires one of the following EVE corporation role(s): Station_Manager
     * </p>
     * <p>
     * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_STRUCTURES_ROLES here}
     * </p>
     * 
     * @param Accept_Language
     *     Language to use in the response
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     * @param page
     *     Which page of results to return
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCorporationsCorporationIdStructures[]> getByCorporationId(esi.evetech.net.structures.Accept_Language Accept_Language,
        int corporation_id,
        String If_None_Match,
        esi.evetech.net.structures.language language,
        Integer page) {
        String url = ("https://esi.evetech.net/v3/corporations/{corporation_id}/structures/".replace("{corporation_id}", ""+corporation_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(language==null?"":"&language="+flatten(language))+(page==null?"":"&page="+flatten(page))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, GetCorporationsCorporationIdStructures[].class);
    }
}
