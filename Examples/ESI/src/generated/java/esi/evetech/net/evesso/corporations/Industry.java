package esi.evetech.net.evesso.corporations;

import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.corporations.industry.Jobs;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Industry
    extends DelegateTransfer<Evesso>
{
    public final Jobs jobs;

    public Industry(Evesso delegate) {
        super(delegate);
        jobs = new Jobs((delegate));
    }
}
