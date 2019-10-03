package esi.evetech.net.anonymous;

import esi.evetech.net.Anonymous;
import esi.evetech.net.anonymous.opportunities.Groups;
import esi.evetech.net.anonymous.opportunities.Tasks;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Opportunities
    extends DelegateTransfer<Anonymous>
{
    public final Groups groups;
    public final Tasks tasks;

    public Opportunities(Anonymous delegate) {
        super(delegate);
        groups = new Groups((delegate));
        tasks = new Tasks((delegate));
    }
}
