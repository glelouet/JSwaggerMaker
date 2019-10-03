package esi.evetech.net.evesso.corporations;

import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.corporations.fw.Stats;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Fw
    extends DelegateTransfer<Evesso>
{
    public final Stats stats;

    public Fw(Evesso delegate) {
        super(delegate);
        stats = new Stats((delegate));
    }
}
