package esi.evetech.net.anonymous.loyalty;

import esi.evetech.net.Anonymous;
import esi.evetech.net.anonymous.loyalty.stores.Offers;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Stores
    extends DelegateTransfer<Anonymous>
{
    public final Offers offers;

    public Stores(Anonymous delegate) {
        super(delegate);
        offers = new Offers((delegate));
    }
}
