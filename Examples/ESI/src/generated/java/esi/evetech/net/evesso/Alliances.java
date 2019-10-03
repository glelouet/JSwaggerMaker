package esi.evetech.net.evesso;

import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.alliances.Contacts;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Alliances
    extends DelegateTransfer<Evesso>
{
    public final Contacts contacts;

    public Alliances(Evesso delegate) {
        super(delegate);
        contacts = new Contacts((delegate));
    }
}
