package esi.evetech.net.anonymous;

import esi.evetech.net.Anonymous;
import esi.evetech.net.anonymous.industry.Facilities;
import esi.evetech.net.anonymous.industry.Systems;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Industry
    extends DelegateTransfer<Anonymous>
{
    public final Facilities facilities;
    public final Systems systems;

    public Industry(Anonymous delegate) {
        super(delegate);
        facilities = new Facilities((delegate));
        systems = new Systems((delegate));
    }
}
