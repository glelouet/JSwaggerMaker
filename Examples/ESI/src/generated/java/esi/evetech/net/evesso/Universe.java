package esi.evetech.net.evesso;

import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.universe.Structures;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Universe
    extends DelegateTransfer<Evesso>
{
    public final Structures structures;

    public Universe(Evesso delegate) {
        super(delegate);
        structures = new Structures((delegate));
    }
}
