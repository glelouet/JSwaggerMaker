package esi.evetech.net.evesso;

import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.corporations.Assets;
import esi.evetech.net.evesso.corporations.Blueprints;
import esi.evetech.net.evesso.corporations.Bookmarks;
import esi.evetech.net.evesso.corporations.Contacts;
import esi.evetech.net.evesso.corporations.Containers;
import esi.evetech.net.evesso.corporations.Contracts;
import esi.evetech.net.evesso.corporations.CustomsOffices;
import esi.evetech.net.evesso.corporations.Divisions;
import esi.evetech.net.evesso.corporations.Facilities;
import esi.evetech.net.evesso.corporations.Fw;
import esi.evetech.net.evesso.corporations.Industry;
import esi.evetech.net.evesso.corporations.Killmails;
import esi.evetech.net.evesso.corporations.Medals;
import esi.evetech.net.evesso.corporations.Members;
import esi.evetech.net.evesso.corporations.Membertracking;
import esi.evetech.net.evesso.corporations.Orders;
import esi.evetech.net.evesso.corporations.Roles;
import esi.evetech.net.evesso.corporations.Shareholders;
import esi.evetech.net.evesso.corporations.Standings;
import esi.evetech.net.evesso.corporations.Starbases;
import esi.evetech.net.evesso.corporations.Structures;
import esi.evetech.net.evesso.corporations.Titles;
import esi.evetech.net.evesso.corporations.Wallets;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Corporations
    extends DelegateTransfer<Evesso>
{
    public final Assets assets;
    public final Bookmarks bookmarks;
    public final Contacts contacts;
    public final Contracts contracts;
    public final CustomsOffices customs_offices;
    public final Divisions divisions;
    public final Facilities facilities;
    public final Fw fw;
    public final Industry industry;
    public final Killmails killmails;
    public final Medals medals;
    public final Members members;
    public final Membertracking membertracking;
    public final Roles roles;
    public final Shareholders shareholders;
    public final Standings standings;
    public final Starbases starbases;
    public final Titles titles;
    public final Wallets wallets;
    public final Blueprints blueprints;
    public final Containers containers;
    public final Orders orders;
    public final Structures structures;

    public Corporations(Evesso delegate) {
        super(delegate);
        assets = new Assets((delegate));
        bookmarks = new Bookmarks((delegate));
        contacts = new Contacts((delegate));
        contracts = new Contracts((delegate));
        customs_offices = new CustomsOffices((delegate));
        divisions = new Divisions((delegate));
        facilities = new Facilities((delegate));
        fw = new Fw((delegate));
        industry = new Industry((delegate));
        killmails = new Killmails((delegate));
        medals = new Medals((delegate));
        members = new Members((delegate));
        membertracking = new Membertracking((delegate));
        roles = new Roles((delegate));
        shareholders = new Shareholders((delegate));
        standings = new Standings((delegate));
        starbases = new Starbases((delegate));
        titles = new Titles((delegate));
        wallets = new Wallets((delegate));
        blueprints = new Blueprints((delegate));
        containers = new Containers((delegate));
        orders = new Orders((delegate));
        structures = new Structures((delegate));
    }
}
