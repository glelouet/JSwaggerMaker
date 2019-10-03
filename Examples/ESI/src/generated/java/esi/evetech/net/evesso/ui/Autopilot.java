package esi.evetech.net.evesso.ui;

import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.ui.autopilot.Waypoint;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Autopilot
    extends DelegateTransfer<Evesso>
{
    public final Waypoint waypoint;

    public Autopilot(Evesso delegate) {
        super(delegate);
        waypoint = new Waypoint((delegate));
    }
}
