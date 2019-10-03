package esi.evetech.net.evesso;

import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.corporation.Mining;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Corporation
    extends DelegateTransfer<Evesso>
{
    public final Mining mining;

    public Corporation(Evesso delegate) {
        super(delegate);
        mining = new Mining((delegate));
    }
}
