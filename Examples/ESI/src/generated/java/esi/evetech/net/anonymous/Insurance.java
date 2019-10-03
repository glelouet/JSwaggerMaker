package esi.evetech.net.anonymous;

import esi.evetech.net.Anonymous;
import esi.evetech.net.anonymous.insurance.Prices;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Insurance
    extends DelegateTransfer<Anonymous>
{
    public final Prices prices;

    public Insurance(Anonymous delegate) {
        super(delegate);
        prices = new Prices((delegate));
    }
}
