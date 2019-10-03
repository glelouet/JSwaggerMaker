package esi.evetech.net.evesso;

import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.ui.Autopilot;
import esi.evetech.net.evesso.ui.Openwindow;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Ui
    extends DelegateTransfer<Evesso>
{
    public final Openwindow openwindow;
    public final Autopilot autopilot;

    public Ui(Evesso delegate) {
        super(delegate);
        openwindow = new Openwindow((delegate));
        autopilot = new Autopilot((delegate));
    }
}
