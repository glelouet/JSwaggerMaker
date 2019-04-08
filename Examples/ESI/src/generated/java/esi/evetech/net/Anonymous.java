package esi.evetech.net;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.responses.get_alliances_alliance_id;
import esi.evetech.net.responses.get_alliances_alliance_id_icons;
import esi.evetech.net.responses.get_characters_character_id;
import esi.evetech.net.responses.get_characters_character_id_corporationhistory_200;
import esi.evetech.net.responses.get_characters_character_id_killmails_recent_200;
import esi.evetech.net.responses.get_characters_character_id_portrait;
import esi.evetech.net.responses.get_contracts_public_bids_contract_id_200;
import esi.evetech.net.responses.get_contracts_public_items_contract_id_200;
import esi.evetech.net.responses.get_contracts_public_region_id_200;
import esi.evetech.net.responses.get_corporations_corporation_id;
import esi.evetech.net.responses.get_corporations_corporation_id_alliancehistory_200;
import esi.evetech.net.responses.get_corporations_corporation_id_icons;
import esi.evetech.net.responses.get_dogma_attributes_attribute_id;
import esi.evetech.net.responses.get_dogma_dynamic_items_type_id_item_id;
import esi.evetech.net.responses.get_dogma_effects_effect_id;
import esi.evetech.net.responses.get_fw_stats_200;
import esi.evetech.net.responses.get_fw_systems_200;
import esi.evetech.net.responses.get_fw_wars_200;
import esi.evetech.net.responses.get_incursions_200;
import esi.evetech.net.responses.get_industry_facilities_200;
import esi.evetech.net.responses.get_industry_systems_200;
import esi.evetech.net.responses.get_insurance_prices_200;
import esi.evetech.net.responses.get_killmails_killmail_id_killmail_hash;
import esi.evetech.net.responses.get_loyalty_stores_corporation_id_offers_200;
import esi.evetech.net.responses.get_markets_groups_market_group_id;
import esi.evetech.net.responses.get_markets_prices_200;
import esi.evetech.net.responses.get_markets_region_id_history_200;
import esi.evetech.net.responses.get_markets_region_id_orders_200;
import esi.evetech.net.responses.get_opportunities_groups_group_id;
import esi.evetech.net.responses.get_opportunities_tasks_task_id;
import esi.evetech.net.responses.get_search;
import esi.evetech.net.responses.get_sovereignty_campaigns_200;
import esi.evetech.net.responses.get_sovereignty_map_200;
import esi.evetech.net.responses.get_sovereignty_structures_200;
import esi.evetech.net.responses.get_universe_ancestries_200;
import esi.evetech.net.responses.get_universe_asteroid_belts_asteroid_belt_id;
import esi.evetech.net.responses.get_universe_bloodlines_200;
import esi.evetech.net.responses.get_universe_categories_category_id;
import esi.evetech.net.responses.get_universe_constellations_constellation_id;
import esi.evetech.net.responses.get_universe_factions_200;
import esi.evetech.net.responses.get_universe_graphics_graphic_id;
import esi.evetech.net.responses.get_universe_groups_group_id;
import esi.evetech.net.responses.get_universe_moons_moon_id;
import esi.evetech.net.responses.get_universe_planets_planet_id;
import esi.evetech.net.responses.get_universe_races_200;
import esi.evetech.net.responses.get_universe_regions_region_id;
import esi.evetech.net.responses.get_universe_schematics_schematic_id;
import esi.evetech.net.responses.get_universe_stargates_stargate_id;
import esi.evetech.net.responses.get_universe_stars_star_id;
import esi.evetech.net.responses.get_universe_stations_station_id;
import esi.evetech.net.responses.get_universe_system_jumps_200;
import esi.evetech.net.responses.get_universe_system_kills_200;
import esi.evetech.net.responses.get_universe_systems_system_id;
import esi.evetech.net.responses.get_universe_types_type_id;
import esi.evetech.net.responses.get_wars_war_id;
import esi.evetech.net.responses.post_characters_affiliation_200;
import esi.evetech.net.responses.post_universe_names_200;
import fr.lelouet.jswaggermaker.client.common.impl.securities.Disconnected;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;


/**
 * access esi.evetech.net with no authorization.
 */
