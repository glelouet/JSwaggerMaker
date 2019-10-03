package esi.evetech.net.anonymous.universe;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.PostUniverseIds;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Ids
    extends DelegateTransfer<Anonymous>
{

    public Ids(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Bulk names to IDs
     * 
     * <p>
     * Resolve a set of names to IDs in the following categories: agents, alliances, characters, constellations, corporations factions, inventory_types, regions, stations, and systems. Only exact matches will be returned. All names searched for are cached for 12 hours
     * </p>
     * 
     * @param Accept_Language
     *     Language to use in the response
     * @param datasource
     *     The server name you would like data from
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     * @param names
     *     The names to resolve
     */
    public Requested<PostUniverseIds> post(esi.evetech.net.structures.Accept_Language Accept_Language, esi.evetech.net.structures.language language, String[] names) {
        String url = ("https://esi.evetech.net/v1/universe/ids/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("names", names);
        return requestPost(url, headerProperties, content, PostUniverseIds.class);
    }
}
