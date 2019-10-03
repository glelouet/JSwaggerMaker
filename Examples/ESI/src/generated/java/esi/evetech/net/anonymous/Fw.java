package esi.evetech.net.anonymous;

import esi.evetech.net.Anonymous;
import esi.evetech.net.anonymous.fw.Leaderboards;
import esi.evetech.net.anonymous.fw.Stats;
import esi.evetech.net.anonymous.fw.Systems;
import esi.evetech.net.anonymous.fw.Wars;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Fw
    extends DelegateTransfer<Anonymous>
{
    public final Leaderboards leaderboards;
    public final Stats stats;
    public final Wars wars;
    public final Systems systems;

    public Fw(Anonymous delegate) {
        super(delegate);
        leaderboards = new Leaderboards((delegate));
        stats = new Stats((delegate));
        wars = new Wars((delegate));
        systems = new Systems((delegate));
    }
}
