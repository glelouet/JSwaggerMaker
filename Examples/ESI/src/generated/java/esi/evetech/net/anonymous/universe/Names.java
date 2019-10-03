package esi.evetech.net.anonymous.universe;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.PostUniverseNames;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Names
    extends DelegateTransfer<Anonymous>
{

    public Names(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get names and categories for a set of IDs
     * 
     * <p>
     * Resolve a set of IDs to names and categories. Supported ID's for resolving are: Characters, Corporations, Alliances, Stations, Solar Systems, Constellations, Regions, Types, Factions
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param ids
     *     The ids to resolve
     */
    public Requested<PostUniverseNames[]> post(int[] ids) {
        String url = ("https://esi.evetech.net/v3/universe/names/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        Map<String, Object> content = new HashMap<>();
        content.put("ids", ids);
        return requestPost(url, null, content, PostUniverseNames[].class);
    }
}
