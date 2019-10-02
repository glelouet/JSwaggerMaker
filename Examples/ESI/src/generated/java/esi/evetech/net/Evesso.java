package esi.evetech.net;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.responses.GetAlliancesAllianceIdContacts;
import esi.evetech.net.responses.GetAlliancesAllianceIdContactsLabels;
import esi.evetech.net.responses.GetCharactersCharacterIdAgentsResearch;
import esi.evetech.net.responses.GetCharactersCharacterIdAssets;
import esi.evetech.net.responses.GetCharactersCharacterIdAttributes;
import esi.evetech.net.responses.GetCharactersCharacterIdBlueprints;
import esi.evetech.net.responses.GetCharactersCharacterIdBookmarksFolders;
import esi.evetech.net.responses.GetCharactersCharacterIdCalendar;
import esi.evetech.net.responses.GetCharactersCharacterIdCalendarEventId;
import esi.evetech.net.responses.GetCharactersCharacterIdCalendarEventIdAttendees;
import esi.evetech.net.responses.GetCharactersCharacterIdClones;
import esi.evetech.net.responses.GetCharactersCharacterIdContacts;
import esi.evetech.net.responses.GetCharactersCharacterIdContracts;
import esi.evetech.net.responses.GetCharactersCharacterIdContractsContractIdBids;
import esi.evetech.net.responses.GetCharactersCharacterIdContractsContractIdItems;
import esi.evetech.net.responses.GetCharactersCharacterIdFatigue;
import esi.evetech.net.responses.GetCharactersCharacterIdFittings;
import esi.evetech.net.responses.GetCharactersCharacterIdFleet;
import esi.evetech.net.responses.GetCharactersCharacterIdFwStats;
import esi.evetech.net.responses.GetCharactersCharacterIdIndustryJobs;
import esi.evetech.net.responses.GetCharactersCharacterIdKillmailsRecent;
import esi.evetech.net.responses.GetCharactersCharacterIdLocation;
import esi.evetech.net.responses.GetCharactersCharacterIdLoyaltyPoints;
import esi.evetech.net.responses.GetCharactersCharacterIdMail;
import esi.evetech.net.responses.GetCharactersCharacterIdMailLabels;
import esi.evetech.net.responses.GetCharactersCharacterIdMailLists;
import esi.evetech.net.responses.GetCharactersCharacterIdMailMailId;
import esi.evetech.net.responses.GetCharactersCharacterIdMedals;
import esi.evetech.net.responses.GetCharactersCharacterIdMining;
import esi.evetech.net.responses.GetCharactersCharacterIdNotifications;
import esi.evetech.net.responses.GetCharactersCharacterIdNotificationsContacts;
import esi.evetech.net.responses.GetCharactersCharacterIdOnline;
import esi.evetech.net.responses.GetCharactersCharacterIdOpportunities;
import esi.evetech.net.responses.GetCharactersCharacterIdOrders;
import esi.evetech.net.responses.GetCharactersCharacterIdOrdersHistory;
import esi.evetech.net.responses.GetCharactersCharacterIdPlanets;
import esi.evetech.net.responses.GetCharactersCharacterIdPlanetsPlanetId;
import esi.evetech.net.responses.GetCharactersCharacterIdRoles;
import esi.evetech.net.responses.GetCharactersCharacterIdSearch;
import esi.evetech.net.responses.GetCharactersCharacterIdShip;
import esi.evetech.net.responses.GetCharactersCharacterIdSkillqueue;
import esi.evetech.net.responses.GetCharactersCharacterIdSkills;
import esi.evetech.net.responses.GetCharactersCharacterIdStandings;
import esi.evetech.net.responses.GetCharactersCharacterIdStats;
import esi.evetech.net.responses.GetCharactersCharacterIdTitles;
import esi.evetech.net.responses.GetCharactersCharacterIdWalletJournal;
import esi.evetech.net.responses.GetCharactersCharacterIdWalletTransactions;
import esi.evetech.net.responses.GetCorporationCorporationIdMiningExtractions;
import esi.evetech.net.responses.GetCorporationCorporationIdMiningObservers;
import esi.evetech.net.responses.GetCorporationCorporationIdMiningObserversObserverId;
import esi.evetech.net.responses.GetCorporationsCorporationIdAssets;
import esi.evetech.net.responses.GetCorporationsCorporationIdBlueprints;
import esi.evetech.net.responses.GetCorporationsCorporationIdBookmarks;
import esi.evetech.net.responses.GetCorporationsCorporationIdBookmarksFolders;
import esi.evetech.net.responses.GetCorporationsCorporationIdContacts;
import esi.evetech.net.responses.GetCorporationsCorporationIdContainersLogs;
import esi.evetech.net.responses.GetCorporationsCorporationIdCustomsOffices;
import esi.evetech.net.responses.GetCorporationsCorporationIdDivisions;
import esi.evetech.net.responses.GetCorporationsCorporationIdFacilities;
import esi.evetech.net.responses.GetCorporationsCorporationIdFwStats;
import esi.evetech.net.responses.GetCorporationsCorporationIdIndustryJobs;
import esi.evetech.net.responses.GetCorporationsCorporationIdMedals;
import esi.evetech.net.responses.GetCorporationsCorporationIdMedalsIssued;
import esi.evetech.net.responses.GetCorporationsCorporationIdMembersTitles;
import esi.evetech.net.responses.GetCorporationsCorporationIdMembertracking;
import esi.evetech.net.responses.GetCorporationsCorporationIdOrders;
import esi.evetech.net.responses.GetCorporationsCorporationIdOrdersHistory;
import esi.evetech.net.responses.GetCorporationsCorporationIdRoles;
import esi.evetech.net.responses.GetCorporationsCorporationIdRolesHistory;
import esi.evetech.net.responses.GetCorporationsCorporationIdShareholders;
import esi.evetech.net.responses.GetCorporationsCorporationIdStarbases;
import esi.evetech.net.responses.GetCorporationsCorporationIdStarbasesStarbaseId;
import esi.evetech.net.responses.GetCorporationsCorporationIdStructures;
import esi.evetech.net.responses.GetCorporationsCorporationIdTitles;
import esi.evetech.net.responses.GetCorporationsCorporationIdWallets;
import esi.evetech.net.responses.GetCorporationsCorporationIdWalletsDivisionJournal;
import esi.evetech.net.responses.GetCorporationsCorporationIdWalletsDivisionTransactions;
import esi.evetech.net.responses.GetFleetsFleetId;
import esi.evetech.net.responses.GetFleetsFleetIdMembers;
import esi.evetech.net.responses.GetFleetsFleetIdWings;
import esi.evetech.net.responses.GetMarketsStructuresStructureId;
import esi.evetech.net.responses.GetUniverseStructuresStructureId;
import esi.evetech.net.responses.PostCharactersCharacterIdAssetsLocations;
import esi.evetech.net.responses.PostCharactersCharacterIdAssetsNames;
import esi.evetech.net.responses.PostCharactersCharacterIdFittingsCreated;
import esi.evetech.net.responses.PostFleetsFleetIdWingsCreated;
import esi.evetech.net.responses.PostFleetsFleetIdWingsWingIdSquadsCreated;
import esi.evetech.net.responses.getcharacterscharacteridfittings.GetCharactersCharacterIdFittingsItems;
import esi.evetech.net.responses.getcharacterscharacteridmail.GetCharactersCharacterIdMailRecipients;
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
            public Requested<GetAlliancesAllianceIdContacts[]> getByAllianceid(int alliance_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v2/alliances/{alliance_id}/contacts/".replace("{alliance_id}", ""+alliance_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetAlliancesAllianceIdContacts[].class);
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
                public Requested<GetAlliancesAllianceIdContactsLabels[]> getByAllianceid(int alliance_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/alliances/{alliance_id}/contacts/labels/".replace("{alliance_id}", ""+alliance_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetAlliancesAllianceIdContactsLabels[].class);
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
            public Requested<GetCharactersCharacterIdAgentsResearch[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/agents_research/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdAgentsResearch[].class);
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
            public Requested<GetCharactersCharacterIdAssets[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v3/characters/{character_id}/assets/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdAssets[].class);
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
                public Requested<PostCharactersCharacterIdAssetsLocations[]> postByCharacterid(int character_id, long[] item_ids) {
                    String url = ("https://esi.evetech.net/v2/characters/{character_id}/assets/locations/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    Map<String, Object> content = new HashMap<>();
                    content.put("item_ids", item_ids);
                    return requestPost(url, null, content, PostCharactersCharacterIdAssetsLocations[].class);
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
                public Requested<PostCharactersCharacterIdAssetsNames[]> postByCharacterid(int character_id, long[] item_ids) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/assets/names/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    Map<String, Object> content = new HashMap<>();
                    content.put("item_ids", item_ids);
                    return requestPost(url, null, content, PostCharactersCharacterIdAssetsNames[].class);
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
            public Requested<GetCharactersCharacterIdAttributes> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/attributes/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdAttributes.class);
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
            public Requested<GetCharactersCharacterIdBlueprints[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/blueprints/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdBlueprints[].class);
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
            public Requested<GetCorporationsCorporationIdBookmarks[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/bookmarks/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdBookmarks[].class);
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
                public Requested<GetCharactersCharacterIdBookmarksFolders[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v2/characters/{character_id}/bookmarks/folders/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCharactersCharacterIdBookmarksFolders[].class);
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
            public Requested<GetCharactersCharacterIdCalendar[]> getByCharacterid(int character_id, Integer from_event, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/calendar/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(from_event==null?"":"&from_event="+flatten(from_event))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdCalendar[].class);
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
            public Requested<GetCharactersCharacterIdCalendarEventId> getByCharacteridEventid(int character_id, int event_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v3/characters/{character_id}/calendar/{event_id}/".replace("{character_id}", ""+character_id).replace("{event_id}", ""+event_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdCalendarEventId.class);
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
                public Requested<GetCharactersCharacterIdCalendarEventIdAttendees[]> getByCharacteridEventid(int character_id, int event_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/calendar/{event_id}/attendees/".replace("{character_id}", ""+character_id).replace("{event_id}", ""+event_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCharactersCharacterIdCalendarEventIdAttendees[].class);
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
            public Requested<GetCharactersCharacterIdClones> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v3/characters/{character_id}/clones/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdClones.class);
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
            public Requested<GetCharactersCharacterIdContacts[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/contacts/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdContacts[].class);
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
                public Requested<GetAlliancesAllianceIdContactsLabels[]> getByCharacterid(int character_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/contacts/labels/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetAlliancesAllianceIdContactsLabels[].class);
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
            public Requested<GetCharactersCharacterIdContracts[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/contracts/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdContracts[].class);
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
                public Requested<GetCharactersCharacterIdContractsContractIdBids[]> getByCharacteridContractid(int character_id, int contract_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/contracts/{contract_id}/bids/".replace("{character_id}", ""+character_id).replace("{contract_id}", ""+contract_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCharactersCharacterIdContractsContractIdBids[].class);
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
                public Requested<GetCharactersCharacterIdContractsContractIdItems[]> getByCharacteridContractid(int character_id, int contract_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/contracts/{contract_id}/items/".replace("{character_id}", ""+character_id).replace("{contract_id}", ""+contract_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCharactersCharacterIdContractsContractIdItems[].class);
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
            public Requested<GetCharactersCharacterIdFatigue> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/fatigue/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdFatigue.class);
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
            public Requested<GetCharactersCharacterIdFittings[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/fittings/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdFittings[].class);
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
            public Requested<PostCharactersCharacterIdFittingsCreated> postByCharacterid(int character_id,
                String description,
                GetCharactersCharacterIdFittingsItems[] items,
                String name,
                int ship_type_id) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/fittings/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                Map<String, Object> content = new HashMap<>();
                content.put("description", description);
                content.put("items", items);
                content.put("name", name);
                content.put("ship_type_id", ship_type_id);
                return requestPost(url, null, content, PostCharactersCharacterIdFittingsCreated.class);
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
            public Requested<GetCharactersCharacterIdFleet> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/fleet/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdFleet.class);
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
                public Requested<GetCharactersCharacterIdFwStats> getByCharacterid(int character_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/fw/stats/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCharactersCharacterIdFwStats.class);
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
                public Requested<GetCharactersCharacterIdIndustryJobs[]> getByCharacterid(int character_id, String If_None_Match, Boolean include_completed) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/industry/jobs/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(include_completed==null?"":"&include_completed="+flatten(include_completed))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCharactersCharacterIdIndustryJobs[].class);
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
                public Requested<GetCharactersCharacterIdKillmailsRecent[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/killmails/recent/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCharactersCharacterIdKillmailsRecent[].class);
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
            public Requested<GetCharactersCharacterIdLocation> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/location/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdLocation.class);
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
                public Requested<GetCharactersCharacterIdLoyaltyPoints[]> getByCharacterid(int character_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/loyalty/points/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCharactersCharacterIdLoyaltyPoints[].class);
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
            public Requested<GetCharactersCharacterIdMail[]> getByCharacterid(int character_id,
                String If_None_Match,
                int[] labels,
                Integer last_mail_id) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/mail/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(labels==null?"":"&labels="+flatten(labels))+(last_mail_id==null?"":"&last_mail_id="+flatten(last_mail_id))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdMail[].class);
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
                GetCharactersCharacterIdMailRecipients[] recipients,
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
            public Requested<GetCharactersCharacterIdMailMailId> getByCharacteridMailid(int character_id, String If_None_Match, int mail_id) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/mail/{mail_id}/".replace("{character_id}", ""+character_id).replace("{mail_id}", ""+mail_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdMailMailId.class);
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
                public Requested<GetCharactersCharacterIdMailLabels> getByCharacterid(int character_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v3/characters/{character_id}/mail/labels/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCharactersCharacterIdMailLabels.class);
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
                public Requested<GetCharactersCharacterIdMailLists[]> getByCharacterid(int character_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/mail/lists/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCharactersCharacterIdMailLists[].class);
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
            public Requested<GetCharactersCharacterIdMedals[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/medals/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdMedals[].class);
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
            public Requested<GetCharactersCharacterIdMining[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/mining/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdMining[].class);
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
            public Requested<GetCharactersCharacterIdNotifications[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v5/characters/{character_id}/notifications/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdNotifications[].class);
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
                public Requested<GetCharactersCharacterIdNotificationsContacts[]> getByCharacterid(int character_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/notifications/contacts/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCharactersCharacterIdNotificationsContacts[].class);
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
            public Requested<GetCharactersCharacterIdOnline> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/online/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdOnline.class);
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
            public Requested<GetCharactersCharacterIdOpportunities[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/opportunities/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdOpportunities[].class);
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
            public Requested<GetCharactersCharacterIdOrders[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/orders/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdOrders[].class);
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
                public Requested<GetCharactersCharacterIdOrdersHistory[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/orders/history/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCharactersCharacterIdOrdersHistory[].class);
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
            public Requested<GetCharactersCharacterIdPlanets[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/planets/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdPlanets[].class);
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
            public Requested<GetCharactersCharacterIdPlanetsPlanetId> getByCharacteridPlanetid(int character_id, String If_None_Match, int planet_id) {
                String url = ("https://esi.evetech.net/v3/characters/{character_id}/planets/{planet_id}/".replace("{character_id}", ""+character_id).replace("{planet_id}", ""+planet_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdPlanetsPlanetId.class);
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
            public Requested<GetCharactersCharacterIdRoles> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/roles/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdRoles.class);
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
            public Requested<GetCharactersCharacterIdSearch> getByCharacterid(esi.evetech.net.structures.Accept_Language Accept_Language,
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
                return requestGet(url, headerProperties, GetCharactersCharacterIdSearch.class);
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
            public Requested<GetCharactersCharacterIdShip> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/ship/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdShip.class);
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
            public Requested<GetCharactersCharacterIdSkillqueue[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/skillqueue/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdSkillqueue[].class);
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
            public Requested<GetCharactersCharacterIdSkills> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v4/characters/{character_id}/skills/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdSkills.class);
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
            public Requested<GetCharactersCharacterIdStandings[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/standings/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdStandings[].class);
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
            public Requested<GetCharactersCharacterIdStats[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/stats/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdStats[].class);
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
            public Requested<GetCharactersCharacterIdTitles[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/titles/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdTitles[].class);
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
                public Requested<GetCharactersCharacterIdWalletJournal[]> getByCharacterid(int character_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v6/characters/{character_id}/wallet/journal/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCharactersCharacterIdWalletJournal[].class);
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
                public Requested<GetCharactersCharacterIdWalletTransactions[]> getByCharacterid(int character_id, Long from_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/characters/{character_id}/wallet/transactions/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(from_id==null?"":"&from_id="+flatten(from_id))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCharactersCharacterIdWalletTransactions[].class);
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
                public Requested<GetCorporationCorporationIdMiningExtractions[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v1/corporation/{corporation_id}/mining/extractions/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCorporationCorporationIdMiningExtractions[].class);
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
                public Requested<GetCorporationCorporationIdMiningObservers[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v1/corporation/{corporation_id}/mining/observers/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCorporationCorporationIdMiningObservers[].class);
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
                public Requested<GetCorporationCorporationIdMiningObserversObserverId[]> getByCorporationidObserverid(int corporation_id,
                    String If_None_Match,
                    long observer_id,
                    Integer page) {
                    String url = ("https://esi.evetech.net/v1/corporation/{corporation_id}/mining/observers/{observer_id}/".replace("{corporation_id}", ""+corporation_id).replace("{observer_id}", ""+observer_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCorporationCorporationIdMiningObserversObserverId[].class);
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
            public Requested<GetCorporationsCorporationIdAssets[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v3/corporations/{corporation_id}/assets/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdAssets[].class);
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
                public Requested<PostCharactersCharacterIdAssetsLocations[]> postByCorporationid(int corporation_id, long[] item_ids) {
                    String url = ("https://esi.evetech.net/v2/corporations/{corporation_id}/assets/locations/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    Map<String, Object> content = new HashMap<>();
                    content.put("item_ids", item_ids);
                    return requestPost(url, null, content, PostCharactersCharacterIdAssetsLocations[].class);
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
                public Requested<PostCharactersCharacterIdAssetsNames[]> postByCorporationid(int corporation_id, long[] item_ids) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/assets/names/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    Map<String, Object> content = new HashMap<>();
                    content.put("item_ids", item_ids);
                    return requestPost(url, null, content, PostCharactersCharacterIdAssetsNames[].class);
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
            public Requested<GetCorporationsCorporationIdBlueprints[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v2/corporations/{corporation_id}/blueprints/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdBlueprints[].class);
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
            public Requested<GetCorporationsCorporationIdBookmarks[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/bookmarks/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdBookmarks[].class);
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
                public Requested<GetCorporationsCorporationIdBookmarksFolders[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/bookmarks/folders/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCorporationsCorporationIdBookmarksFolders[].class);
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
            public Requested<GetCorporationsCorporationIdContacts[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v2/corporations/{corporation_id}/contacts/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdContacts[].class);
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
                public Requested<GetAlliancesAllianceIdContactsLabels[]> getByCorporationid(int corporation_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/contacts/labels/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetAlliancesAllianceIdContactsLabels[].class);
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
                public Requested<GetCorporationsCorporationIdContainersLogs[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v2/corporations/{corporation_id}/containers/logs/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCorporationsCorporationIdContainersLogs[].class);
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
            public Requested<GetCharactersCharacterIdContracts[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/contracts/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdContracts[].class);
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
                public Requested<GetCharactersCharacterIdContractsContractIdBids[]> getByCorporationidContractid(int contract_id,
                    int corporation_id,
                    String If_None_Match,
                    Integer page) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/contracts/{contract_id}/bids/".replace("{contract_id}", ""+contract_id).replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCharactersCharacterIdContractsContractIdBids[].class);
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
                public Requested<GetCharactersCharacterIdContractsContractIdItems[]> getByCorporationidContractid(int contract_id, int corporation_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/contracts/{contract_id}/items/".replace("{contract_id}", ""+contract_id).replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCharactersCharacterIdContractsContractIdItems[].class);
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
            public Requested<GetCorporationsCorporationIdCustomsOffices[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/customs_offices/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdCustomsOffices[].class);
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
            public Requested<GetCorporationsCorporationIdDivisions> getByCorporationid(int corporation_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/divisions/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdDivisions.class);
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
            public Requested<GetCorporationsCorporationIdFacilities[]> getByCorporationid(int corporation_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/facilities/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdFacilities[].class);
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
                public Requested<GetCorporationsCorporationIdFwStats> getByCorporationid(int corporation_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/fw/stats/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCorporationsCorporationIdFwStats.class);
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
                public Requested<GetCorporationsCorporationIdIndustryJobs[]> getByCorporationid(int corporation_id,
                    String If_None_Match,
                    Boolean include_completed,
                    Integer page) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/industry/jobs/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(include_completed==null?"":"&include_completed="+flatten(include_completed))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCorporationsCorporationIdIndustryJobs[].class);
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
                public Requested<GetCharactersCharacterIdKillmailsRecent[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/killmails/recent/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCharactersCharacterIdKillmailsRecent[].class);
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
            public Requested<GetCorporationsCorporationIdMedals[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/medals/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdMedals[].class);
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
                public Requested<GetCorporationsCorporationIdMedalsIssued[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/medals/issued/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCorporationsCorporationIdMedalsIssued[].class);
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
                public Requested<GetCorporationsCorporationIdMembersTitles[]> getByCorporationid(int corporation_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/members/titles/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCorporationsCorporationIdMembersTitles[].class);
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
            public Requested<GetCorporationsCorporationIdMembertracking[]> getByCorporationid(int corporation_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/membertracking/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdMembertracking[].class);
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
            public Requested<GetCorporationsCorporationIdOrders[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v3/corporations/{corporation_id}/orders/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdOrders[].class);
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
                public Requested<GetCorporationsCorporationIdOrdersHistory[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v2/corporations/{corporation_id}/orders/history/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCorporationsCorporationIdOrdersHistory[].class);
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
            public Requested<GetCorporationsCorporationIdRoles[]> getByCorporationid(int corporation_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/roles/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdRoles[].class);
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
                public Requested<GetCorporationsCorporationIdRolesHistory[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/roles/history/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCorporationsCorporationIdRolesHistory[].class);
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
            public Requested<GetCorporationsCorporationIdShareholders[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/shareholders/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdShareholders[].class);
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
            public Requested<GetCharactersCharacterIdStandings[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/standings/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdStandings[].class);
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
            public Requested<GetCorporationsCorporationIdStarbases[]> getByCorporationid(int corporation_id, String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/starbases/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdStarbases[].class);
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
            public Requested<GetCorporationsCorporationIdStarbasesStarbaseId> getByCorporationidStarbaseid(int corporation_id,
                String If_None_Match,
                long starbase_id,
                int system_id) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/starbases/{starbase_id}/".replace("{corporation_id}", ""+corporation_id).replace("{starbase_id}", ""+starbase_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+"&system_id="+flatten(system_id)+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdStarbasesStarbaseId.class);
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
            public Requested<GetCorporationsCorporationIdStructures[]> getByCorporationid(esi.evetech.net.structures.Accept_Language Accept_Language,
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
                return requestGet(url, headerProperties, GetCorporationsCorporationIdStructures[].class);
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
            public Requested<GetCorporationsCorporationIdTitles[]> getByCorporationid(int corporation_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/titles/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdTitles[].class);
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
            public Requested<GetCorporationsCorporationIdWallets[]> getByCorporationid(int corporation_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/wallets/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdWallets[].class);
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
                public Requested<GetCorporationsCorporationIdWalletsDivisionJournal[]> getByCorporationidDivision(int corporation_id,
                    int division,
                    String If_None_Match,
                    Integer page) {
                    String url = ("https://esi.evetech.net/v4/corporations/{corporation_id}/wallets/{division}/journal/".replace("{corporation_id}", ""+corporation_id).replace("{division}", ""+division)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCorporationsCorporationIdWalletsDivisionJournal[].class);
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
                public Requested<GetCorporationsCorporationIdWalletsDivisionTransactions[]> getByCorporationidDivision(int corporation_id,
                    int division,
                    Long from_id,
                    String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/wallets/{division}/transactions/".replace("{corporation_id}", ""+corporation_id).replace("{division}", ""+division)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(from_id==null?"":"&from_id="+flatten(from_id))+(token==null?"":"&token="+flatten(token)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetCorporationsCorporationIdWalletsDivisionTransactions[].class);
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
        public Requested<GetFleetsFleetId> getByFleetid(long fleet_id, String If_None_Match) {
            String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/".replace("{fleet_id}", ""+fleet_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (If_None_Match!= null) {
                headerProperties.put("If-None-Match", (""+ If_None_Match));
            }
            return requestGet(url, headerProperties, GetFleetsFleetId.class);
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
            public Requested<GetFleetsFleetIdMembers[]> getByFleetid(esi.evetech.net.structures.Accept_Language Accept_Language,
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
                return requestGet(url, headerProperties, GetFleetsFleetIdMembers[].class);
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
            public Requested<GetFleetsFleetIdWings[]> getByFleetid(esi.evetech.net.structures.Accept_Language Accept_Language,
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
                return requestGet(url, headerProperties, GetFleetsFleetIdWings[].class);
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
            public Requested<PostFleetsFleetIdWingsCreated> postByFleetid(long fleet_id) {
                String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/wings/".replace("{fleet_id}", ""+fleet_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                return requestPost(url, null, null, PostFleetsFleetIdWingsCreated.class);
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
                public Requested<PostFleetsFleetIdWingsWingIdSquadsCreated> postByFleetidWingid(long fleet_id, long wing_id) {
                    String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/wings/{wing_id}/squads/".replace("{fleet_id}", ""+fleet_id).replace("{wing_id}", ""+wing_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                    return requestPost(url, null, null, PostFleetsFleetIdWingsWingIdSquadsCreated.class);
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
            public Requested<GetMarketsStructuresStructureId[]> getByStructureid(String If_None_Match, Integer page, long structure_id) {
                String url = ("https://esi.evetech.net/v1/markets/structures/{structure_id}/".replace("{structure_id}", ""+structure_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetMarketsStructuresStructureId[].class);
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
            public Requested<GetUniverseStructuresStructureId> getByStructureid(String If_None_Match, long structure_id) {
                String url = ("https://esi.evetech.net/v2/universe/structures/{structure_id}/".replace("{structure_id}", ""+structure_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(token==null?"":"&token="+flatten(token)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetUniverseStructuresStructureId.class);
            }
        }
    }
}
