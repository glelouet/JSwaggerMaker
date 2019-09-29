package esi.evetech.net;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.responses.Getalliancesallianceidcontacts;
import esi.evetech.net.responses.Getalliancesallianceidcontactslabels;
import esi.evetech.net.responses.Getcharacterscharacteridagentsresearch;
import esi.evetech.net.responses.Getcharacterscharacteridassets;
import esi.evetech.net.responses.Getcharacterscharacteridattributes;
import esi.evetech.net.responses.Getcharacterscharacteridblueprints;
import esi.evetech.net.responses.Getcharacterscharacteridbookmarksfolders;
import esi.evetech.net.responses.Getcharacterscharacteridcalendar;
import esi.evetech.net.responses.Getcharacterscharacteridcalendareventid;
import esi.evetech.net.responses.Getcharacterscharacteridcalendareventidattendees;
import esi.evetech.net.responses.Getcharacterscharacteridclones;
import esi.evetech.net.responses.Getcharacterscharacteridcontacts;
import esi.evetech.net.responses.Getcharacterscharacteridcontracts;
import esi.evetech.net.responses.Getcharacterscharacteridcontractscontractidbids;
import esi.evetech.net.responses.Getcharacterscharacteridcontractscontractiditems;
import esi.evetech.net.responses.Getcharacterscharacteridfatigue;
import esi.evetech.net.responses.Getcharacterscharacteridfittings;
import esi.evetech.net.responses.Getcharacterscharacteridfleet;
import esi.evetech.net.responses.Getcharacterscharacteridfwstats;
import esi.evetech.net.responses.Getcharacterscharacteridindustryjobs;
import esi.evetech.net.responses.Getcharacterscharacteridkillmailsrecent;
import esi.evetech.net.responses.Getcharacterscharacteridlocation;
import esi.evetech.net.responses.Getcharacterscharacteridloyaltypoints;
import esi.evetech.net.responses.Getcharacterscharacteridmail;
import esi.evetech.net.responses.Getcharacterscharacteridmaillabels;
import esi.evetech.net.responses.Getcharacterscharacteridmaillists;
import esi.evetech.net.responses.Getcharacterscharacteridmailmailid;
import esi.evetech.net.responses.Getcharacterscharacteridmedals;
import esi.evetech.net.responses.Getcharacterscharacteridmining;
import esi.evetech.net.responses.Getcharacterscharacteridnotifications;
import esi.evetech.net.responses.Getcharacterscharacteridnotificationscontacts;
import esi.evetech.net.responses.Getcharacterscharacteridonline;
import esi.evetech.net.responses.Getcharacterscharacteridopportunities;
import esi.evetech.net.responses.Getcharacterscharacteridorders;
import esi.evetech.net.responses.Getcharacterscharacteridordershistory;
import esi.evetech.net.responses.Getcharacterscharacteridplanets;
import esi.evetech.net.responses.Getcharacterscharacteridplanetsplanetid;
import esi.evetech.net.responses.Getcharacterscharacteridroles;
import esi.evetech.net.responses.Getcharacterscharacteridsearch;
import esi.evetech.net.responses.Getcharacterscharacteridship;
import esi.evetech.net.responses.Getcharacterscharacteridskillqueue;
import esi.evetech.net.responses.Getcharacterscharacteridskills;
import esi.evetech.net.responses.Getcharacterscharacteridstandings;
import esi.evetech.net.responses.Getcharacterscharacteridstats;
import esi.evetech.net.responses.Getcharacterscharacteridtitles;
import esi.evetech.net.responses.Getcharacterscharacteridwalletjournal;
import esi.evetech.net.responses.Getcharacterscharacteridwallettransactions;
import esi.evetech.net.responses.Getcorporationcorporationidminingextractions;
import esi.evetech.net.responses.Getcorporationcorporationidminingobservers;
import esi.evetech.net.responses.Getcorporationcorporationidminingobserversobserverid;
import esi.evetech.net.responses.Getcorporationscorporationidassets;
import esi.evetech.net.responses.Getcorporationscorporationidblueprints;
import esi.evetech.net.responses.Getcorporationscorporationidbookmarks;
import esi.evetech.net.responses.Getcorporationscorporationidbookmarksfolders;
import esi.evetech.net.responses.Getcorporationscorporationidcontacts;
import esi.evetech.net.responses.Getcorporationscorporationidcontainerslogs;
import esi.evetech.net.responses.Getcorporationscorporationidcustomsoffices;
import esi.evetech.net.responses.Getcorporationscorporationiddivisions;
import esi.evetech.net.responses.Getcorporationscorporationidfacilities;
import esi.evetech.net.responses.Getcorporationscorporationidfwstats;
import esi.evetech.net.responses.Getcorporationscorporationidindustryjobs;
import esi.evetech.net.responses.Getcorporationscorporationidmedals;
import esi.evetech.net.responses.Getcorporationscorporationidmedalsissued;
import esi.evetech.net.responses.Getcorporationscorporationidmemberstitles;
import esi.evetech.net.responses.Getcorporationscorporationidmembertracking;
import esi.evetech.net.responses.Getcorporationscorporationidorders;
import esi.evetech.net.responses.Getcorporationscorporationidordershistory;
import esi.evetech.net.responses.Getcorporationscorporationidroles;
import esi.evetech.net.responses.Getcorporationscorporationidroleshistory;
import esi.evetech.net.responses.Getcorporationscorporationidshareholders;
import esi.evetech.net.responses.Getcorporationscorporationidstarbases;
import esi.evetech.net.responses.Getcorporationscorporationidstarbasesstarbaseid;
import esi.evetech.net.responses.Getcorporationscorporationidstructures;
import esi.evetech.net.responses.Getcorporationscorporationidtitles;
import esi.evetech.net.responses.Getcorporationscorporationidwallets;
import esi.evetech.net.responses.Getcorporationscorporationidwalletsdivisionjournal;
import esi.evetech.net.responses.Getcorporationscorporationidwalletsdivisiontransactions;
import esi.evetech.net.responses.Getfleetsfleetid;
import esi.evetech.net.responses.Getfleetsfleetidmembers;
import esi.evetech.net.responses.Getfleetsfleetidwings;
import esi.evetech.net.responses.Getmarketsstructuresstructureid;
import esi.evetech.net.responses.Getuniversestructuresstructureid;
import esi.evetech.net.responses.Postcharacterscharacteridassetslocations;
import esi.evetech.net.responses.Postcharacterscharacteridassetsnames;
import esi.evetech.net.responses.Postcharacterscharacteridfittingscreated;
import esi.evetech.net.responses.Postfleetsfleetidwingscreated;
import esi.evetech.net.responses.Postfleetsfleetidwingswingidsquadscreated;
import esi.evetech.net.responses.getcharacterscharacteridfittings.Getcharacterscharacteridfittingsitems;
import esi.evetech.net.responses.getcharacterscharacteridmail.Getcharacterscharacteridmailrecipients;
import fr.lelouet.jswaggermaker.client.common.impl.securities.Oauth2;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;


/**
 * access esi.evetech.net with authorization type oauth2.
 */
