package esi.evetech.net.evesso.ui.autopilot;

import esi.evetech.net.Evesso;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Waypoint
    extends DelegateTransfer<Evesso>
{

    public Waypoint(Evesso delegate) {
        super(delegate);
    }

    /**
     * Set Autopilot Waypoint
     * 
     * <p>
     * Set a solar system as autopilot waypoint
     * </p>
     * 
     * @param add_to_beginning
     *     Whether this solar system should be added to the beginning of all waypoints
     * @param clear_other_waypoints
     *     Whether clean other waypoints beforing adding this one
     * @param datasource
     *     The server name you would like data from
     * @param destination_id
     *     The destination to travel to, can be solar system, station or structure's id
     * @param token
     *     Access token to use if unable to set a header
     */
    public void post(boolean add_to_beginning, boolean clear_other_waypoints, long destination_id) {
        String url = ("https://esi.evetech.net/v2/ui/autopilot/waypoint/"+"?"+"&add_to_beginning="+flatten(add_to_beginning)+"&clear_other_waypoints="+flatten(clear_other_waypoints)+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+"&destination_id="+flatten(destination_id)+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        requestPost(url, null, null, Void.class);
    }
}
