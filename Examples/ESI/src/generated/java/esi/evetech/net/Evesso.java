package esi.evetech.net;

import esi.evetech.net.evesso.Alliances;
import esi.evetech.net.evesso.Characters;
import esi.evetech.net.evesso.Corporation;
import esi.evetech.net.evesso.Corporations;
import esi.evetech.net.evesso.Fleets;
import esi.evetech.net.evesso.Markets;
import esi.evetech.net.evesso.Ui;
import esi.evetech.net.evesso.Universe;
import fr.lelouet.jswaggermaker.client.common.impl.securities.Oauth2;


/**
 * access esi.evetech.net with authorization type oauth2.
 */
public class Evesso
    extends Oauth2
{
    public static final String[] SCOPES = new String[] {"esi-characters.write_contacts.v1", "esi-skills.read_skills.v1", "esi-characters.read_fatigue.v1", "esi-corporations.read_divisions.v1", "esi-corporations.read_corporation_membership.v1", "esi-bookmarks.read_character_bookmarks.v1", "esi-assets.read_corporation_assets.v1", "esi-fittings.read_fittings.v1", "esi-contracts.read_corporation_contracts.v1", "esi-fleets.write_fleet.v1", "esi-ui.write_waypoint.v1", "esi-industry.read_character_jobs.v1", "esi-bookmarks.read_corporation_bookmarks.v1", "esi-industry.read_character_mining.v1", "esi-clones.read_clones.v1", "esi-characters.read_agents_research.v1", "esi-calendar.respond_calendar_events.v1", "esi-location.read_online.v1", "esi-mail.read_mail.v1", "esi-characterstats.read.v1", "esi-search.search_structures.v1", "esi-corporations.read_contacts.v1", "esi-corporations.read_container_logs.v1", "esi-characters.read_contacts.v1", "esi-fittings.write_fittings.v1", "esi-markets.structure_markets.v1", "esi-wallet.read_corporation_wallets.v1", "esi-characters.read_corporation_roles.v1", "esi-wallet.read_character_wallet.v1", "esi-assets.read_assets.v1", "esi-killmails.read_killmails.v1", "esi-characters.read_medals.v1", "esi-location.read_ship_type.v1", "esi-skills.read_skillqueue.v1", "esi-contracts.read_character_contracts.v1", "esi-mail.send_mail.v1", "esi-alliances.read_contacts.v1", "esi-location.read_location.v1", "esi-ui.open_window.v1", "esi-fleets.read_fleet.v1", "esi-industry.read_corporation_mining.v1", "esi-corporations.read_blueprints.v1", "esi-calendar.read_calendar_events.v1", "esi-markets.read_character_orders.v1", "esi-markets.read_corporation_orders.v1", "esi-characters.read_notifications.v1", "esi-characters.read_standings.v1", "esi-characters.read_opportunities.v1", "esi-corporations.read_standings.v1", "esi-industry.read_corporation_jobs.v1", "esi-characters.read_fw_stats.v1", "esi-corporations.read_titles.v1", "esi-universe.read_structures.v1", "esi-corporations.track_members.v1", "esi-corporations.read_fw_stats.v1", "esi-characters.read_loyalty.v1", "esi-mail.organize_mail.v1", "esi-corporations.read_structures.v1", "esi-corporations.read_starbases.v1", "esi-clones.read_implants.v1", "esi-killmails.read_corporation_killmails.v1", "esi-corporations.read_medals.v1", "esi-planets.manage_planets.v1", "esi-characters.read_titles.v1", "esi-corporations.read_facilities.v1", "esi-planets.read_customs_offices.v1", "esi-characters.read_blueprints.v1"};
    public final Alliances alliances = new Alliances(this);
    /**
     * The server name you would like data from
     */
    public esi.evetech.net.structures.datasource datasource;
    /**
     * Access token to use if unable to set a header
     */
    public String token;
    public final Characters characters = new Characters(this);
    public final Corporation corporation = new Corporation(this);
    public final Corporations corporations = new Corporations(this);
    public final Fleets fleets = new Fleets(this);
    public final Markets markets = new Markets(this);
    public final Ui ui = new Ui(this);
    public final Universe universe = new Universe(this);

    public Evesso(String refreshToken, String basicAuth) {
        super(refreshToken, basicAuth, "https://login.eveonline.com/v2/oauth/authorize");
    }
}