public class Anonymous
    extends Disconnected
{
    /**
     * The server name you would like data from
     */
    public esi.evetech.net.structures.datasource datasource;

    /**
     * List all alliances
     * <p>
     * List all active player alliances<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<Integer[]> get_alliances(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/alliances/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Integer[].class);
    }

    /**
     * List alliance's corporations
     * <p>
     * List all current member corporations of an alliance<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param alliance_id
     *     An EVE alliance ID
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<Integer[]> get_alliances_corporations(int alliance_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/alliances/{alliance_id}/corporations/".replace("{alliance_id}", ""+alliance_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Integer[].class);
    }

    /**
     * Get alliance icon
     * <p>
     * Get the icon urls for a alliance<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param alliance_id
     *     An EVE alliance ID
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_alliances_alliance_id_icons> get_alliances_icons(int alliance_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/alliances/{alliance_id}/icons/".replace("{alliance_id}", ""+alliance_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_alliances_alliance_id_icons.class);
    }

    /**
     * Character affiliation
     * <p>
     * Bulk lookup of character IDs to corporation, alliance and faction<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param characters
     *     The character IDs to fetch affiliations for. All characters must exist, or none will be returned
     * @param datasource
     *     The server name you would like data from
     */
    public Requested<post_characters_affiliation_200 []> post_affiliation(int[] characters) {
        String url = ("https://esi.evetech.net/v1/characters/affiliation/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        Map<String, Object> content = new HashMap<>();
        content.put("characters", characters);
        return requestPost(url, null, content, post_characters_affiliation_200 [].class);
    }

    /**
     * Get corporation history
     * <p>
     * Get a list of all the corporations a character has been a member of<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_characters_character_id_corporationhistory_200 []> get_characters_corporationhistory(int character_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/characters/{character_id}/corporationhistory/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_characters_character_id_corporationhistory_200 [].class);
    }

    /**
     * Get public contract bids
     * <p>
     * Lists bids on a public auction contract<br />
     * This route is cached for up to 300 seconds
     * </p>
     * 
     * @param contract_id
     *     ID of a contract
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     */
    public Requested<get_contracts_public_bids_contract_id_200 []> get_contracts_public_bids(int contract_id, String If_None_Match, Integer page) {
        String url = ("https://esi.evetech.net/v1/contracts/public/bids/{contract_id}/".replace("{contract_id}", ""+contract_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_contracts_public_bids_contract_id_200 [].class);
    }

    /**
     * Get public contract items
     * <p>
     * Lists items of a public contract<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param contract_id
     *     ID of a contract
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     */
    public Requested<get_contracts_public_items_contract_id_200 []> get_contracts_public_items(int contract_id, String If_None_Match, Integer page) {
        String url = ("https://esi.evetech.net/v1/contracts/public/items/{contract_id}/".replace("{contract_id}", ""+contract_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_contracts_public_items_contract_id_200 [].class);
    }

    /**
     * Get public contracts
     * <p>
     * Returns a paginated list of all public contracts in the given region<br />
     * This route is cached for up to 1800 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     * @param region_id
     *     An EVE region id
     */
    public Requested<get_contracts_public_region_id_200 []> get_contracts_public(String If_None_Match, Integer page, int region_id) {
        String url = ("https://esi.evetech.net/v1/contracts/public/{region_id}/".replace("{region_id}", ""+region_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_contracts_public_region_id_200 [].class);
    }

    /**
     * Get npc corporations
     * <p>
     * Get a list of npc corporations<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<Integer[]> get_corporations_npccorps(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/corporations/npccorps/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Integer[].class);
    }

    /**
     * Get corporation icon
     * <p>
     * Get the icon urls for a corporation<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_corporations_corporation_id_icons> get_corporations_icons(int corporation_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/icons/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_corporations_corporation_id_icons.class);
    }

    /**
     * Get attributes
     * <p>
     * Get a list of dogma attribute ids<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<Integer[]> get_dogma_attributes(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/dogma/attributes/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Integer[].class);
    }

    /**
     * Get attribute information
     * <p>
     * Get information on a dogma attribute<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param attribute_id
     *     A dogma attribute ID
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_dogma_attributes_attribute_id> get_dogma_attributes(int attribute_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/dogma/attributes/{attribute_id}/".replace("{attribute_id}", ""+attribute_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_dogma_attributes_attribute_id.class);
    }

    /**
     * Get dynamic item information
     * <p>
     * Returns info about a dynamic item resulting from mutation with a mutaplasmid.<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param item_id
     *     item_id integer
     * @param type_id
     *     type_id integer
     */
    public Requested<get_dogma_dynamic_items_type_id_item_id> get_dogma_dynamic_items(String If_None_Match, long item_id, int type_id) {
        String url = ("https://esi.evetech.net/v1/dogma/dynamic/items/{type_id}/{item_id}/".replace("{item_id}", ""+item_id).replace("{type_id}", ""+type_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_dogma_dynamic_items_type_id_item_id.class);
    }

    /**
     * Get effects
     * <p>
     * Get a list of dogma effect ids<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<Integer[]> get_dogma_effects(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/dogma/effects/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Integer[].class);
    }

    /**
     * List of the top factions in faction warfare
     * <p>
     * Top 4 leaderboard of factions for kills and victory points separated by total, last week and yesterday<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<esi.evetech.net.responses.get_fw_leaderboards> get_fw_leaderboards(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/fw/leaderboards/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, esi.evetech.net.responses.get_fw_leaderboards.class);
    }

    /**
     * List of the top pilots in faction warfare
     * <p>
     * Top 100 leaderboard of pilots for kills and victory points separated by total, last week and yesterday<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<esi.evetech.net.responses.get_fw_leaderboards> get_fw_leaderboards_characters(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/fw/leaderboards/characters/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, esi.evetech.net.responses.get_fw_leaderboards.class);
    }

    /**
     * List of the top corporations in faction warfare
     * <p>
     * Top 10 leaderboard of corporations for kills and victory points separated by total, last week and yesterday<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<esi.evetech.net.responses.get_fw_leaderboards> get_fw_leaderboards_corporations(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/fw/leaderboards/corporations/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, esi.evetech.net.responses.get_fw_leaderboards.class);
    }

    /**
     * An overview of statistics about factions involved in faction warfare
     * <p>
     * Statistical overviews of factions involved in faction warfare<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_fw_stats_200 []> get_fw_stats(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/fw/stats/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_fw_stats_200 [].class);
    }

    /**
     * Data about which NPC factions are at war
     * <p>
     * Data about which NPC factions are at war<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_fw_wars_200 []> get_fw_wars(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/fw/wars/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_fw_wars_200 [].class);
    }

    /**
     * List incursions
     * <p>
     * Return a list of current incursions<br />
     * This route is cached for up to 300 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_incursions_200 []> get_incursions(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/incursions/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_incursions_200 [].class);
    }

    /**
     * List industry facilities
     * <p>
     * Return a list of industry facilities<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_industry_facilities_200 []> get_industry_facilities(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/industry/facilities/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_industry_facilities_200 [].class);
    }

    /**
     * List solar system cost indices
     * <p>
     * Return cost indices for solar systems<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_industry_systems_200 []> get_industry_systems(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/industry/systems/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_industry_systems_200 [].class);
    }

    /**
     * List insurance levels
     * <p>
     * Return available insurance levels for all ship types<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param Accept-Language
     *     Language to use in the response
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     */
    public Requested<get_insurance_prices_200 []> get_insurance_prices(esi.evetech.net.structures.Accept_Language Accept_Language, String If_None_Match, esi.evetech.net.structures.language language) {
        String url = ("https://esi.evetech.net/v1/insurance/prices/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, get_insurance_prices_200 [].class);
    }

    /**
     * Get a single killmail
     * <p>
     * Return a single killmail from its ID and hash<br />
     * This route is cached for up to 1209600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param killmail_hash
     *     The killmail hash for verification
     * @param killmail_id
     *     The killmail ID to be queried
     */
    public Requested<get_killmails_killmail_id_killmail_hash> get_killmails(String If_None_Match, String killmail_hash, int killmail_id) {
        String url = ("https://esi.evetech.net/v1/killmails/{killmail_id}/{killmail_hash}/".replace("{killmail_hash}", ""+killmail_hash).replace("{killmail_id}", ""+killmail_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_killmails_killmail_id_killmail_hash.class);
    }

    /**
     * List loyalty store offers
     * <p>
     * Return a list of offers from a specific corporation's loyalty store<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_loyalty_stores_corporation_id_offers_200 []> get_loyalty_stores_offers(int corporation_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/loyalty/stores/{corporation_id}/offers/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_loyalty_stores_corporation_id_offers_200 [].class);
    }

    /**
     * Get item groups
     * <p>
     * Get a list of item groups<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<Integer[]> get_markets_groups(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/markets/groups/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Integer[].class);
    }

    /**
     * Get item group information
     * <p>
     * Get information on an item group<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param Accept-Language
     *     Language to use in the response
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     * @param market_group_id
     *     An Eve item group ID
     */
    public Requested<get_markets_groups_market_group_id> get_markets_groups(esi.evetech.net.structures.Accept_Language Accept_Language,
        String If_None_Match,
        esi.evetech.net.structures.language language,
        int market_group_id) {
        String url = ("https://esi.evetech.net/v1/markets/groups/{market_group_id}/".replace("{market_group_id}", ""+market_group_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, get_markets_groups_market_group_id.class);
    }

    /**
     * List market prices
     * <p>
     * Return a list of prices<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_markets_prices_200 []> get_markets_prices(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/markets/prices/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_markets_prices_200 [].class);
    }

    /**
     * List historical market statistics in a region
     * <p>
     * Return a list of historical market statistics for the specified type in a region<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param region_id
     *     Return statistics in this region
     * @param type_id
     *     Return statistics for this type
     */
    public Requested<get_markets_region_id_history_200 []> get_markets_history(String If_None_Match, int region_id, int type_id) {
        String url = ("https://esi.evetech.net/v1/markets/{region_id}/history/".replace("{region_id}", ""+region_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+"&type_id="+flatten(type_id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_markets_region_id_history_200 [].class);
    }

    /**
     * List orders in a region
     * <p>
     * Return a list of orders in a region<br />
     * This route is cached for up to 300 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param order_type
     *     Filter buy/sell orders, return all orders by default. If you query without type_id, we always return both buy and sell orders
     * @param page
     *     Which page of results to return
     * @param region_id
     *     Return orders in this region
     * @param type_id
     *     Return orders only for this type
     */
    public Requested<get_markets_region_id_orders_200 []> get_markets_orders(String If_None_Match,
        esi.evetech.net.structures.order_type order_type,
        Integer page,
        int region_id,
        Integer type_id) {
        String url = ("https://esi.evetech.net/v1/markets/{region_id}/orders/".replace("{region_id}", ""+region_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(order_type==null?"":"&order_type="+flatten(order_type))+(page==null?"":"&page="+flatten(page))+(type_id==null?"":"&type_id="+flatten(type_id)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_markets_region_id_orders_200 [].class);
    }

    /**
     * List type IDs relevant to a market
     * <p>
     * Return a list of type IDs that have active orders in the region, for efficient market indexing.<br />
     * This route is cached for up to 600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     * @param region_id
     *     Return statistics in this region
     */
    public Requested<Integer[]> get_markets_types(String If_None_Match, Integer page, int region_id) {
        String url = ("https://esi.evetech.net/v1/markets/{region_id}/types/".replace("{region_id}", ""+region_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Integer[].class);
    }

    /**
     * Get opportunities groups
     * <p>
     * Return a list of opportunities groups<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<Integer[]> get_opportunities_groups(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/opportunities/groups/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Integer[].class);
    }

    /**
     * Get opportunities group
     * <p>
     * Return information of an opportunities group<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param Accept-Language
     *     Language to use in the response
     * @param datasource
     *     The server name you would like data from
     * @param group_id
     *     ID of an opportunities group
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     */
    public Requested<get_opportunities_groups_group_id> get_opportunities_groups(esi.evetech.net.structures.Accept_Language Accept_Language,
        int group_id,
        String If_None_Match,
        esi.evetech.net.structures.language language) {
        String url = ("https://esi.evetech.net/v1/opportunities/groups/{group_id}/".replace("{group_id}", ""+group_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, get_opportunities_groups_group_id.class);
    }

    /**
     * Get opportunities tasks
     * <p>
     * Return a list of opportunities tasks<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<Integer[]> get_opportunities_tasks(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/opportunities/tasks/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Integer[].class);
    }

    /**
     * Get opportunities task
     * <p>
     * Return information of an opportunities task<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param task_id
     *     ID of an opportunities task
     */
    public Requested<get_opportunities_tasks_task_id> get_opportunities_tasks(String If_None_Match, int task_id) {
        String url = ("https://esi.evetech.net/v1/opportunities/tasks/{task_id}/".replace("{task_id}", ""+task_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_opportunities_tasks_task_id.class);
    }

    /**
     * Get route
     * <p>
     * Get the systems between origin and destination<br />
     * This route is cached for up to 86400 seconds
     * </p>
     * 
     * @param avoid
     *     avoid solar system ID(s)
     * @param connections
     *     connected solar system pairs
     * @param datasource
     *     The server name you would like data from
     * @param destination
     *     destination solar system ID
     * @param flag
     *     route security preference
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param origin
     *     origin solar system ID
     */
    public Requested<Integer[]> get_route(int[] avoid,
        int[][] connections,
        int destination,
        esi.evetech.net.structures.flag flag,
        String If_None_Match,
        int origin) {
        String url = ("https://esi.evetech.net/v1/route/{origin}/{destination}/".replace("{destination}", ""+destination).replace("{origin}", ""+origin)+"?"+(avoid==null?"":"&avoid="+flatten(avoid))+(connections==null?"":"&connections="+flatten(connections))+(datasource==null?"":"&datasource="+flatten(datasource))+(flag==null?"":"&flag="+flatten(flag)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Integer[].class);
    }

    /**
     * List sovereignty campaigns
     * <p>
     * Shows sovereignty data for campaigns.<br />
     * This route is cached for up to 5 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_sovereignty_campaigns_200 []> get_sovereignty_campaigns(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/sovereignty/campaigns/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_sovereignty_campaigns_200 [].class);
    }

    /**
     * List sovereignty of systems
     * <p>
     * Shows sovereignty information for solar systems<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_sovereignty_map_200 []> get_sovereignty_map(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/sovereignty/map/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_sovereignty_map_200 [].class);
    }

    /**
     * List sovereignty structures
     * <p>
     * Shows sovereignty data for structures.<br />
     * This route is cached for up to 120 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_sovereignty_structures_200 []> get_sovereignty_structures(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/sovereignty/structures/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_sovereignty_structures_200 [].class);
    }

    /**
     * Retrieve the uptime and player counts
     * <p>
     * EVE Server status<br />
     * This route is cached for up to 30 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<esi.evetech.net.responses.get_status> get_status(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/status/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, esi.evetech.net.responses.get_status.class);
    }

    /**
     * Get ancestries
     * <p>
     * Get all character ancestries<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param Accept-Language
     *     Language to use in the response
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     */
    public Requested<get_universe_ancestries_200 []> get_universe_ancestries(esi.evetech.net.structures.Accept_Language Accept_Language, String If_None_Match, esi.evetech.net.structures.language language) {
        String url = ("https://esi.evetech.net/v1/universe/ancestries/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, get_universe_ancestries_200 [].class);
    }

    /**
     * Get asteroid belt information
     * <p>
     * Get information on an asteroid belt<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param asteroid_belt_id
     *     asteroid_belt_id integer
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_universe_asteroid_belts_asteroid_belt_id> get_universe_asteroid_belts(int asteroid_belt_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/universe/asteroid_belts/{asteroid_belt_id}/".replace("{asteroid_belt_id}", ""+asteroid_belt_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_universe_asteroid_belts_asteroid_belt_id.class);
    }

    /**
     * Get bloodlines
     * <p>
     * Get a list of bloodlines<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param Accept-Language
     *     Language to use in the response
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     */
    public Requested<get_universe_bloodlines_200 []> get_universe_bloodlines(esi.evetech.net.structures.Accept_Language Accept_Language, String If_None_Match, esi.evetech.net.structures.language language) {
        String url = ("https://esi.evetech.net/v1/universe/bloodlines/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, get_universe_bloodlines_200 [].class);
    }

    /**
     * Get item categories
     * <p>
     * Get a list of item categories<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<Integer[]> get_universe_categories(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/universe/categories/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Integer[].class);
    }

    /**
     * Get item category information
     * <p>
     * Get information of an item category<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param Accept-Language
     *     Language to use in the response
     * @param category_id
     *     An Eve item category ID
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     */
    public Requested<get_universe_categories_category_id> get_universe_categories(esi.evetech.net.structures.Accept_Language Accept_Language,
        int category_id,
        String If_None_Match,
        esi.evetech.net.structures.language language) {
        String url = ("https://esi.evetech.net/v1/universe/categories/{category_id}/".replace("{category_id}", ""+category_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, get_universe_categories_category_id.class);
    }

    /**
     * Get constellations
     * <p>
     * Get a list of constellations<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<Integer[]> get_universe_constellations(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/universe/constellations/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Integer[].class);
    }

    /**
     * Get constellation information
     * <p>
     * Get information on a constellation<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param Accept-Language
     *     Language to use in the response
     * @param constellation_id
     *     constellation_id integer
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     */
    public Requested<get_universe_constellations_constellation_id> get_universe_constellations(esi.evetech.net.structures.Accept_Language Accept_Language,
        int constellation_id,
        String If_None_Match,
        esi.evetech.net.structures.language language) {
        String url = ("https://esi.evetech.net/v1/universe/constellations/{constellation_id}/".replace("{constellation_id}", ""+constellation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, get_universe_constellations_constellation_id.class);
    }

    /**
     * Get graphics
     * <p>
     * Get a list of graphics<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<Integer[]> get_universe_graphics(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/universe/graphics/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Integer[].class);
    }

    /**
     * Get graphic information
     * <p>
     * Get information on a graphic<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param graphic_id
     *     graphic_id integer
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_universe_graphics_graphic_id> get_universe_graphics(int graphic_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/universe/graphics/{graphic_id}/".replace("{graphic_id}", ""+graphic_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_universe_graphics_graphic_id.class);
    }

    /**
     * Get item groups
     * <p>
     * Get a list of item groups<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     */
    public Requested<Integer[]> get_universe_groups(String If_None_Match, Integer page) {
        String url = ("https://esi.evetech.net/v1/universe/groups/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Integer[].class);
    }

    /**
     * Get item group information
     * <p>
     * Get information on an item group<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param Accept-Language
     *     Language to use in the response
     * @param datasource
     *     The server name you would like data from
     * @param group_id
     *     An Eve item group ID
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     */
    public Requested<get_universe_groups_group_id> get_universe_groups(esi.evetech.net.structures.Accept_Language Accept_Language,
        int group_id,
        String If_None_Match,
        esi.evetech.net.structures.language language) {
        String url = ("https://esi.evetech.net/v1/universe/groups/{group_id}/".replace("{group_id}", ""+group_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, get_universe_groups_group_id.class);
    }

    /**
     * Bulk names to IDs
     * <p>
     * Resolve a set of names to IDs in the following categories: agents, alliances, characters, constellations, corporations factions, inventory_types, regions, stations, and systems. Only exact matches will be returned. All names searched for are cached for 12 hours
     * </p>
     * 
     * @param Accept-Language
     *     Language to use in the response
     * @param datasource
     *     The server name you would like data from
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     * @param names
     *     The names to resolve
     */
    public Requested<esi.evetech.net.responses.post_universe_ids> post_universe_ids(esi.evetech.net.structures.Accept_Language Accept_Language, esi.evetech.net.structures.language language, String[] names) {
        String url = ("https://esi.evetech.net/v1/universe/ids/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("names", names);
        return requestPost(url, headerProperties, content, esi.evetech.net.responses.post_universe_ids.class);
    }

    /**
     * Get moon information
     * <p>
     * Get information on a moon<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param moon_id
     *     moon_id integer
     */
    public Requested<get_universe_moons_moon_id> get_universe_moons(String If_None_Match, int moon_id) {
        String url = ("https://esi.evetech.net/v1/universe/moons/{moon_id}/".replace("{moon_id}", ""+moon_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_universe_moons_moon_id.class);
    }

    /**
     * Get planet information
     * <p>
     * Get information on a planet<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param planet_id
     *     planet_id integer
     */
    public Requested<get_universe_planets_planet_id> get_universe_planets(String If_None_Match, int planet_id) {
        String url = ("https://esi.evetech.net/v1/universe/planets/{planet_id}/".replace("{planet_id}", ""+planet_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_universe_planets_planet_id.class);
    }

    /**
     * Get character races
     * <p>
     * Get a list of character races<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param Accept-Language
     *     Language to use in the response
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     */
    public Requested<get_universe_races_200 []> get_universe_races(esi.evetech.net.structures.Accept_Language Accept_Language, String If_None_Match, esi.evetech.net.structures.language language) {
        String url = ("https://esi.evetech.net/v1/universe/races/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, get_universe_races_200 [].class);
    }

    /**
     * Get regions
     * <p>
     * Get a list of regions<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<Integer[]> get_universe_regions(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/universe/regions/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Integer[].class);
    }

    /**
     * Get region information
     * <p>
     * Get information on a region<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param Accept-Language
     *     Language to use in the response
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     * @param region_id
     *     region_id integer
     */
    public Requested<get_universe_regions_region_id> get_universe_regions(esi.evetech.net.structures.Accept_Language Accept_Language,
        String If_None_Match,
        esi.evetech.net.structures.language language,
        int region_id) {
        String url = ("https://esi.evetech.net/v1/universe/regions/{region_id}/".replace("{region_id}", ""+region_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, get_universe_regions_region_id.class);
    }

    /**
     * Get schematic information
     * <p>
     * Get information on a planetary factory schematic<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param schematic_id
     *     A PI schematic ID
     */
    public Requested<get_universe_schematics_schematic_id> get_universe_schematics(String If_None_Match, int schematic_id) {
        String url = ("https://esi.evetech.net/v1/universe/schematics/{schematic_id}/".replace("{schematic_id}", ""+schematic_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_universe_schematics_schematic_id.class);
    }

    /**
     * Get stargate information
     * <p>
     * Get information on a stargate<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param stargate_id
     *     stargate_id integer
     */
    public Requested<get_universe_stargates_stargate_id> get_universe_stargates(String If_None_Match, int stargate_id) {
        String url = ("https://esi.evetech.net/v1/universe/stargates/{stargate_id}/".replace("{stargate_id}", ""+stargate_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_universe_stargates_stargate_id.class);
    }

    /**
     * Get star information
     * <p>
     * Get information on a star<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param star_id
     *     star_id integer
     */
    public Requested<get_universe_stars_star_id> get_universe_stars(String If_None_Match, int star_id) {
        String url = ("https://esi.evetech.net/v1/universe/stars/{star_id}/".replace("{star_id}", ""+star_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_universe_stars_star_id.class);
    }

    /**
     * List all public structures
     * <p>
     * List all public structures<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param filter
     *     Only list public structures that have this service online
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<Long[]> get_universe_structures(esi.evetech.net.structures.filter filter, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/universe/structures/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(filter==null?"":"&filter="+flatten(filter)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Long[].class);
    }

    /**
     * Get system jumps
     * <p>
     * Get the number of jumps in solar systems within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with jumps will be listed<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_universe_system_jumps_200 []> get_universe_system_jumps(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/universe/system_jumps/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_universe_system_jumps_200 [].class);
    }

    /**
     * Get solar systems
     * <p>
     * Get a list of solar systems<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<Integer[]> get_universe_systems(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/universe/systems/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Integer[].class);
    }

    /**
     * Get types
     * <p>
     * Get a list of type ids<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     */
    public Requested<Integer[]> get_universe_types(String If_None_Match, Integer page) {
        String url = ("https://esi.evetech.net/v1/universe/types/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Integer[].class);
    }

    /**
     * List wars
     * <p>
     * Return a list of wars<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param max_war_id
     *     Only return wars with ID smaller than this
     */
    public Requested<Integer[]> get_wars(String If_None_Match, Integer max_war_id) {
        String url = ("https://esi.evetech.net/v1/wars/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(max_war_id==null?"":"&max_war_id="+flatten(max_war_id)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, Integer[].class);
    }

    /**
     * Get war information
     * <p>
     * Return details about a war<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param war_id
     *     ID for a war
     */
    public Requested<get_wars_war_id> get_wars(String If_None_Match, int war_id) {
        String url = ("https://esi.evetech.net/v1/wars/{war_id}/".replace("{war_id}", ""+war_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_wars_war_id.class);
    }

    /**
     * List kills for a war
     * <p>
     * Return a list of kills related to a war<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     * @param war_id
     *     A valid war ID
     */
    public Requested<get_characters_character_id_killmails_recent_200 []> get_wars_killmails(String If_None_Match, Integer page, int war_id) {
        String url = ("https://esi.evetech.net/v1/wars/{war_id}/killmails/".replace("{war_id}", ""+war_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_characters_character_id_killmails_recent_200 [].class);
    }

    /**
     * Get character portraits
     * <p>
     * Get portrait urls for a character<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_characters_character_id_portrait> get_characters_portrait(int character_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v2/characters/{character_id}/portrait/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_characters_character_id_portrait.class);
    }

    /**
     * Get alliance history
     * <p>
     * Get a list of all the alliances a corporation has been a member of<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_corporations_corporation_id_alliancehistory_200 []> get_corporations_alliancehistory(int corporation_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v2/corporations/{corporation_id}/alliancehistory/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_corporations_corporation_id_alliancehistory_200 [].class);
    }

    /**
     * Get effect information
     * <p>
     * Get information on a dogma effect<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param effect_id
     *     A dogma effect ID
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_dogma_effects_effect_id> get_dogma_effects(int effect_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v2/dogma/effects/{effect_id}/".replace("{effect_id}", ""+effect_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_dogma_effects_effect_id.class);
    }

    /**
     * Ownership of faction warfare systems
     * <p>
     * An overview of the current ownership of faction warfare solar systems<br />
     * This route is cached for up to 1800 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_fw_systems_200 []> get_fw_systems(String If_None_Match) {
        String url = ("https://esi.evetech.net/v2/fw/systems/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_fw_systems_200 [].class);
    }

    /**
     * Search on a string
     * <p>
     * Search for entities that match a given sub-string.<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param Accept-Language
     *     Language to use in the response
     * @param categories
     *     Type of entities to search for
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     * @param search
     *     The string to search on
     * @param strict
     *     Whether the search should be a strict match
     */
    public Requested<get_search> get(esi.evetech.net.structures.Accept_Language Accept_Language,
        String[] categories,
        String If_None_Match,
        esi.evetech.net.structures.language language,
        String search,
        Boolean strict) {
        String url = ("https://esi.evetech.net/v2/search/"+"?"+(categories==null?"":"&categories="+flatten(categories))+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language))+(search==null?"":"&search="+flatten(search))+(strict==null?"":"&strict="+flatten(strict)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, get_search.class);
    }

    /**
     * Get factions
     * <p>
     * Get a list of factions<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param Accept-Language
     *     Language to use in the response
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     */
    public Requested<get_universe_factions_200 []> get_universe_factions(esi.evetech.net.structures.Accept_Language Accept_Language, String If_None_Match, esi.evetech.net.structures.language language) {
        String url = ("https://esi.evetech.net/v2/universe/factions/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, get_universe_factions_200 [].class);
    }

    /**
     * Get station information
     * <p>
     * Get information on a station<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param station_id
     *     station_id integer
     */
    public Requested<get_universe_stations_station_id> get_universe_stations(String If_None_Match, int station_id) {
        String url = ("https://esi.evetech.net/v2/universe/stations/{station_id}/".replace("{station_id}", ""+station_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_universe_stations_station_id.class);
    }

    /**
     * Get system kills
     * <p>
     * Get the number of ship, pod and NPC kills per solar system within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with kills will be listed<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_universe_system_kills_200 []> get_universe_system_kills(String If_None_Match) {
        String url = ("https://esi.evetech.net/v2/universe/system_kills/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_universe_system_kills_200 [].class);
    }

    /**
     * Get alliance information
     * <p>
     * Public information about an alliance<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param alliance_id
     *     An EVE alliance ID
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_alliances_alliance_id> get_alliances(int alliance_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v3/alliances/{alliance_id}/".replace("{alliance_id}", ""+alliance_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_alliances_alliance_id.class);
    }

    /**
     * Get names and categories for a set of IDs
     * <p>
     * Resolve a set of IDs to names and categories. Supported ID's for resolving are: Characters, Corporations, Alliances, Stations, Solar Systems, Constellations, Regions, Types, Factions
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param ids
     *     The ids to resolve
     */
    public Requested<post_universe_names_200 []> post_universe_names(int[] ids) {
        String url = ("https://esi.evetech.net/v3/universe/names/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        Map<String, Object> content = new HashMap<>();
        content.put("ids", ids);
        return requestPost(url, null, content, post_universe_names_200 [].class);
    }

    /**
     * Get type information
     * <p>
     * Get information on a type<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param Accept-Language
     *     Language to use in the response
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     * @param type_id
     *     An Eve item type ID
     */
    public Requested<get_universe_types_type_id> get_universe_types(esi.evetech.net.structures.Accept_Language Accept_Language,
        String If_None_Match,
        esi.evetech.net.structures.language language,
        int type_id) {
        String url = ("https://esi.evetech.net/v3/universe/types/{type_id}/".replace("{type_id}", ""+type_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, get_universe_types_type_id.class);
    }

    /**
     * Get character's public information
     * <p>
     * Public information about a character<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_characters_character_id> get_characters(int character_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v4/characters/{character_id}/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_characters_character_id.class);
    }

    /**
     * Get corporation information
     * <p>
     * Public information about a corporation<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<get_corporations_corporation_id> get_corporations(int corporation_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v4/corporations/{corporation_id}/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, get_corporations_corporation_id.class);
    }

    /**
     * Get solar system information
     * <p>
     * Get information on a solar system.<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param Accept-Language
     *     Language to use in the response
     * @param datasource
     *     The server name you would like data from
     * @param If-None-Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     * @param system_id
     *     system_id integer
     */
    public Requested<get_universe_systems_system_id> get_universe_systems(esi.evetech.net.structures.Accept_Language Accept_Language,
        String If_None_Match,
        esi.evetech.net.structures.language language,
        int system_id) {
        String url = ("https://esi.evetech.net/v4/universe/systems/{system_id}/".replace("{system_id}", ""+system_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, get_universe_systems_system_id.class);
    }
}
