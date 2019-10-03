package esi.evetech.net.anonymous;

import esi.evetech.net.Anonymous;
import esi.evetech.net.anonymous.markets.Groups;
import esi.evetech.net.anonymous.markets.History;
import esi.evetech.net.anonymous.markets.Orders;
import esi.evetech.net.anonymous.markets.Prices;
import esi.evetech.net.anonymous.markets.Types;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Markets
    extends DelegateTransfer<Anonymous>
{
    public final Groups groups;
    public final Prices prices;
    public final History history;
    public final Orders orders;
    public final Types types;

    public Markets(Anonymous delegate) {
        super(delegate);
        groups = new Groups((delegate));
        prices = new Prices((delegate));
        history = new History((delegate));
        orders = new Orders((delegate));
        types = new Types((delegate));
    }
}
