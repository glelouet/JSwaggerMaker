package esi.evetech.net.anonymous.universe;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetUniverseGraphicsGraphicId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Graphics
    extends DelegateTransfer<Anonymous>
{

    public Graphics(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get graphics
     * 
     * <p>
     * Get a list of graphics<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<int[]> get(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/universe/graphics/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, int[].class);
    }

    /**
     * Get graphic information
     * 
     * <p>
     * Get information on a graphic<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param graphic_id
     *     graphic_id integer
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<GetUniverseGraphicsGraphicId> getByGraphicId(int graphic_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/universe/graphics/{graphic_id}/".replace("{graphic_id}", ""+graphic_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetUniverseGraphicsGraphicId.class);
    }
}
