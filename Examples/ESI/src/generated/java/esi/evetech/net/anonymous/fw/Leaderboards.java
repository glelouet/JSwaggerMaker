package esi.evetech.net.anonymous.fw;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.anonymous.fw.leaderboards.Characters;
import esi.evetech.net.anonymous.fw.leaderboards.Corporations;
import esi.evetech.net.responses.GetFwLeaderboards;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Leaderboards
    extends DelegateTransfer<Anonymous>
{
    public final Characters characters;
    public final Corporations corporations;

    public Leaderboards(Anonymous delegate) {
        super(delegate);
        characters = new Characters((delegate));
        corporations = new Corporations((delegate));
    }

    /**
     * List of the top factions in faction warfare
     * 
     * <p>
     * Top 4 leaderboard of factions for kills and victory points separated by total, last week and yesterday<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<GetFwLeaderboards> get(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/fw/leaderboards/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetFwLeaderboards.class);
    }
}
