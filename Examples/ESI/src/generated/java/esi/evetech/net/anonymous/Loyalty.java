package esi.evetech.net.anonymous;

import esi.evetech.net.Anonymous;
import esi.evetech.net.anonymous.loyalty.Stores;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Loyalty
    extends DelegateTransfer<Anonymous>
{
    public final Stores stores;

    public Loyalty(Anonymous delegate) {
        super(delegate);
        stores = new Stores((delegate));
    }
}
