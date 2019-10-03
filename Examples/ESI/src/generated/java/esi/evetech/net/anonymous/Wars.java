package esi.evetech.net.anonymous;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.anonymous.wars.Killmails;
import esi.evetech.net.responses.GetWarsWarId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Wars
    extends DelegateTransfer<Anonymous>
{
    public final Killmails killmails;

    public Wars(Anonymous delegate) {
        super(delegate);
        killmails = new Killmails((delegate));
    }

    /**
     * List wars
     * 
     * <p>
     * Return a list of wars<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param max_war_id
     *     Only return wars with ID smaller than this
     */
    public Requested<int[]> get(String If_None_Match, Integer max_war_id) {
        String url = ("https://esi.evetech.net/v1/wars/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(max_war_id==null?"":"&max_war_id="+flatten(max_war_id)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, int[].class);
    }

    /**
     * Get war information
     * 
     * <p>
     * Return details about a war<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param war_id
     *     ID for a war
     */
    public Requested<GetWarsWarId> getByWarId(String If_None_Match, int war_id) {
        String url = ("https://esi.evetech.net/v1/wars/{war_id}/".replace("{war_id}", ""+war_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetWarsWarId.class);
    }
}
