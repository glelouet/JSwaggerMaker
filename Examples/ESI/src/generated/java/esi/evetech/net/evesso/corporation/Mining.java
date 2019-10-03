package esi.evetech.net.evesso.corporation;

import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.corporation.mining.Extractions;
import esi.evetech.net.evesso.corporation.mining.Observers;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Mining
    extends DelegateTransfer<Evesso>
{
    public final Extractions extractions;
    public final Observers observers;

    public Mining(Evesso delegate) {
        super(delegate);
        extractions = new Extractions((delegate));
        observers = new Observers((delegate));
    }
}
