package esi.evetech.net.evesso.corporations;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.corporations.members.Limit;
import esi.evetech.net.evesso.corporations.members.Titles;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Members
    extends DelegateTransfer<Evesso>
{
    public final Limit limit;
    public final Titles titles;

    public Members(Evesso delegate) {
        super(delegate);
        limit = new Limit((delegate));
        titles = new Titles((delegate));
    }

    /**
     * Get corporation members
     * 
     * <p>
     * Return the current member list of a corporation, the token's character need to be a member of the corporation.<br />
     * This route is cached for up to 3600 seconds
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
    public Requested<int[]> getByCorporationId(int corporation_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v3/corporations/{corporation_id}/members/".replace("{corporation_id}", ""+corporation_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, int[].class);
    }
}
