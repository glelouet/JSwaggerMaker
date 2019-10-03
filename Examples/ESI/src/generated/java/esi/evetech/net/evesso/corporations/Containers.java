package esi.evetech.net.evesso.corporations;

import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.corporations.containers.Logs;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Containers
    extends DelegateTransfer<Evesso>
{
    public final Logs logs;

    public Containers(Evesso delegate) {
        super(delegate);
        logs = new Logs((delegate));
    }
}
