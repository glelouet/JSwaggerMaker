package esi.evetech.net.anonymous.dogma;

import esi.evetech.net.Anonymous;
import esi.evetech.net.anonymous.dogma.dynamic.Items;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Dynamic
    extends DelegateTransfer<Anonymous>
{
    public final Items items;

    public Dynamic(Anonymous delegate) {
        super(delegate);
        items = new Items((delegate));
    }
}
