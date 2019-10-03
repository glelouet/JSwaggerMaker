package esi.evetech.net.anonymous;

import esi.evetech.net.Anonymous;
import esi.evetech.net.anonymous.contracts.Public;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Contracts
    extends DelegateTransfer<Anonymous>
{
    public final Public public_;

    public Contracts(Anonymous delegate) {
        super(delegate);
        public_ = new Public((delegate));
    }
}
