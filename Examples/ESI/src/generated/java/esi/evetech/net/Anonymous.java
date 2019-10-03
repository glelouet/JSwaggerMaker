package esi.evetech.net;

import esi.evetech.net.anonymous.Alliances;
import esi.evetech.net.anonymous.Characters;
import esi.evetech.net.anonymous.Contracts;
import esi.evetech.net.anonymous.Corporations;
import esi.evetech.net.anonymous.Dogma;
import esi.evetech.net.anonymous.Fw;
import esi.evetech.net.anonymous.Incursions;
import esi.evetech.net.anonymous.Industry;
import esi.evetech.net.anonymous.Insurance;
import esi.evetech.net.anonymous.Killmails;
import esi.evetech.net.anonymous.Loyalty;
import esi.evetech.net.anonymous.Markets;
import esi.evetech.net.anonymous.Opportunities;
import esi.evetech.net.anonymous.Route;
import esi.evetech.net.anonymous.Search;
import esi.evetech.net.anonymous.Sovereignty;
import esi.evetech.net.anonymous.Status;
import esi.evetech.net.anonymous.Universe;
import esi.evetech.net.anonymous.Wars;
import fr.lelouet.jswaggermaker.client.common.impl.securities.Disconnected;


/**
 * access esi.evetech.net with no authorization.
 */
public class Anonymous
    extends Disconnected
{
    public final Alliances alliances = new Alliances(this);
    /**
     * The server name you would like data from
     */
    public esi.evetech.net.structures.datasource datasource;
    public final Characters characters = new Characters(this);
    public final Contracts contracts = new Contracts(this);
    public final Corporations corporations = new Corporations(this);
    public final Dogma dogma = new Dogma(this);
    public final Fw fw = new Fw(this);
    public final Incursions incursions = new Incursions(this);
    public final Industry industry = new Industry(this);
    public final Insurance insurance = new Insurance(this);
    public final Killmails killmails = new Killmails(this);
    public final Loyalty loyalty = new Loyalty(this);
    public final Markets markets = new Markets(this);
    public final Opportunities opportunities = new Opportunities(this);
    public final Route route = new Route(this);
    public final Sovereignty sovereignty = new Sovereignty(this);
    public final Status status = new Status(this);
    public final Universe universe = new Universe(this);
    public final Wars wars = new Wars(this);
    public final Search search = new Search(this);
}
