package esi.evetech.net.evesso.characters;

import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.characters.killmails.Recent;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Killmails
    extends DelegateTransfer<Evesso>
{
    public final Recent recent;

    public Killmails(Evesso delegate) {
        super(delegate);
        recent = new Recent((delegate));
    }
}
