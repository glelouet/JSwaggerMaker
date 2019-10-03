package esi.evetech.net.evesso;

import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.markets.Structures;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Markets
    extends DelegateTransfer<Evesso>
{
    public final Structures structures;

    public Markets(Evesso delegate) {
        super(delegate);
        structures = new Structures((delegate));
    }
}
