package esi.evetech.net.anonymous;

import esi.evetech.net.Anonymous;
import esi.evetech.net.anonymous.sovereignty.Campaigns;
import esi.evetech.net.anonymous.sovereignty.Map;
import esi.evetech.net.anonymous.sovereignty.Structures;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Sovereignty
    extends DelegateTransfer<Anonymous>
{
    public final Campaigns campaigns;
    public final Map map;
    public final Structures structures;

    public Sovereignty(Anonymous delegate) {
        super(delegate);
        campaigns = new Campaigns((delegate));
        map = new Map((delegate));
        structures = new Structures((delegate));
    }
}
