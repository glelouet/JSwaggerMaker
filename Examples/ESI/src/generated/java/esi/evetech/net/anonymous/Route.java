package esi.evetech.net.anonymous;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Route
    extends DelegateTransfer<Anonymous>
{

    public Route(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get route
     * 
     * <p>
     * Get the systems between origin and destination<br />
     * This route is cached for up to 86400 seconds
     * </p>
     * 
     * @param avoid
     *     avoid solar system ID(s)
     * @param connections
     *     connected solar system pairs
     * @param datasource
     *     The server name you would like data from
     * @param destination
     *     destination solar system ID
     * @param flag
     *     route security preference
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param origin
     *     origin solar system ID
     */
    public Requested<int[]> getByOriginDestination(int[] avoid,
        int[][] connections,
        int destination,
        esi.evetech.net.structures.flag flag,
        String If_None_Match,
        int origin) {
        String url = ("https://esi.evetech.net/v1/route/{origin}/{destination}/".replace("{destination}", ""+destination).replace("{origin}", ""+origin)+"?"+(avoid==null?"":"&avoid="+flatten(avoid))+(connections==null?"":"&connections="+flatten(connections))+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(flag==null?"":"&flag="+flatten(flag)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, int[].class);
    }
}
