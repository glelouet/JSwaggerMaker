package esi.evetech.net.anonymous;

import esi.evetech.net.Anonymous;
import esi.evetech.net.anonymous.dogma.Attributes;
import esi.evetech.net.anonymous.dogma.Dynamic;
import esi.evetech.net.anonymous.dogma.Effects;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Dogma
    extends DelegateTransfer<Anonymous>
{
    public final Attributes attributes;
    public final Dynamic dynamic;
    public final Effects effects;

    public Dogma(Anonymous delegate) {
        super(delegate);
        attributes = new Attributes((delegate));
        dynamic = new Dynamic((delegate));
        effects = new Effects((delegate));
    }
}