public class Evesso
    extends Oauth2
{
    public static final String[] SCOPES = new String[] {"esi-characters.write_contacts.v1", "esi-skills.read_skills.v1", "esi-characters.read_fatigue.v1", "esi-corporations.read_divisions.v1", "esi-corporations.read_corporation_membership.v1", "esi-bookmarks.read_character_bookmarks.v1", "esi-assets.read_corporation_assets.v1", "esi-fittings.read_fittings.v1", "esi-contracts.read_corporation_contracts.v1", "esi-fleets.write_fleet.v1", "esi-ui.write_waypoint.v1", "esi-industry.read_character_jobs.v1", "esi-bookmarks.read_corporation_bookmarks.v1", "esi-industry.read_character_mining.v1", "esi-clones.read_clones.v1", "esi-characters.read_agents_research.v1", "esi-calendar.respond_calendar_events.v1", "esi-location.read_online.v1", "esi-mail.read_mail.v1", "esi-characterstats.read.v1", "esi-search.search_structures.v1", "esi-corporations.read_contacts.v1", "esi-corporations.read_container_logs.v1", "esi-characters.read_contacts.v1", "esi-fittings.write_fittings.v1", "esi-markets.structure_markets.v1", "esi-wallet.read_corporation_wallets.v1", "esi-characters.read_corporation_roles.v1", "esi-wallet.read_character_wallet.v1", "esi-assets.read_assets.v1", "esi-killmails.read_killmails.v1", "esi-characters.read_medals.v1", "esi-location.read_ship_type.v1", "esi-skills.read_skillqueue.v1", "esi-contracts.read_character_contracts.v1", "esi-mail.send_mail.v1", "esi-alliances.read_contacts.v1", "esi-location.read_location.v1", "esi-ui.open_window.v1", "esi-fleets.read_fleet.v1", "esi-industry.read_corporation_mining.v1", "esi-corporations.read_blueprints.v1", "esi-calendar.read_calendar_events.v1", "esi-markets.read_character_orders.v1", "esi-markets.read_corporation_orders.v1", "esi-characters.read_notifications.v1", "esi-characters.read_standings.v1", "esi-characters.read_opportunities.v1", "esi-corporations.read_standings.v1", "esi-industry.read_corporation_jobs.v1", "esi-characters.read_fw_stats.v1", "esi-corporations.read_titles.v1", "esi-universe.read_structures.v1", "esi-corporations.track_members.v1", "esi-corporations.read_fw_stats.v1", "esi-characters.read_loyalty.v1", "esi-mail.organize_mail.v1", "esi-corporations.read_structures.v1", "esi-corporations.read_starbases.v1", "esi-clones.read_implants.v1", "esi-killmails.read_corporation_killmails.v1", "esi-corporations.read_medals.v1", "esi-planets.manage_planets.v1", "esi-characters.read_titles.v1", "esi-corporations.read_facilities.v1", "esi-planets.read_customs_offices.v1", "esi-characters.read_blueprints.v1"};
    public final Evesso.Alliances alliances = new Evesso.Alliances();
    /**
     * The server name you would like data from
     */
    public esi.evetech.net.structures.datasource datasource;
    /**
     * Access token to use if unable to set a header
     */
    public String token;
    public final Evesso.Characters characters = new Evesso.Characters();
    public final Evesso.Corporation corporation = new Evesso.Corporation();
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATION_CORPORATION_ID_MINING_EXTRACTIONS_ROLES = new String[] {"Station_Manager"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATION_CORPORATION_ID_MINING_OBSERVERS_ROLES = new String[] {"Accountant"};
    /**
     * the roles required for {@link #getByCorporationidObserverid this method}
     */
    public static final String[] GET_CORPORATION_CORPORATION_ID_MINING_OBSERVERS_OBSERVER_ID_ROLES = new String[] {"Accountant"};
    public final Evesso.Corporations corporations = new Evesso.Corporations();
    /**
     * the roles required for {@link #postByCorporationid this method}
     */
    public static final String[] POST_CORPORATIONS_CORPORATION_ID_ASSETS_NAMES_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_CUSTOMS_OFFICES_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_DIVISIONS_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_FACILITIES_ROLES = new String[] {"Factory_Manager"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_INDUSTRY_JOBS_ROLES = new String[] {"Factory_Manager"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_KILLMAILS_RECENT_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_MEDALS_ISSUED_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_MEMBERS_LIMIT_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_MEMBERS_TITLES_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_MEMBERTRACKING_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_ROLES_HISTORY_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_SHAREHOLDERS_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_STARBASES_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #getByCorporationidStarbaseid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_STARBASES_STARBASE_ID_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_TITLES_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_WALLETS_ROLES = new String[] {"Accountant", "Junior_Accountant"};
    /**
     * the roles required for {@link #getByCorporationidDivision this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_WALLETS_DIVISION_TRANSACTIONS_ROLES = new String[] {"Accountant", "Junior_Accountant"};
    public final Evesso.Fleets fleets = new Evesso.Fleets();
    public final Evesso.Markets markets = new Evesso.Markets();
    public final Evesso.Ui ui = new Evesso.Ui();
    /**
     * the roles required for {@link #postByCorporationid this method}
     */
    public static final String[] POST_CORPORATIONS_CORPORATION_ID_ASSETS_LOCATIONS_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_BLUEPRINTS_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_CONTAINERS_LOGS_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_ORDERS_HISTORY_ROLES = new String[] {"Accountant", "Trader"};
    public final Evesso.Universe universe = new Evesso.Universe();
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_ASSETS_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_ORDERS_ROLES = new String[] {"Accountant", "Trader"};
    /**
     * the roles required for {@link #getByCorporationid this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_STRUCTURES_ROLES = new String[] {"Station_Manager"};
    /**
     * the roles required for {@link #getByCorporationidDivision this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_WALLETS_DIVISION_JOURNAL_ROLES = new String[] {"Accountant", "Junior_Accountant"};

    public Evesso(String refreshToken, String basicAuth) {
        super(refreshToken, basicAuth, "https://login.eveonline.com/v2/oauth/authorize");
    }

    public class Alliances {
        public final Evesso.Alliances.Contacts contacts = new Evesso.Alliances.Contacts();

        public class Contacts {
            public final Evesso.Alliances.Contacts.Labels labels = new Evesso.Alliances.Contacts.Labels();

            /**
             * Get alliance contacts
             * 
             * <p>
             * Return contacts of an alliance<br />
             * This route is cached for up to 300 seconds
             * </p>
             * 
             * @param alliance_id
             *     An EVE alliance ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getalliancesallianceidcontacts[]> getByAllianceid(int alliance_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v2/alliances/{alliance_id}/contacts/".replace("{alliance_id}", ""+alliance_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getalliancesallianceidcontacts[].class);
            }

            public class Labels {

                /**
                 * Get alliance contact labels
                 * 
                 * <p>
                 * Return custom labels for an alliance's contacts<br />
                 * This route is cached for up to 300 seconds
                 * </p>
                 * 
                 * @param alliance_id
                 *     An EVE alliance ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getalliancesallianceidcontactslabels[]> getByAllianceid(int alliance_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/alliances/{alliance_id}/contacts/labels/".replace("{alliance_id}", ""+alliance_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getalliancesallianceidcontactslabels[].class);
                }
            }
        }
    }

    public class Characters {
        public final Evesso.Characters.Agentsresearch agentsresearch = new Evesso.Characters.Agentsresearch();
        public final Evesso.Characters.Assets assets = new Evesso.Characters.Assets();
        public final Evesso.Characters.Attributes attributes = new Evesso.Characters.Attributes();
        public final Evesso.Characters.Calendar calendar = new Evesso.Characters.Calendar();
        public final Evesso.Characters.Contacts contacts = new Evesso.Characters.Contacts();
        public final Evesso.Characters.Contracts contracts = new Evesso.Characters.Contracts();
        public final Evesso.Characters.Fatigue fatigue = new Evesso.Characters.Fatigue();
        public final Evesso.Characters.Fittings fittings = new Evesso.Characters.Fittings();
        public final Evesso.Characters.Fleet fleet = new Evesso.Characters.Fleet();
        public final Evesso.Characters.Fw fw = new Evesso.Characters.Fw();
        public final Evesso.Characters.Implants implants = new Evesso.Characters.Implants();
        public final Evesso.Characters.Industry industry = new Evesso.Characters.Industry();
        public final Evesso.Characters.Killmails killmails = new Evesso.Characters.Killmails();
        public final Evesso.Characters.Location location = new Evesso.Characters.Location();
        public final Evesso.Characters.Loyalty loyalty = new Evesso.Characters.Loyalty();
        public final Evesso.Characters.Mail mail = new Evesso.Characters.Mail();
        public final Evesso.Characters.Medals medals = new Evesso.Characters.Medals();
        public final Evesso.Characters.Mining mining = new Evesso.Characters.Mining();
        public final Evesso.Characters.Notifications notifications = new Evesso.Characters.Notifications();
        public final Evesso.Characters.Opportunities opportunities = new Evesso.Characters.Opportunities();
        public final Evesso.Characters.Orders orders = new Evesso.Characters.Orders();
        public final Evesso.Characters.Planets planets = new Evesso.Characters.Planets();
        public final Evesso.Characters.Ship ship = new Evesso.Characters.Ship();
        public final Evesso.Characters.Standings standings = new Evesso.Characters.Standings();
        public final Evesso.Characters.Titles titles = new Evesso.Characters.Titles();
        public final Evesso.Characters.Wallet wallet = new Evesso.Characters.Wallet();
        public final Evesso.Characters.Blueprints blueprints = new Evesso.Characters.Blueprints();
        public final Evesso.Characters.Bookmarks bookmarks = new Evesso.Characters.Bookmarks();
        public final Evesso.Characters.Online online = new Evesso.Characters.Online();
        public final Evesso.Characters.Roles roles = new Evesso.Characters.Roles();
        public final Evesso.Characters.Skillqueue skillqueue = new Evesso.Characters.Skillqueue();
        public final Evesso.Characters.Stats stats = new Evesso.Characters.Stats();
        public final Evesso.Characters.Clones clones = new Evesso.Characters.Clones();
        public final Evesso.Characters.Search search = new Evesso.Characters.Search();
        public final Evesso.Characters.Cspa cspa = new Evesso.Characters.Cspa();
        public final Evesso.Characters.Skills skills = new Evesso.Characters.Skills();

        public class Agentsresearch {

            /**
             * Get agents research
             * 
             * <p>
             * Return a list of agents research information for a character. The formula for finding the current research points with an agent is: currentPoints = remainderPoints + pointsPerDay * days(currentTime - researchStartDate)<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridagentsresearch[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/agents_research/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridagentsresearch[].class);
            }
        }

        public class Assets {
            public final Evesso.Characters.Assets.Names names = new Evesso.Characters.Assets.Names();
            public final Evesso.Characters.Assets.Locations locations = new Evesso.Characters.Assets.Locations();

            /**
             * Get character assets
             * 
             * <p>
             * Return a list of the characters assets<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridassets[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v3/characters/{character_id}/assets/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridassets[].class);
            }

            public class Locations {

                /**
                 * Get character asset locations
                 * 
                 * <p>
                 * Return locations for a set of item ids, which you can get from character assets endpoint. Coordinates for items in hangars or stations are set to (0,0,0)
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param item_ids
                 *     A list of item ids
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Postcharacterscharacteridassetslocations[]> postByCharacterid(int character_id, long[] item_ids) {
                    String url = ("https://esi.evetech.net/v2/characters/{character_id}/assets/locations/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    Map<String, Object> content = new HashMap<>();
                    content.put("item_ids", item_ids);
                    return requestPost(url, null, content, Postcharacterscharacteridassetslocations[].class);
                }
            }

            public class Names {

                /**
                 * Get character asset names
                 * 
                 * <p>
                 * Return names for a set of item ids, which you can get from character assets endpoint. Typically used for items that can customize names, like containers or ships.
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param item_ids
                 *     A list of item ids
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Postcharacterscharacteridassetsnames[]> postByCharacterid(int character_id, long[] item_ids) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/assets/names/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    Map<String, Object> content = new HashMap<>();
                    content.put("item_ids", item_ids);
                    return requestPost(url, null, content, Postcharacterscharacteridassetsnames[].class);
                }
            }
        }

        public class Attributes {

            /**
             * Get character attributes
             * 
             * <p>
             * Return attributes of a character<br />
             * This route is cached for up to 120 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridattributes> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/attributes/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridattributes.class);
            }
        }

        public class Blueprints {

            /**
             * Get blueprints
             * 
             * <p>
             * Return a list of blueprints the character owns<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridblueprints[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/blueprints/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridblueprints[].class);
            }
        }

        public class Bookmarks {
            public final Evesso.Characters.Bookmarks.Folders folders = new Evesso.Characters.Bookmarks.Folders();

            /**
             * List bookmarks
             * 
             * <p>
             * A list of your character's personal bookmarks<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcorporationscorporationidbookmarks[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/bookmarks/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcorporationscorporationidbookmarks[].class);
            }

            public class Folders {

                /**
                 * List bookmark folders
                 * 
                 * <p>
                 * A list of your character's personal bookmark folders<br />
                 * This route is cached for up to 3600 seconds
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param page
                 *     Which page of results to return
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcharacterscharacteridbookmarksfolders[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v2/characters/{character_id}/bookmarks/folders/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcharacterscharacteridbookmarksfolders[].class);
                }
            }
        }

        public class Calendar {
            public final Evesso.Characters.Calendar.Attendees attendees = new Evesso.Characters.Calendar.Attendees();

            /**
             * List calendar event summaries
             * 
             * <p>
             * Get 50 event summaries from the calendar. If no from_event ID is given, the resource will return the next 50 chronological event summaries from now. If a from_event ID is specified, it will return the next 50 chronological event summaries from after that event<br />
             * This route is cached for up to 5 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param from_event
             *     The event ID to retrieve events from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridcalendar[]> getByCharacterid(int character_id, Integer from_event, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/calendar/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(from_event==null?"":"&from_event="+flatten(from_event))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridcalendar[].class);
            }

            /**
             * Get an event
             * 
             * <p>
             * Get all the information for a specific event<br />
             * This route is cached for up to 5 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param event_id
             *     The id of the event requested
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridcalendareventid> getByCharacteridEventid(int character_id, int event_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v3/characters/{character_id}/calendar/{event_id}/".replace("{character_id}", ""+character_id).replace("{event_id}", ""+event_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridcalendareventid.class);
            }

            /**
             * Respond to an event
             * 
             * <p>
             * Set your response status to an event
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param event_id
             *     The ID of the event requested
             * @param response
             *     response string
             * @param token
             *     Access token to use if unable to set a header
             */
            public void putByCharacteridEventid(int character_id, int event_id, esi.evetech.net.structures.response response) {
                String url = ("https://esi.evetech.net/v3/characters/{character_id}/calendar/{event_id}/".replace("{character_id}", ""+character_id).replace("{event_id}", ""+event_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                Map<String, Object> content = new HashMap<>();
                content.put("response", response);
                requestPut(url, null, content, Void.class);
            }

            public class Attendees {

                /**
                 * Get attendees
                 * 
                 * <p>
                 * Get all invited attendees for a given event<br />
                 * This route is cached for up to 600 seconds
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param event_id
                 *     The id of the event requested
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcharacterscharacteridcalendareventidattendees[]> getByCharacteridEventid(int character_id, int event_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/calendar/{event_id}/attendees/".replace("{character_id}", ""+character_id).replace("{event_id}", ""+event_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcharacterscharacteridcalendareventidattendees[].class);
                }
            }
        }

        public class Clones {

            /**
             * Get clones
             * 
             * <p>
             * A list of the character's clones<br />
             * This route is cached for up to 120 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridclones> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v3/characters/{character_id}/clones/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridclones.class);
            }
        }

        public class Contacts {
            public final Evesso.Characters.Contacts.Labels labels = new Evesso.Characters.Contacts.Labels();

            /**
             * Get contacts
             * 
             * <p>
             * Return contacts of a character<br />
             * This route is cached for up to 300 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridcontacts[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/contacts/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridcontacts[].class);
            }

            /**
             * Add contacts
             * 
             * <p>
             * Bulk add contacts with same settings
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param contact_ids
             *     A list of contacts
             * @param datasource
             *     The server name you would like data from
             * @param label_ids
             *     Add custom labels to the new contact
             * @param standing
             *     Standing for the contact
             * @param token
             *     Access token to use if unable to set a header
             * @param watched
             *     Whether the contact should be watched, note this is only effective on characters
             */
            public Requested<int[]> postByCharacterid(int character_id,
                int[] contact_ids,
                long[] label_ids,
                float standing,
                Boolean watched) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/contacts/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(label_ids==null?"":"&label_ids="+flatten(label_ids))+"&standing="+flatten(standing)+(token==null?"":"&token="+flatten(token))+(watched==null?"":"&watched="+flatten(watched)));
                Map<String, Object> content = new HashMap<>();
                content.put("contact_ids", contact_ids);
                return requestPost(url, null, content, int[].class);
            }

            /**
             * Edit contacts
             * 
             * <p>
             * Bulk edit contacts with same settings
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param contact_ids
             *     A list of contacts
             * @param datasource
             *     The server name you would like data from
             * @param label_ids
             *     Add custom labels to the contact
             * @param standing
             *     Standing for the contact
             * @param token
             *     Access token to use if unable to set a header
             * @param watched
             *     Whether the contact should be watched, note this is only effective on characters
             */
            public void putByCharacterid(int character_id,
                int[] contact_ids,
                long[] label_ids,
                float standing,
                Boolean watched) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/contacts/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(label_ids==null?"":"&label_ids="+flatten(label_ids))+"&standing="+flatten(standing)+(token==null?"":"&token="+flatten(token))+(watched==null?"":"&watched="+flatten(watched)));
                Map<String, Object> content = new HashMap<>();
                content.put("contact_ids", contact_ids);
                requestPut(url, null, content, Void.class);
            }

            /**
             * Delete contacts
             * 
             * <p>
             * Bulk delete contacts
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param contact_ids
             *     A list of contacts to delete
             * @param datasource
             *     The server name you would like data from
             * @param token
             *     Access token to use if unable to set a header
             */
            public void deleteByCharacterid(int character_id, int[] contact_ids) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/contacts/".replace("{character_id}", ""+character_id)+"?"+(contact_ids==null?"":"&contact_ids="+flatten(contact_ids))+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                requestDel(url, null, Void.class);
            }

            public class Labels {

                /**
                 * Get contact labels
                 * 
                 * <p>
                 * Return custom labels for a character's contacts<br />
                 * This route is cached for up to 300 seconds
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getalliancesallianceidcontactslabels[]> getByCharacterid(int character_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/contacts/labels/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getalliancesallianceidcontactslabels[].class);
                }
            }
        }

        public class Contracts {
            public final Evesso.Characters.Contracts.Bids bids = new Evesso.Characters.Contracts.Bids();
            public final Evesso.Characters.Contracts.Items items = new Evesso.Characters.Contracts.Items();

            /**
             * Get contracts
             * 
             * <p>
             * Returns contracts available to a character, only if the character is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is "in_progress".<br />
             * This route is cached for up to 300 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridcontracts[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/contracts/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridcontracts[].class);
            }

            public class Bids {

                /**
                 * Get contract bids
                 * 
                 * <p>
                 * Lists bids on a particular auction contract<br />
                 * This route is cached for up to 300 seconds
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param contract_id
                 *     ID of a contract
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcharacterscharacteridcontractscontractidbids[]> getByCharacteridContractid(int character_id, int contract_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/contracts/{contract_id}/bids/".replace("{character_id}", ""+character_id).replace("{contract_id}", ""+contract_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcharacterscharacteridcontractscontractidbids[].class);
                }
            }

            public class Items {

                /**
                 * Get contract items
                 * 
                 * <p>
                 * Lists items of a particular contract<br />
                 * This route is cached for up to 3600 seconds
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param contract_id
                 *     ID of a contract
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcharacterscharacteridcontractscontractiditems[]> getByCharacteridContractid(int character_id, int contract_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/contracts/{contract_id}/items/".replace("{character_id}", ""+character_id).replace("{contract_id}", ""+contract_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcharacterscharacteridcontractscontractiditems[].class);
                }
            }
        }

        public class Cspa {

            /**
             * Calculate a CSPA charge cost
             * 
             * <p>
             * Takes a source character ID in the url and a set of target character ID's in the body, returns a CSPA charge cost
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param characters
             *     The target characters to calculate the charge for
             * @param datasource
             *     The server name you would like data from
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Float> postByCharacterid(int character_id, int[] characters) {
                String url = ("https://esi.evetech.net/v4/characters/{character_id}/cspa/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                Map<String, Object> content = new HashMap<>();
                content.put("characters", characters);
                return requestPost(url, null, content, Float.class);
            }
        }

        public class Fatigue {

            /**
             * Get jump fatigue
             * 
             * <p>
             * Return a character's jump activation and fatigue information<br />
             * This route is cached for up to 300 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridfatigue> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/fatigue/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridfatigue.class);
            }
        }

        public class Fittings {

            /**
             * Delete fitting
             * 
             * <p>
             * Delete a fitting from a character
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param fitting_id
             *     ID for a fitting of this character
             * @param token
             *     Access token to use if unable to set a header
             */
            public void deleteByCharacteridFittingid(int character_id, int fitting_id) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/fittings/{fitting_id}/".replace("{character_id}", ""+character_id).replace("{fitting_id}", ""+fitting_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                requestDel(url, null, Void.class);
            }

            /**
             * Get fittings
             * 
             * <p>
             * Return fittings of a character<br />
             * This route is cached for up to 300 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridfittings[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/fittings/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridfittings[].class);
            }

            /**
             * Create fitting
             * 
             * <p>
             * Save a new fitting for a character
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param description
             *     description string
             * @param items
             *     items array
             * @param name
             *     name string
             * @param ship_type_id
             *     ship_type_id integer
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Postcharacterscharacteridfittingscreated> postByCharacterid(int character_id,
                String description,
                Getcharacterscharacteridfittingsitems[] items,
                String name,
                int ship_type_id) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/fittings/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                Map<String, Object> content = new HashMap<>();
                content.put("description", description);
                content.put("items", items);
                content.put("name", name);
                content.put("ship_type_id", ship_type_id);
                return requestPost(url, null, content, Postcharacterscharacteridfittingscreated.class);
            }
        }

        public class Fleet {

            /**
             * Get character fleet info
             * 
             * <p>
             * Return the fleet ID the character is in, if any.<br />
             * This route is cached for up to 60 seconds<br />
             * Warning: This route has an upgrade available<br />
             * [Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/characters/{character_id}/fleet/)
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridfleet> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/fleet/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridfleet.class);
            }
        }

        public class Fw {
            public final Evesso.Characters.Fw.Stats stats = new Evesso.Characters.Fw.Stats();

            public class Stats {

                /**
                 * Overview of a character involved in faction warfare
                 * 
                 * <p>
                 * Statistical overview of a character involved in faction warfare<br />
                 * This route expires daily at 11:05
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcharacterscharacteridfwstats> getByCharacterid(int character_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/fw/stats/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcharacterscharacteridfwstats.class);
                }
            }
        }

        public class Implants {

            /**
             * Get active implants
             * 
             * <p>
             * Return implants on the active clone of a character<br />
             * This route is cached for up to 120 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<int[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/implants/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, int[].class);
            }
        }

        public class Industry {
            public final Evesso.Characters.Industry.Jobs jobs = new Evesso.Characters.Industry.Jobs();

            public class Jobs {

                /**
                 * List character industry jobs
                 * 
                 * <p>
                 * List industry jobs placed by a character<br />
                 * This route is cached for up to 300 seconds
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param include_completed
                 *     Whether to retrieve completed character industry jobs. Only includes jobs from the past 90 days
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcharacterscharacteridindustryjobs[]> getByCharacterid(int character_id, String If_None_Match, Boolean include_completed) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/industry/jobs/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(include_completed==null?"":"&include_completed="+flatten(include_completed))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcharacterscharacteridindustryjobs[].class);
                }
            }
        }

        public class Killmails {
            public final Evesso.Characters.Killmails.Recent recent = new Evesso.Characters.Killmails.Recent();

            public class Recent {

                /**
                 * Get a character's recent kills and losses
                 * 
                 * <p>
                 * Return a list of a character's kills and losses going back 90 days<br />
                 * This route is cached for up to 300 seconds
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param page
                 *     Which page of results to return
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcharacterscharacteridkillmailsrecent[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/killmails/recent/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcharacterscharacteridkillmailsrecent[].class);
                }
            }
        }

        public class Location {

            /**
             * Get character location
             * 
             * <p>
             * Information about the characters current location. Returns the current solar system id, and also the current station or structure ID if applicable<br />
             * This route is cached for up to 5 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridlocation> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/location/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridlocation.class);
            }
        }

        public class Loyalty {
            public final Evesso.Characters.Loyalty.Points points = new Evesso.Characters.Loyalty.Points();

            public class Points {

                /**
                 * Get loyalty points
                 * 
                 * <p>
                 * Return a list of loyalty points for all corporations the character has worked for<br />
                 * This route is cached for up to 3600 seconds
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcharacterscharacteridloyaltypoints[]> getByCharacterid(int character_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/loyalty/points/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcharacterscharacteridloyaltypoints[].class);
                }
            }
        }

        public class Mail {
            public final Evesso.Characters.Mail.Labels labels = new Evesso.Characters.Mail.Labels();
            public final Evesso.Characters.Mail.Lists lists = new Evesso.Characters.Mail.Lists();

            /**
             * Return mail headers
             * 
             * <p>
             * Return the 50 most recent mail headers belonging to the character that match the query criteria. Queries can be filtered by label, and last_mail_id can be used to paginate backwards<br />
             * This route is cached for up to 30 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param labels
             *     Fetch only mails that match one or more of the given labels
             * @param last_mail_id
             *     List only mail with an ID lower than the given ID, if present
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridmail[]> getByCharacterid(int character_id,
                String If_None_Match,
                int[] labels,
                Integer last_mail_id) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/mail/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(labels==null?"":"&labels="+flatten(labels))+(last_mail_id==null?"":"&last_mail_id="+flatten(last_mail_id))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridmail[].class);
            }

            /**
             * Send a new mail
             * 
             * <p>
             * Create and send a new mail
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param approved_cost
             *     approved_cost integer
             * @param body
             *     body string
             * @param recipients
             *     recipients array
             * @param subject
             *     subject string
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Integer> postByCharacterid(int character_id,
                long approved_cost,
                String body,
                Getcharacterscharacteridmailrecipients[] recipients,
                String subject) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/mail/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                Map<String, Object> content = new HashMap<>();
                content.put("approved_cost", approved_cost);
                content.put("body", body);
                content.put("recipients", recipients);
                content.put("subject", subject);
                return requestPost(url, null, content, Integer.class);
            }

            /**
             * Return a mail
             * 
             * <p>
             * Return the contents of an EVE mail<br />
             * This route is cached for up to 30 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param mail_id
             *     An EVE mail ID
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridmailmailid> getByCharacteridMailid(int character_id, String If_None_Match, int mail_id) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/mail/{mail_id}/".replace("{character_id}", ""+character_id).replace("{mail_id}", ""+mail_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridmailmailid.class);
            }

            /**
             * Update metadata about a mail
             * 
             * <p>
             * Update metadata about a mail
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param labels
             *     Labels to assign to the mail. Pre-existing labels are unassigned.
             * @param read
             *     Whether the mail is flagged as read
             * @param datasource
             *     The server name you would like data from
             * @param mail_id
             *     An EVE mail ID
             * @param token
             *     Access token to use if unable to set a header
             */
            public void putByCharacteridMailid(int character_id,
                int[] labels,
                boolean read,
                int mail_id) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/mail/{mail_id}/".replace("{character_id}", ""+character_id).replace("{mail_id}", ""+mail_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                Map<String, Object> content = new HashMap<>();
                content.put("labels", labels);
                content.put("read", read);
                requestPut(url, null, content, Void.class);
            }

            /**
             * Delete a mail
             * 
             * <p>
             * Delete a mail
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param mail_id
             *     An EVE mail ID
             * @param token
             *     Access token to use if unable to set a header
             */
            public void deleteByCharacteridMailid(int character_id, int mail_id) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/mail/{mail_id}/".replace("{character_id}", ""+character_id).replace("{mail_id}", ""+mail_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                requestDel(url, null, Void.class);
            }

            public class Labels {

                /**
                 * Delete a mail label
                 * 
                 * <p>
                 * Delete a mail label
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param label_id
                 *     An EVE label id
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public void deleteByCharacteridLabelid(int character_id, int label_id) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/mail/labels/{label_id}/".replace("{character_id}", ""+character_id).replace("{label_id}", ""+label_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    requestDel(url, null, Void.class);
                }

                /**
                 * Create a mail label
                 * 
                 * <p>
                 * Create a mail label
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param color
                 *     Hexadecimal string representing label color, in RGB format
                 * @param name
                 *     name string
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Integer> postByCharacterid(int character_id, esi.evetech.net.structures.color color, String name) {
                    String url = ("https://esi.evetech.net/v2/characters/{character_id}/mail/labels/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    Map<String, Object> content = new HashMap<>();
                    content.put("color", color);
                    content.put("name", name);
                    return requestPost(url, null, content, Integer.class);
                }

                /**
                 * Get mail labels and unread counts
                 * 
                 * <p>
                 * Return a list of the users mail labels, unread counts for each label and a total unread count.<br />
                 * This route is cached for up to 30 seconds
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcharacterscharacteridmaillabels> getByCharacterid(int character_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v3/characters/{character_id}/mail/labels/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcharacterscharacteridmaillabels.class);
                }
            }

            public class Lists {

                /**
                 * Return mailing list subscriptions
                 * 
                 * <p>
                 * Return all mailing lists that the character is subscribed to<br />
                 * This route is cached for up to 120 seconds
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcharacterscharacteridmaillists[]> getByCharacterid(int character_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/mail/lists/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcharacterscharacteridmaillists[].class);
                }
            }
        }

        public class Medals {

            /**
             * Get medals
             * 
             * <p>
             * Return a list of medals the character has<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridmedals[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/medals/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridmedals[].class);
            }
        }

        public class Mining {

            /**
             * Character mining ledger
             * 
             * <p>
             * Paginated record of all mining done by a character for the past 30 days<br />
             * This route is cached for up to 600 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridmining[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/mining/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridmining[].class);
            }
        }

        public class Notifications {
            public final Evesso.Characters.Notifications.Contacts contacts = new Evesso.Characters.Notifications.Contacts();

            /**
             * Get character notifications
             * 
             * <p>
             * Return character notifications<br />
             * This route is cached for up to 600 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridnotifications[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v5/characters/{character_id}/notifications/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridnotifications[].class);
            }

            public class Contacts {

                /**
                 * Get new contact notifications
                 * 
                 * <p>
                 * Return notifications about having been added to someone's contact list<br />
                 * This route is cached for up to 600 seconds
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcharacterscharacteridnotificationscontacts[]> getByCharacterid(int character_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/notifications/contacts/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcharacterscharacteridnotificationscontacts[].class);
                }
            }
        }

        public class Online {

            /**
             * Get character online
             * 
             * <p>
             * Checks if the character is currently online<br />
             * This route is cached for up to 60 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridonline> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/online/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridonline.class);
            }
        }

        public class Opportunities {

            /**
             * Get a character's completed tasks
             * 
             * <p>
             * Return a list of tasks finished by a character<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridopportunities[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/opportunities/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridopportunities[].class);
            }
        }

        public class Orders {
            public final Evesso.Characters.Orders.History history = new Evesso.Characters.Orders.History();

            /**
             * List open orders from a character
             * 
             * <p>
             * List open market orders placed by a character<br />
             * This route is cached for up to 1200 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridorders[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/orders/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridorders[].class);
            }

            public class History {

                /**
                 * List historical orders by a character
                 * 
                 * <p>
                 * List cancelled and expired market orders placed by a character up to 90 days in the past.<br />
                 * This route is cached for up to 3600 seconds
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param page
                 *     Which page of results to return
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcharacterscharacteridordershistory[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/orders/history/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcharacterscharacteridordershistory[].class);
                }
            }
        }

        public class Planets {

            /**
             * Get colonies
             * 
             * <p>
             * Returns a list of all planetary colonies owned by a character.<br />
             * This route is cached for up to 600 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridplanets[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/planets/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridplanets[].class);
            }

            /**
             * Get colony layout
             * 
             * <p>
             * Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information will not update until this criteria is met.<br />
             * This route is cached for up to 600 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param planet_id
             *     Planet id of the target planet
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridplanetsplanetid> getByCharacteridPlanetid(int character_id, String If_None_Match, int planet_id) {
                String url = ("https://esi.evetech.net/v3/characters/{character_id}/planets/{planet_id}/".replace("{character_id}", ""+character_id).replace("{planet_id}", ""+planet_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridplanetsplanetid.class);
            }
        }

        public class Roles {

            /**
             * Get character corporation roles
             * 
             * <p>
             * Returns a character's corporation roles<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridroles> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/roles/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridroles.class);
            }
        }

        public class Search {

            /**
             * Search on a string
             * 
             * <p>
             * Search for entities that match a given sub-string.<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param Accept_Language
             *     Language to use in the response
             * @param categories
             *     Type of entities to search for
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param language
             *     Language to use in the response, takes precedence over Accept-Language
             * @param search
             *     The string to search on
             * @param strict
             *     Whether the search should be a strict match
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridsearch> getByCharacterid(esi.evetech.net.structures.Accept_Language Accept_Language,
                String[] categories,
                int character_id,
                String If_None_Match,
                esi.evetech.net.structures.language language,
                String search,
                Boolean strict) {
                String url = ("https://esi.evetech.net/v3/characters/{character_id}/search/".replace("{character_id}", ""+character_id)+"?"+(categories==null?"":"&categories="+flatten(categories))+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language))+(search==null?"":"&search="+flatten(search))+(strict==null?"":"&strict="+flatten(strict))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                if (Accept_Language!= null) {
                    headerProperties.put("Accept-Language", (""+ Accept_Language));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridsearch.class);
            }
        }

        public class Ship {

            /**
             * Get current ship
             * 
             * <p>
             * Get the current ship type, name and id<br />
             * This route is cached for up to 5 seconds<br />
             * [Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/characters/{character_id}/ship/)
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridship> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/ship/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridship.class);
            }
        }

        public class Skillqueue {

            /**
             * Get character's skill queue
             * 
             * <p>
             * List the configured skill queue for the given character<br />
             * This route is cached for up to 120 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridskillqueue[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/skillqueue/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridskillqueue[].class);
            }
        }

        public class Skills {

            /**
             * Get character skills
             * 
             * <p>
             * List all trained skills for the given character<br />
             * This route is cached for up to 120 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridskills> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v4/characters/{character_id}/skills/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridskills.class);
            }
        }

        public class Standings {

            /**
             * Get standings
             * 
             * <p>
             * Return character standings from agents, NPC corporations, and factions<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridstandings[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/standings/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridstandings[].class);
            }
        }

        public class Stats {

            /**
             * Yearly aggregate stats
             * 
             * <p>
             * Returns aggregate yearly stats for a character<br />
             * This route is cached for up to 86400 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridstats[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/stats/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridstats[].class);
            }
        }

        public class Titles {

            /**
             * Get character corporation titles
             * 
             * <p>
             * Returns a character's titles<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridtitles[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/titles/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridtitles[].class);
            }
        }

        public class Wallet {
            public final Evesso.Characters.Wallet.Transactions transactions = new Evesso.Characters.Wallet.Transactions();
            public final Evesso.Characters.Wallet.Journal journal = new Evesso.Characters.Wallet.Journal();

            /**
             * Get a character's wallet balance
             * 
             * <p>
             * Returns a character's wallet balance<br />
             * This route is cached for up to 120 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Double> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/wallet/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Double.class);
            }

            public class Journal {

                /**
                 * Get character wallet journal
                 * 
                 * <p>
                 * Retrieve the given character's wallet journal going 30 days back<br />
                 * This route is cached for up to 3600 seconds
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param page
                 *     Which page of results to return
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcharacterscharacteridwalletjournal[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v6/characters/{character_id}/wallet/journal/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcharacterscharacteridwalletjournal[].class);
                }
            }

            public class Transactions {

                /**
                 * Get wallet transactions
                 * 
                 * <p>
                 * Get wallet transactions of a character<br />
                 * This route is cached for up to 3600 seconds
                 * </p>
                 * 
                 * @param character_id
                 *     An EVE character ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param from_id
                 *     Only show transactions happened before the one referenced by this id
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcharacterscharacteridwallettransactions[]> getByCharacterid(int character_id, Long from_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/wallet/transactions/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(from_id==null?"":"&from_id="+flatten(from_id))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcharacterscharacteridwallettransactions[].class);
                }
            }
        }
    }

    public class Corporation {
        public final Evesso.Corporation.Mining mining = new Evesso.Corporation.Mining();

        public class Mining {
            public final Evesso.Corporation.Mining.Extractions extractions = new Evesso.Corporation.Mining.Extractions();
            public final Evesso.Corporation.Mining.Observers observers = new Evesso.Corporation.Mining.Observers();

            public class Extractions {

                /**
                 * Moon extraction timers
                 * 
                 * <p>
                 * Extraction timers for all moon chunks being extracted by refineries belonging to a corporation.<br />
                 * This route is cached for up to 1800 seconds<br />
                 * Requires one of the following EVE corporation role(s): Station_Manager
                 * </p>
                 * <p>
                 * require the roles specified {@link #GET_CORPORATION_CORPORATION_ID_MINING_EXTRACTIONS_ROLES here}
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param page
                 *     Which page of results to return
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcorporationcorporationidminingextractions[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v1/corporation/{corporation_id}/mining/extractions/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcorporationcorporationidminingextractions[].class);
                }
            }

            public class Observers {

                /**
                 * Corporation mining observers
                 * 
                 * <p>
                 * Paginated list of all entities capable of observing and recording mining for a corporation<br />
                 * This route is cached for up to 3600 seconds<br />
                 * Requires one of the following EVE corporation role(s): Accountant
                 * </p>
                 * <p>
                 * require the roles specified {@link #GET_CORPORATION_CORPORATION_ID_MINING_OBSERVERS_ROLES here}
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param page
                 *     Which page of results to return
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcorporationcorporationidminingobservers[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v1/corporation/{corporation_id}/mining/observers/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcorporationcorporationidminingobservers[].class);
                }

                /**
                 * Observed corporation mining
                 * 
                 * <p>
                 * Paginated record of all mining seen by an observer<br />
                 * This route is cached for up to 3600 seconds<br />
                 * Requires one of the following EVE corporation role(s): Accountant
                 * </p>
                 * <p>
                 * require the roles specified {@link #GET_CORPORATION_CORPORATION_ID_MINING_OBSERVERS_OBSERVER_ID_ROLES here}
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param observer_id
                 *     A mining observer id
                 * @param page
                 *     Which page of results to return
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcorporationcorporationidminingobserversobserverid[]> getByCorporationidObserverid(int corporation_id,
                    String If_None_Match,
                    long observer_id,
                    Integer page) {
                    String url = ("https://esi.evetech.net/v1/corporation/{corporation_id}/mining/observers/{observer_id}/".replace("{corporation_id}", ""+corporation_id).replace("{observer_id}", ""+observer_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcorporationcorporationidminingobserversobserverid[].class);
                }
            }
        }
    }

    public class Corporations {
        public final Evesso.Corporations.Assets assets = new Evesso.Corporations.Assets();
        public final Evesso.Corporations.Bookmarks bookmarks = new Evesso.Corporations.Bookmarks();
        public final Evesso.Corporations.Contacts contacts = new Evesso.Corporations.Contacts();
        public final Evesso.Corporations.Contracts contracts = new Evesso.Corporations.Contracts();
        public final Evesso.Corporations.Customsoffices customsoffices = new Evesso.Corporations.Customsoffices();
        public final Evesso.Corporations.Divisions divisions = new Evesso.Corporations.Divisions();
        public final Evesso.Corporations.Facilities facilities = new Evesso.Corporations.Facilities();
        public final Evesso.Corporations.Fw fw = new Evesso.Corporations.Fw();
        public final Evesso.Corporations.Industry industry = new Evesso.Corporations.Industry();
        public final Evesso.Corporations.Killmails killmails = new Evesso.Corporations.Killmails();
        public final Evesso.Corporations.Medals medals = new Evesso.Corporations.Medals();
        public final Evesso.Corporations.Members members = new Evesso.Corporations.Members();
        public final Evesso.Corporations.Membertracking membertracking = new Evesso.Corporations.Membertracking();
        public final Evesso.Corporations.Roles roles = new Evesso.Corporations.Roles();
        public final Evesso.Corporations.Shareholders shareholders = new Evesso.Corporations.Shareholders();
        public final Evesso.Corporations.Standings standings = new Evesso.Corporations.Standings();
        public final Evesso.Corporations.Starbases starbases = new Evesso.Corporations.Starbases();
        public final Evesso.Corporations.Titles titles = new Evesso.Corporations.Titles();
        public final Evesso.Corporations.Wallets wallets = new Evesso.Corporations.Wallets();
        public final Evesso.Corporations.Blueprints blueprints = new Evesso.Corporations.Blueprints();
        public final Evesso.Corporations.Containers containers = new Evesso.Corporations.Containers();
        public final Evesso.Corporations.Orders orders = new Evesso.Corporations.Orders();
        public final Evesso.Corporations.Structures structures = new Evesso.Corporations.Structures();

        public class Assets {
            public final Evesso.Corporations.Assets.Names names = new Evesso.Corporations.Assets.Names();
            public final Evesso.Corporations.Assets.Locations locations = new Evesso.Corporations.Assets.Locations();

            /**
             * Get corporation assets
             * 
             * <p>
             * Return a list of the corporation assets<br />
             * This route is cached for up to 3600 seconds<br />
             * Requires one of the following EVE corporation role(s): Director
             * </p>
             * <p>
             * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_ASSETS_ROLES here}
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcorporationscorporationidassets[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v3/corporations/{corporation_id}/assets/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcorporationscorporationidassets[].class);
            }

            public class Locations {

                /**
                 * Get corporation asset locations
                 * 
                 * <p>
                 * Return locations for a set of item ids, which you can get from corporation assets endpoint. Coordinates for items in hangars or stations are set to (0,0,0)<br />
                 * Requires one of the following EVE corporation role(s): Director
                 * </p>
                 * <p>
                 * require the roles specified {@link #POST_CORPORATIONS_CORPORATION_ID_ASSETS_LOCATIONS_ROLES here}
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param item_ids
                 *     A list of item ids
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Postcharacterscharacteridassetslocations[]> postByCorporationid(int corporation_id, long[] item_ids) {
                    String url = ("https://esi.evetech.net/v2/corporations/{corporation_id}/assets/locations/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    Map<String, Object> content = new HashMap<>();
                    content.put("item_ids", item_ids);
                    return requestPost(url, null, content, Postcharacterscharacteridassetslocations[].class);
                }
            }

            public class Names {

                /**
                 * Get corporation asset names
                 * 
                 * <p>
                 * Return names for a set of item ids, which you can get from corporation assets endpoint. Only valid for items that can customize names, like containers or ships<br />
                 * Requires one of the following EVE corporation role(s): Director
                 * </p>
                 * <p>
                 * require the roles specified {@link #POST_CORPORATIONS_CORPORATION_ID_ASSETS_NAMES_ROLES here}
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param item_ids
                 *     A list of item ids
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Postcharacterscharacteridassetsnames[]> postByCorporationid(int corporation_id, long[] item_ids) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/assets/names/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    Map<String, Object> content = new HashMap<>();
                    content.put("item_ids", item_ids);
                    return requestPost(url, null, content, Postcharacterscharacteridassetsnames[].class);
                }
            }
        }

        public class Blueprints {

            /**
             * Get corporation blueprints
             * 
             * <p>
             * Returns a list of blueprints the corporation owns<br />
             * This route is cached for up to 3600 seconds<br />
             * Requires one of the following EVE corporation role(s): Director
             * </p>
             * <p>
             * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_BLUEPRINTS_ROLES here}
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcorporationscorporationidblueprints[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v2/corporations/{corporation_id}/blueprints/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcorporationscorporationidblueprints[].class);
            }
        }

        public class Bookmarks {
            public final Evesso.Corporations.Bookmarks.Folders folders = new Evesso.Corporations.Bookmarks.Folders();

            /**
             * List corporation bookmarks
             * 
             * <p>
             * A list of your corporation's bookmarks<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcorporationscorporationidbookmarks[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/bookmarks/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcorporationscorporationidbookmarks[].class);
            }

            public class Folders {

                /**
                 * List corporation bookmark folders
                 * 
                 * <p>
                 * A list of your corporation's bookmark folders<br />
                 * This route is cached for up to 3600 seconds
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param page
                 *     Which page of results to return
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcorporationscorporationidbookmarksfolders[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/bookmarks/folders/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcorporationscorporationidbookmarksfolders[].class);
                }
            }
        }

        public class Contacts {
            public final Evesso.Corporations.Contacts.Labels labels = new Evesso.Corporations.Contacts.Labels();

            /**
             * Get corporation contacts
             * 
             * <p>
             * Return contacts of a corporation<br />
             * This route is cached for up to 300 seconds
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcorporationscorporationidcontacts[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v2/corporations/{corporation_id}/contacts/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcorporationscorporationidcontacts[].class);
            }

            public class Labels {

                /**
                 * Get corporation contact labels
                 * 
                 * <p>
                 * Return custom labels for a corporation's contacts<br />
                 * This route is cached for up to 300 seconds
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getalliancesallianceidcontactslabels[]> getByCorporationid(int corporation_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/contacts/labels/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getalliancesallianceidcontactslabels[].class);
                }
            }
        }

        public class Containers {
            public final Evesso.Corporations.Containers.Logs logs = new Evesso.Corporations.Containers.Logs();

            public class Logs {

                /**
                 * Get all corporation ALSC logs
                 * 
                 * <p>
                 * Returns logs recorded in the past seven days from all audit log secure containers (ALSC) owned by a given corporation<br />
                 * This route is cached for up to 600 seconds<br />
                 * Requires one of the following EVE corporation role(s): Director
                 * </p>
                 * <p>
                 * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_CONTAINERS_LOGS_ROLES here}
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param page
                 *     Which page of results to return
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcorporationscorporationidcontainerslogs[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v2/corporations/{corporation_id}/containers/logs/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcorporationscorporationidcontainerslogs[].class);
                }
            }
        }

        public class Contracts {
            public final Evesso.Corporations.Contracts.Bids bids = new Evesso.Corporations.Contracts.Bids();
            public final Evesso.Corporations.Contracts.Items items = new Evesso.Corporations.Contracts.Items();

            /**
             * Get corporation contracts
             * 
             * <p>
             * Returns contracts available to a corporation, only if the corporation is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is "in_progress".<br />
             * This route is cached for up to 300 seconds
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridcontracts[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/contracts/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridcontracts[].class);
            }

            public class Bids {

                /**
                 * Get corporation contract bids
                 * 
                 * <p>
                 * Lists bids on a particular auction contract<br />
                 * This route is cached for up to 3600 seconds
                 * </p>
                 * 
                 * @param contract_id
                 *     ID of a contract
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param page
                 *     Which page of results to return
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcharacterscharacteridcontractscontractidbids[]> getByCorporationidContractid(int contract_id,
                    int corporation_id,
                    String If_None_Match,
                    Integer page) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/contracts/{contract_id}/bids/".replace("{contract_id}", ""+contract_id).replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcharacterscharacteridcontractscontractidbids[].class);
                }
            }

            public class Items {

                /**
                 * Get corporation contract items
                 * 
                 * <p>
                 * Lists items of a particular contract<br />
                 * This route is cached for up to 3600 seconds
                 * </p>
                 * 
                 * @param contract_id
                 *     ID of a contract
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcharacterscharacteridcontractscontractiditems[]> getByCorporationidContractid(int contract_id, int corporation_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/contracts/{contract_id}/items/".replace("{contract_id}", ""+contract_id).replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcharacterscharacteridcontractscontractiditems[].class);
                }
            }
        }

        public class Customsoffices {

            /**
             * List corporation customs offices
             * 
             * <p>
             * List customs offices owned by a corporation<br />
             * This route is cached for up to 3600 seconds<br />
             * Requires one of the following EVE corporation role(s): Director
             * </p>
             * <p>
             * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_CUSTOMS_OFFICES_ROLES here}
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcorporationscorporationidcustomsoffices[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/customs_offices/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcorporationscorporationidcustomsoffices[].class);
            }
        }

        public class Divisions {

            /**
             * Get corporation divisions
             * 
             * <p>
             * Return corporation hangar and wallet division names, only show if a division is not using the default name<br />
             * This route is cached for up to 3600 seconds<br />
             * Requires one of the following EVE corporation role(s): Director
             * </p>
             * <p>
             * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_DIVISIONS_ROLES here}
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcorporationscorporationiddivisions> getByCorporationid(int corporation_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/divisions/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcorporationscorporationiddivisions.class);
            }
        }

        public class Facilities {

            /**
             * Get corporation facilities
             * 
             * <p>
             * Return a corporation's facilities<br />
             * This route is cached for up to 3600 seconds<br />
             * Requires one of the following EVE corporation role(s): Factory_Manager
             * </p>
             * <p>
             * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_FACILITIES_ROLES here}
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcorporationscorporationidfacilities[]> getByCorporationid(int corporation_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/facilities/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcorporationscorporationidfacilities[].class);
            }
        }

        public class Fw {
            public final Evesso.Corporations.Fw.Stats stats = new Evesso.Corporations.Fw.Stats();

            public class Stats {

                /**
                 * Overview of a corporation involved in faction warfare
                 * 
                 * <p>
                 * Statistics about a corporation involved in faction warfare<br />
                 * This route expires daily at 11:05<br />
                 * [Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/corporations/{corporation_id}/fw/stats/)
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcorporationscorporationidfwstats> getByCorporationid(int corporation_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/fw/stats/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcorporationscorporationidfwstats.class);
                }
            }
        }

        public class Industry {
            public final Evesso.Corporations.Industry.Jobs jobs = new Evesso.Corporations.Industry.Jobs();

            public class Jobs {

                /**
                 * List corporation industry jobs
                 * 
                 * <p>
                 * List industry jobs run by a corporation<br />
                 * This route is cached for up to 300 seconds<br />
                 * Requires one of the following EVE corporation role(s): Factory_Manager
                 * </p>
                 * <p>
                 * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_INDUSTRY_JOBS_ROLES here}
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param include_completed
                 *     Whether to retrieve completed corporation industry jobs. Only includes jobs from the past 90 days
                 * @param page
                 *     Which page of results to return
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcorporationscorporationidindustryjobs[]> getByCorporationid(int corporation_id,
                    String If_None_Match,
                    Boolean include_completed,
                    Integer page) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/industry/jobs/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(include_completed==null?"":"&include_completed="+flatten(include_completed))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcorporationscorporationidindustryjobs[].class);
                }
            }
        }

        public class Killmails {
            public final Evesso.Corporations.Killmails.Recent recent = new Evesso.Corporations.Killmails.Recent();

            public class Recent {

                /**
                 * Get a corporation's recent kills and losses
                 * 
                 * <p>
                 * Get a list of a corporation's kills and losses going back 90 days<br />
                 * This route is cached for up to 300 seconds<br />
                 * Requires one of the following EVE corporation role(s): Director
                 * </p>
                 * <p>
                 * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_KILLMAILS_RECENT_ROLES here}
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param page
                 *     Which page of results to return
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcharacterscharacteridkillmailsrecent[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/killmails/recent/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcharacterscharacteridkillmailsrecent[].class);
                }
            }
        }

        public class Medals {
            public final Evesso.Corporations.Medals.Issued issued = new Evesso.Corporations.Medals.Issued();

            /**
             * Get corporation medals
             * 
             * <p>
             * Returns a corporation's medals<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcorporationscorporationidmedals[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/medals/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcorporationscorporationidmedals[].class);
            }

            public class Issued {

                /**
                 * Get corporation issued medals
                 * 
                 * <p>
                 * Returns medals issued by a corporation<br />
                 * This route is cached for up to 3600 seconds<br />
                 * Requires one of the following EVE corporation role(s): Director
                 * </p>
                 * <p>
                 * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_MEDALS_ISSUED_ROLES here}
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param page
                 *     Which page of results to return
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcorporationscorporationidmedalsissued[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/medals/issued/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcorporationscorporationidmedalsissued[].class);
                }
            }
        }

        public class Members {
            public final Evesso.Corporations.Members.Limit limit = new Evesso.Corporations.Members.Limit();
            public final Evesso.Corporations.Members.Titles titles = new Evesso.Corporations.Members.Titles();

            /**
             * Get corporation members
             * 
             * <p>
             * Return the current member list of a corporation, the token's character need to be a member of the corporation.<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<int[]> getByCorporationid(int corporation_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v3/corporations/{corporation_id}/members/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, int[].class);
            }

            public class Limit {

                /**
                 * Get corporation member limit
                 * 
                 * <p>
                 * Return a corporation's member limit, not including CEO himself<br />
                 * This route is cached for up to 3600 seconds<br />
                 * Requires one of the following EVE corporation role(s): Director
                 * </p>
                 * <p>
                 * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_MEMBERS_LIMIT_ROLES here}
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Integer> getByCorporationid(int corporation_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/members/limit/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Integer.class);
                }
            }

            public class Titles {

                /**
                 * Get corporation's members' titles
                 * 
                 * <p>
                 * Returns a corporation's members' titles<br />
                 * This route is cached for up to 3600 seconds<br />
                 * Requires one of the following EVE corporation role(s): Director
                 * </p>
                 * <p>
                 * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_MEMBERS_TITLES_ROLES here}
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcorporationscorporationidmemberstitles[]> getByCorporationid(int corporation_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/members/titles/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcorporationscorporationidmemberstitles[].class);
                }
            }
        }

        public class Membertracking {

            /**
             * Track corporation members
             * 
             * <p>
             * Returns additional information about a corporation's members which helps tracking their activities<br />
             * This route is cached for up to 3600 seconds<br />
             * Requires one of the following EVE corporation role(s): Director
             * </p>
             * <p>
             * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_MEMBERTRACKING_ROLES here}
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcorporationscorporationidmembertracking[]> getByCorporationid(int corporation_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/membertracking/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcorporationscorporationidmembertracking[].class);
            }
        }

        public class Orders {
            public final Evesso.Corporations.Orders.History history = new Evesso.Corporations.Orders.History();

            /**
             * List open orders from a corporation
             * 
             * <p>
             * List open market orders placed on behalf of a corporation<br />
             * This route is cached for up to 1200 seconds<br />
             * Requires one of the following EVE corporation role(s): Accountant, Trader
             * </p>
             * <p>
             * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_ORDERS_ROLES here}
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcorporationscorporationidorders[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v3/corporations/{corporation_id}/orders/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcorporationscorporationidorders[].class);
            }

            public class History {

                /**
                 * List historical orders from a corporation
                 * 
                 * <p>
                 * List cancelled and expired market orders placed on behalf of a corporation up to 90 days in the past.<br />
                 * This route is cached for up to 3600 seconds<br />
                 * Requires one of the following EVE corporation role(s): Accountant, Trader
                 * </p>
                 * <p>
                 * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_ORDERS_HISTORY_ROLES here}
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param page
                 *     Which page of results to return
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcorporationscorporationidordershistory[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v2/corporations/{corporation_id}/orders/history/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcorporationscorporationidordershistory[].class);
                }
            }
        }

        public class Roles {
            public final Evesso.Corporations.Roles.History history = new Evesso.Corporations.Roles.History();

            /**
             * Get corporation member roles
             * 
             * <p>
             * Return the roles of all members if the character has the personnel manager role or any grantable role.<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcorporationscorporationidroles[]> getByCorporationid(int corporation_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/roles/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcorporationscorporationidroles[].class);
            }

            public class History {

                /**
                 * Get corporation member roles history
                 * 
                 * <p>
                 * Return how roles have changed for a coporation's members, up to a month<br />
                 * This route is cached for up to 3600 seconds<br />
                 * Requires one of the following EVE corporation role(s): Director
                 * </p>
                 * <p>
                 * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_ROLES_HISTORY_ROLES here}
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param page
                 *     Which page of results to return
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcorporationscorporationidroleshistory[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/roles/history/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcorporationscorporationidroleshistory[].class);
                }
            }
        }

        public class Shareholders {

            /**
             * Get corporation shareholders
             * 
             * <p>
             * Return the current shareholders of a corporation.<br />
             * This route is cached for up to 3600 seconds<br />
             * Requires one of the following EVE corporation role(s): Director
             * </p>
             * <p>
             * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_SHAREHOLDERS_ROLES here}
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcorporationscorporationidshareholders[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/shareholders/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcorporationscorporationidshareholders[].class);
            }
        }

        public class Standings {

            /**
             * Get corporation standings
             * 
             * <p>
             * Return corporation standings from agents, NPC corporations, and factions<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcharacterscharacteridstandings[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/standings/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcharacterscharacteridstandings[].class);
            }
        }

        public class Starbases {

            /**
             * Get corporation starbases (POSes)
             * 
             * <p>
             * Returns list of corporation starbases (POSes)<br />
             * This route is cached for up to 3600 seconds<br />
             * Requires one of the following EVE corporation role(s): Director
             * </p>
             * <p>
             * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_STARBASES_ROLES here}
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcorporationscorporationidstarbases[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/starbases/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcorporationscorporationidstarbases[].class);
            }

            /**
             * Get starbase (POS) detail
             * 
             * <p>
             * Returns various settings and fuels of a starbase (POS)<br />
             * This route is cached for up to 3600 seconds<br />
             * Requires one of the following EVE corporation role(s): Director
             * </p>
             * <p>
             * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_STARBASES_STARBASE_ID_ROLES here}
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param starbase_id
             *     An EVE starbase (POS) ID
             * @param system_id
             *     The solar system this starbase (POS) is located in,
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcorporationscorporationidstarbasesstarbaseid> getByCorporationidStarbaseid(int corporation_id,
                String If_None_Match,
                long starbase_id,
                int system_id) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/starbases/{starbase_id}/".replace("{corporation_id}", ""+corporation_id).replace("{starbase_id}", ""+starbase_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+"&system_id="+flatten(system_id)+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcorporationscorporationidstarbasesstarbaseid.class);
            }
        }

        public class Structures {

            /**
             * Get corporation structures
             * 
             * <p>
             * Get a list of corporation structures. This route's version includes the changes to structures detailed in this blog: https://www.eveonline.com/article/upwell-2.0-structures-changes-coming-on-february-13th<br />
             * This route is cached for up to 3600 seconds<br />
             * Requires one of the following EVE corporation role(s): Station_Manager
             * </p>
             * <p>
             * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_STRUCTURES_ROLES here}
             * </p>
             * 
             * @param Accept_Language
             *     Language to use in the response
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param language
             *     Language to use in the response, takes precedence over Accept-Language
             * @param page
             *     Which page of results to return
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcorporationscorporationidstructures[]> getByCorporationid(esi.evetech.net.structures.Accept_Language Accept_Language,
                int corporation_id,
                String If_None_Match,
                esi.evetech.net.structures.language language,
                Integer page) {
                String url = ("https://esi.evetech.net/v3/corporations/{corporation_id}/structures/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                if (Accept_Language!= null) {
                    headerProperties.put("Accept-Language", (""+ Accept_Language));
                }
                return requestGet(url, headerProperties, Getcorporationscorporationidstructures[].class);
            }
        }

        public class Titles {

            /**
             * Get corporation titles
             * 
             * <p>
             * Returns a corporation's titles<br />
             * This route is cached for up to 3600 seconds<br />
             * Requires one of the following EVE corporation role(s): Director
             * </p>
             * <p>
             * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_TITLES_ROLES here}
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcorporationscorporationidtitles[]> getByCorporationid(int corporation_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/titles/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcorporationscorporationidtitles[].class);
            }
        }

        public class Wallets {
            public final Evesso.Corporations.Wallets.Transactions transactions = new Evesso.Corporations.Wallets.Transactions();
            public final Evesso.Corporations.Wallets.Journal journal = new Evesso.Corporations.Wallets.Journal();

            /**
             * Returns a corporation's wallet balance
             * 
             * <p>
             * Get a corporation's wallets<br />
             * This route is cached for up to 300 seconds<br />
             * Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant
             * </p>
             * <p>
             * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_WALLETS_ROLES here}
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getcorporationscorporationidwallets[]> getByCorporationid(int corporation_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/wallets/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getcorporationscorporationidwallets[].class);
            }

            public class Journal {

                /**
                 * Get corporation wallet journal
                 * 
                 * <p>
                 * Retrieve the given corporation's wallet journal for the given division going 30 days back<br />
                 * This route is cached for up to 3600 seconds<br />
                 * Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant
                 * </p>
                 * <p>
                 * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_WALLETS_DIVISION_JOURNAL_ROLES here}
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param division
                 *     Wallet key of the division to fetch journals from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param page
                 *     Which page of results to return
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcorporationscorporationidwalletsdivisionjournal[]> getByCorporationidDivision(int corporation_id,
                    int division,
                    String If_None_Match,
                    Integer page) {
                    String url = ("https://esi.evetech.net/v4/corporations/{corporation_id}/wallets/{division}/journal/".replace("{corporation_id}", ""+corporation_id).replace("{division}", ""+division)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcorporationscorporationidwalletsdivisionjournal[].class);
                }
            }

            public class Transactions {

                /**
                 * Get corporation wallet transactions
                 * 
                 * <p>
                 * Get wallet transactions of a corporation<br />
                 * This route is cached for up to 3600 seconds<br />
                 * Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant
                 * </p>
                 * <p>
                 * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_WALLETS_DIVISION_TRANSACTIONS_ROLES here}
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param division
                 *     Wallet key of the division to fetch journals from
                 * @param from_id
                 *     Only show journal entries happened before the transaction referenced by this id
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public Requested<Getcorporationscorporationidwalletsdivisiontransactions[]> getByCorporationidDivision(int corporation_id,
                    int division,
                    Long from_id,
                    String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/wallets/{division}/transactions/".replace("{corporation_id}", ""+corporation_id).replace("{division}", ""+division)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(from_id==null?"":"&from_id="+flatten(from_id))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, Getcorporationscorporationidwalletsdivisiontransactions[].class);
                }
            }
        }
    }

    public class Fleets {
        public final Evesso.Fleets.Members members = new Evesso.Fleets.Members();
        public final Evesso.Fleets.Squads squads = new Evesso.Fleets.Squads();
        public final Evesso.Fleets.Wings wings = new Evesso.Fleets.Wings();

        /**
         * Get fleet information
         * 
         * <p>
         * Return details about a fleet<br />
         * This route is cached for up to 5 seconds
         * </p>
         * 
         * @param datasource
         *     The server name you would like data from
         * @param fleet_id
         *     ID for a fleet
         * @param If_None_Match
         *     ETag from a previous request. A 304 will be returned if this matches the current ETag
         * @param token
         *     Access token to use if unable to set a header
         */
        public Requested<Getfleetsfleetid> getByFleetid(long fleet_id, String If_None_Match) {
            String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/".replace("{fleet_id}", ""+fleet_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (If_None_Match!= null) {
                headerProperties.put("If-None-Match", (""+ If_None_Match));
            }
            return requestGet(url, headerProperties, Getfleetsfleetid.class);
        }

        /**
         * Update fleet
         * 
         * <p>
         * Update settings about a fleet
         * </p>
         * 
         * @param datasource
         *     The server name you would like data from
         * @param fleet_id
         *     ID for a fleet
         * @param is_free_move
         *     Should free-move be enabled in the fleet
         * @param motd
         *     New fleet MOTD in CCP flavoured HTML
         * @param token
         *     Access token to use if unable to set a header
         */
        public void putByFleetid(long fleet_id, boolean is_free_move, String motd) {
            String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/".replace("{fleet_id}", ""+fleet_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
            Map<String, Object> content = new HashMap<>();
            content.put("is_free_move", is_free_move);
            content.put("motd", motd);
            requestPut(url, null, content, Void.class);
        }

        public class Members {

            /**
             * Get fleet members
             * 
             * <p>
             * Return information about fleet members<br />
             * This route is cached for up to 5 seconds
             * </p>
             * 
             * @param Accept_Language
             *     Language to use in the response
             * @param datasource
             *     The server name you would like data from
             * @param fleet_id
             *     ID for a fleet
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param language
             *     Language to use in the response, takes precedence over Accept-Language
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getfleetsfleetidmembers[]> getByFleetid(esi.evetech.net.structures.Accept_Language Accept_Language,
                long fleet_id,
                String If_None_Match,
                esi.evetech.net.structures.language language) {
                String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/members/".replace("{fleet_id}", ""+fleet_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                if (Accept_Language!= null) {
                    headerProperties.put("Accept-Language", (""+ Accept_Language));
                }
                return requestGet(url, headerProperties, Getfleetsfleetidmembers[].class);
            }

            /**
             * Create fleet invitation
             * 
             * <p>
             * Invite a character into the fleet. If a character has a CSPA charge set it is not possible to invite them to the fleet using ESI
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param fleet_id
             *     ID for a fleet
             * @param character_id
             *     The character you want to invite
             * @param role
             *     If a character is invited with the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified. If a character is invited with the `wing_commander` role, only `wing_id` should be specified. If a character is invited with the `squad_commander` role, both `wing_id` and `squad_id` should be specified. If a character is invited with the `squad_member` role, `wing_id` and `squad_id` should either both be specified or not specified at all. If they aren’t specified, the invited character will join any squad with available positions.
             * @param squad_id
             *     squad_id integer
             * @param wing_id
             *     wing_id integer
             * @param token
             *     Access token to use if unable to set a header
             */
            public void postByFleetid(long fleet_id,
                int character_id,
                esi.evetech.net.structures.role role,
                long squad_id,
                long wing_id) {
                String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/members/".replace("{fleet_id}", ""+fleet_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                Map<String, Object> content = new HashMap<>();
                content.put("character_id", character_id);
                content.put("role", role);
                content.put("squad_id", squad_id);
                content.put("wing_id", wing_id);
                requestPost(url, null, content, Void.class);
            }

            /**
             * Move fleet member
             * 
             * <p>
             * Move a fleet member around
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param fleet_id
             *     ID for a fleet
             * @param member_id
             *     The character ID of a member in this fleet
             * @param role
             *     If a character is moved to the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified. If a character is moved to the `wing_commander` role, only `wing_id` should be specified. If a character is moved to the `squad_commander` role, both `wing_id` and `squad_id` should be specified. If a character is moved to the `squad_member` role, both `wing_id` and `squad_id` should be specified.
             * @param squad_id
             *     squad_id integer
             * @param wing_id
             *     wing_id integer
             * @param token
             *     Access token to use if unable to set a header
             */
            public void putByFleetidMemberid(long fleet_id,
                int member_id,
                esi.evetech.net.structures.role role,
                long squad_id,
                long wing_id) {
                String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/members/{member_id}/".replace("{fleet_id}", ""+fleet_id).replace("{member_id}", ""+member_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                Map<String, Object> content = new HashMap<>();
                content.put("role", role);
                content.put("squad_id", squad_id);
                content.put("wing_id", wing_id);
                requestPut(url, null, content, Void.class);
            }

            /**
             * Kick fleet member
             * 
             * <p>
             * Kick a fleet member
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param fleet_id
             *     ID for a fleet
             * @param member_id
             *     The character ID of a member in this fleet
             * @param token
             *     Access token to use if unable to set a header
             */
            public void deleteByFleetidMemberid(long fleet_id, int member_id) {
                String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/members/{member_id}/".replace("{fleet_id}", ""+fleet_id).replace("{member_id}", ""+member_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                requestDel(url, null, Void.class);
            }
        }

        public class Squads {

            /**
             * Rename fleet squad
             * 
             * <p>
             * Rename a fleet squad
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param fleet_id
             *     ID for a fleet
             * @param name
             *     name string
             * @param squad_id
             *     The squad to rename
             * @param token
             *     Access token to use if unable to set a header
             */
            public void putByFleetidSquadid(long fleet_id, String name, long squad_id) {
                String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/squads/{squad_id}/".replace("{fleet_id}", ""+fleet_id).replace("{squad_id}", ""+squad_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                Map<String, Object> content = new HashMap<>();
                content.put("name", name);
                requestPut(url, null, content, Void.class);
            }

            /**
             * Delete fleet squad
             * 
             * <p>
             * Delete a fleet squad, only empty squads can be deleted
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param fleet_id
             *     ID for a fleet
             * @param squad_id
             *     The squad to delete
             * @param token
             *     Access token to use if unable to set a header
             */
            public void deleteByFleetidSquadid(long fleet_id, long squad_id) {
                String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/squads/{squad_id}/".replace("{fleet_id}", ""+fleet_id).replace("{squad_id}", ""+squad_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                requestDel(url, null, Void.class);
            }
        }

        public class Wings {
            public final Evesso.Fleets.Wings.Squads squads = new Evesso.Fleets.Wings.Squads();

            /**
             * Get fleet wings
             * 
             * <p>
             * Return information about wings in a fleet<br />
             * This route is cached for up to 5 seconds
             * </p>
             * 
             * @param Accept_Language
             *     Language to use in the response
             * @param datasource
             *     The server name you would like data from
             * @param fleet_id
             *     ID for a fleet
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param language
             *     Language to use in the response, takes precedence over Accept-Language
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getfleetsfleetidwings[]> getByFleetid(esi.evetech.net.structures.Accept_Language Accept_Language,
                long fleet_id,
                String If_None_Match,
                esi.evetech.net.structures.language language) {
                String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/wings/".replace("{fleet_id}", ""+fleet_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                if (Accept_Language!= null) {
                    headerProperties.put("Accept-Language", (""+ Accept_Language));
                }
                return requestGet(url, headerProperties, Getfleetsfleetidwings[].class);
            }

            /**
             * Create fleet wing
             * 
             * <p>
             * Create a new wing in a fleet
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param fleet_id
             *     ID for a fleet
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Postfleetsfleetidwingscreated> postByFleetid(long fleet_id) {
                String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/wings/".replace("{fleet_id}", ""+fleet_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                return requestPost(url, null, null, Postfleetsfleetidwingscreated.class);
            }

            /**
             * Rename fleet wing
             * 
             * <p>
             * Rename a fleet wing
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param fleet_id
             *     ID for a fleet
             * @param name
             *     name string
             * @param token
             *     Access token to use if unable to set a header
             * @param wing_id
             *     The wing to rename
             */
            public void putByFleetidWingid(long fleet_id, String name, long wing_id) {
                String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/wings/{wing_id}/".replace("{fleet_id}", ""+fleet_id).replace("{wing_id}", ""+wing_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                Map<String, Object> content = new HashMap<>();
                content.put("name", name);
                requestPut(url, null, content, Void.class);
            }

            /**
             * Delete fleet wing
             * 
             * <p>
             * Delete a fleet wing, only empty wings can be deleted. The wing may contain squads, but the squads must be empty
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param fleet_id
             *     ID for a fleet
             * @param token
             *     Access token to use if unable to set a header
             * @param wing_id
             *     The wing to delete
             */
            public void deleteByFleetidWingid(long fleet_id, long wing_id) {
                String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/wings/{wing_id}/".replace("{fleet_id}", ""+fleet_id).replace("{wing_id}", ""+wing_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                requestDel(url, null, Void.class);
            }

            public class Squads {

                /**
                 * Create fleet squad
                 * 
                 * <p>
                 * Create a new squad in a fleet
                 * </p>
                 * 
                 * @param datasource
                 *     The server name you would like data from
                 * @param fleet_id
                 *     ID for a fleet
                 * @param token
                 *     Access token to use if unable to set a header
                 * @param wing_id
                 *     The wing_id to create squad in
                 */
                public Requested<Postfleetsfleetidwingswingidsquadscreated> postByFleetidWingid(long fleet_id, long wing_id) {
                    String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/wings/{wing_id}/squads/".replace("{fleet_id}", ""+fleet_id).replace("{wing_id}", ""+wing_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    return requestPost(url, null, null, Postfleetsfleetidwingswingidsquadscreated.class);
                }
            }
        }
    }

    public class Markets {
        public final Evesso.Markets.Structures structures = new Evesso.Markets.Structures();

        public class Structures {

            /**
             * List orders in a structure
             * 
             * <p>
             * Return all orders in a structure<br />
             * This route is cached for up to 300 seconds
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param structure_id
             *     Return orders in this structure
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getmarketsstructuresstructureid[]> getByStructureid(String If_None_Match, Integer page, long structure_id) {
                String url = ("https://esi.evetech.net/v1/markets/structures/{structure_id}/".replace("{structure_id}", ""+structure_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getmarketsstructuresstructureid[].class);
            }
        }
    }

    public class Ui {
        public final Evesso.Ui.Openwindow openwindow = new Evesso.Ui.Openwindow();
        public final Evesso.Ui.Autopilot autopilot = new Evesso.Ui.Autopilot();

        public class Autopilot {
            public final Evesso.Ui.Autopilot.Waypoint waypoint = new Evesso.Ui.Autopilot.Waypoint();

            public class Waypoint {

                /**
                 * Set Autopilot Waypoint
                 * 
                 * <p>
                 * Set a solar system as autopilot waypoint
                 * </p>
                 * 
                 * @param add_to_beginning
                 *     Whether this solar system should be added to the beginning of all waypoints
                 * @param clear_other_waypoints
                 *     Whether clean other waypoints beforing adding this one
                 * @param datasource
                 *     The server name you would like data from
                 * @param destination_id
                 *     The destination to travel to, can be solar system, station or structure's id
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public void post(boolean add_to_beginning, boolean clear_other_waypoints, long destination_id) {
                    String url = ("https://esi.evetech.net/v2/ui/autopilot/waypoint/"+"?"+"&add_to_beginning="+flatten(add_to_beginning)+"&clear_other_waypoints="+flatten(clear_other_waypoints)+(datasource==null?"":"&datasource="+flatten(datasource))+"&destination_id="+flatten(destination_id)+(token==null?"":"&token="+flatten(token)));
                    requestPost(url, null, null, Void.class);
                }
            }
        }

        public class Openwindow {
            public final Evesso.Ui.Openwindow.Contract contract = new Evesso.Ui.Openwindow.Contract();
            public final Evesso.Ui.Openwindow.Information information = new Evesso.Ui.Openwindow.Information();
            public final Evesso.Ui.Openwindow.Marketdetails marketdetails = new Evesso.Ui.Openwindow.Marketdetails();
            public final Evesso.Ui.Openwindow.Newmail newmail = new Evesso.Ui.Openwindow.Newmail();

            public class Contract {

                /**
                 * Open Contract Window
                 * 
                 * <p>
                 * Open the contract window inside the client
                 * </p>
                 * 
                 * @param contract_id
                 *     The contract to open
                 * @param datasource
                 *     The server name you would like data from
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public void post(int contract_id) {
                    String url = ("https://esi.evetech.net/v1/ui/openwindow/contract/"+"?"+"&contract_id="+flatten(contract_id)+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    requestPost(url, null, null, Void.class);
                }
            }

            public class Information {

                /**
                 * Open Information Window
                 * 
                 * <p>
                 * Open the information window for a character, corporation or alliance inside the client
                 * </p>
                 * 
                 * @param datasource
                 *     The server name you would like data from
                 * @param target_id
                 *     The target to open
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public void post(int target_id) {
                    String url = ("https://esi.evetech.net/v1/ui/openwindow/information/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+"&target_id="+flatten(target_id)+(token==null?"":"&token="+flatten(token)));
                    requestPost(url, null, null, Void.class);
                }
            }

            public class Marketdetails {

                /**
                 * Open Market Details
                 * 
                 * <p>
                 * Open the market details window for a specific typeID inside the client
                 * </p>
                 * 
                 * @param datasource
                 *     The server name you would like data from
                 * @param token
                 *     Access token to use if unable to set a header
                 * @param type_id
                 *     The item type to open in market window
                 */
                public void post(int type_id) {
                    String url = ("https://esi.evetech.net/v1/ui/openwindow/marketdetails/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token))+"&type_id="+flatten(type_id));
                    requestPost(url, null, null, Void.class);
                }
            }

            public class Newmail {

                /**
                 * Open New Mail Window
                 * 
                 * <p>
                 * Open the New Mail window, according to settings from the request if applicable
                 * </p>
                 * 
                 * @param datasource
                 *     The server name you would like data from
                 * @param body
                 *     body string
                 * @param recipients
                 *     recipients array
                 * @param subject
                 *     subject string
                 * @param to_corp_or_alliance_id
                 *     to_corp_or_alliance_id integer
                 * @param to_mailing_list_id
                 *     Corporations, alliances and mailing lists are all types of mailing groups. You may only send to one mailing group, at a time, so you may fill out either this field or the to_corp_or_alliance_ids field
                 * @param token
                 *     Access token to use if unable to set a header
                 */
                public void post(String body,
                    int[] recipients,
                    String subject,
                    int to_corp_or_alliance_id,
                    int to_mailing_list_id) {
                    String url = ("https://esi.evetech.net/v1/ui/openwindow/newmail/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    Map<String, Object> content = new HashMap<>();
                    content.put("body", body);
                    content.put("recipients", recipients);
                    content.put("subject", subject);
                    content.put("to_corp_or_alliance_id", to_corp_or_alliance_id);
                    content.put("to_mailing_list_id", to_mailing_list_id);
                    requestPost(url, null, content, Void.class);
                }
            }
        }
    }

    public class Universe {
        public final Evesso.Universe.Structures structures = new Evesso.Universe.Structures();

        public class Structures {

            /**
             * Get structure information
             * 
             * <p>
             * Returns information on requested structure if you are on the ACL. Otherwise, returns "Forbidden" for all inputs.<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param structure_id
             *     An Eve structure ID
             * @param token
             *     Access token to use if unable to set a header
             */
            public Requested<Getuniversestructuresstructureid> getByStructureid(String If_None_Match, long structure_id) {
                String url = ("https://esi.evetech.net/v2/universe/structures/{structure_id}/".replace("{structure_id}", ""+structure_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, Getuniversestructuresstructureid.class);
            }
        }
    }
}
