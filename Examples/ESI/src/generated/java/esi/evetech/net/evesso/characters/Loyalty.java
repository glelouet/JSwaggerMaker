package esi.evetech.net.evesso.characters;

import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.characters.loyalty.Points;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Loyalty
    extends DelegateTransfer<Evesso>
{
    public final Points points;

    public Loyalty(Evesso delegate) {
        super(delegate);
        points = new Points((delegate));
    }
}
