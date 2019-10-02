package esi.evetech.net;

import java.util.HashMap;
import esi.evetech.net.responses.GetAlliancesAllianceId;
import esi.evetech.net.responses.GetAlliancesAllianceIdIcons;
import esi.evetech.net.responses.GetCharactersCharacterId;
import esi.evetech.net.responses.GetCharactersCharacterIdCorporationhistory;
import esi.evetech.net.responses.GetCharactersCharacterIdKillmailsRecent;
import esi.evetech.net.responses.GetCharactersCharacterIdPortrait;
import esi.evetech.net.responses.GetContractsPublicBidsContractId;
import esi.evetech.net.responses.GetContractsPublicItemsContractId;
import esi.evetech.net.responses.GetContractsPublicRegionId;
import esi.evetech.net.responses.GetCorporationsCorporationId;
import esi.evetech.net.responses.GetCorporationsCorporationIdAlliancehistory;
import esi.evetech.net.responses.GetCorporationsCorporationIdIcons;
import esi.evetech.net.responses.GetDogmaAttributesAttributeId;
import esi.evetech.net.responses.GetDogmaDynamicItemsTypeIdItemId;
import esi.evetech.net.responses.GetDogmaEffectsEffectId;
import esi.evetech.net.responses.GetFwLeaderboards;
import esi.evetech.net.responses.GetFwStats;
import esi.evetech.net.responses.GetFwSystems;
import esi.evetech.net.responses.GetFwWars;
import esi.evetech.net.responses.GetIncursions;
import esi.evetech.net.responses.GetIndustryFacilities;
import esi.evetech.net.responses.GetIndustrySystems;
import esi.evetech.net.responses.GetInsurancePrices;
import esi.evetech.net.responses.GetKillmailsKillmailIdKillmailHash;
import esi.evetech.net.responses.GetLoyaltyStoresCorporationIdOffers;
import esi.evetech.net.responses.GetMarketsGroupsMarketGroupId;
import esi.evetech.net.responses.GetMarketsPrices;
import esi.evetech.net.responses.GetMarketsRegionIdHistory;
import esi.evetech.net.responses.GetMarketsRegionIdOrders;
import esi.evetech.net.responses.GetOpportunitiesGroupsGroupId;
import esi.evetech.net.responses.GetOpportunitiesTasksTaskId;
import esi.evetech.net.responses.GetSearch;
import esi.evetech.net.responses.GetSovereigntyCampaigns;
import esi.evetech.net.responses.GetSovereigntyMap;
import esi.evetech.net.responses.GetSovereigntyStructures;
import esi.evetech.net.responses.GetStatus;
import esi.evetech.net.responses.GetUniverseAncestries;
import esi.evetech.net.responses.GetUniverseAsteroidBeltsAsteroidBeltId;
import esi.evetech.net.responses.GetUniverseBloodlines;
import esi.evetech.net.responses.GetUniverseCategoriesCategoryId;
import esi.evetech.net.responses.GetUniverseConstellationsConstellationId;
import esi.evetech.net.responses.GetUniverseFactions;
import esi.evetech.net.responses.GetUniverseGraphicsGraphicId;
import esi.evetech.net.responses.GetUniverseGroupsGroupId;
import esi.evetech.net.responses.GetUniverseMoonsMoonId;
import esi.evetech.net.responses.GetUniversePlanetsPlanetId;
import esi.evetech.net.responses.GetUniverseRaces;
import esi.evetech.net.responses.GetUniverseRegionsRegionId;
import esi.evetech.net.responses.GetUniverseSchematicsSchematicId;
import esi.evetech.net.responses.GetUniverseStargatesStargateId;
import esi.evetech.net.responses.GetUniverseStarsStarId;
import esi.evetech.net.responses.GetUniverseStationsStationId;
import esi.evetech.net.responses.GetUniverseSystemJumps;
import esi.evetech.net.responses.GetUniverseSystemKills;
import esi.evetech.net.responses.GetUniverseSystemsSystemId;
import esi.evetech.net.responses.GetUniverseTypesTypeId;
import esi.evetech.net.responses.GetWarsWarId;
import esi.evetech.net.responses.PostCharactersAffiliation;
import esi.evetech.net.responses.PostUniverseIds;
import esi.evetech.net.responses.PostUniverseNames;
import fr.lelouet.jswaggermaker.client.common.impl.securities.Disconnected;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;


/**
 * access esi.evetech.net with no authorization.
 */
public class Anonymous
    extends Disconnected
{
    public final Anonymous.Alliances alliances = new Anonymous.Alliances();
    /**
     * The server name you would like data from
     */
    public esi.evetech.net.structures.datasource datasource;
    public final Anonymous.Characters characters = new Anonymous.Characters();
    public final Anonymous.Contracts contracts = new Anonymous.Contracts();
    public final Anonymous.Corporations corporations = new Anonymous.Corporations();
    public final Anonymous.Dogma dogma = new Anonymous.Dogma();
    public final Anonymous.Fw fw = new Anonymous.Fw();
    public final Anonymous.Incursions incursions = new Anonymous.Incursions();
    public final Anonymous.Industry industry = new Anonymous.Industry();
    public final Anonymous.Insurance insurance = new Anonymous.Insurance();
    public final Anonymous.Killmails killmails = new Anonymous.Killmails();
    public final Anonymous.Loyalty loyalty = new Anonymous.Loyalty();
    public final Anonymous.Markets markets = new Anonymous.Markets();
    public final Anonymous.Opportunities opportunities = new Anonymous.Opportunities();
    public final Anonymous.Route route = new Anonymous.Route();
    public final Anonymous.Sovereignty sovereignty = new Anonymous.Sovereignty();
    public final Anonymous.Status status = new Anonymous.Status();
    public final Anonymous.Universe universe = new Anonymous.Universe();
    public final Anonymous.Wars wars = new Anonymous.Wars();
    public final Anonymous.Search search = new Anonymous.Search();

    public class Alliances {
        public final Anonymous.Alliances.Corporations corporations = new Anonymous.Alliances.Corporations();
        public final Anonymous.Alliances.Icons icons = new Anonymous.Alliances.Icons();

        /**
         * List all alliances
         * 
         * <p>
         * List all active player alliances<br />
         * This route is cached for up to 3600 seconds
         * </p>
         * 
         * @param datasource
         *     The server name you would like data from
         * @param If_None_Match
         *     ETag from a previous request. A 304 will be returned if this matches the current ETag
         */
        public Requested<int[]> get(String If_None_Match) {
            String url = ("https://esi.evetech.net/v1/alliances/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (If_None_Match!= null) {
                headerProperties.put("If-None-Match", (""+ If_None_Match));
            }
            return requestGet(url, headerProperties, int[].class);
        }

        /**
         * Get alliance information
         * 
         * <p>
         * Public information about an alliance<br />
         * This route is cached for up to 3600 seconds
         * </p>
         * 
         * @param alliance_id
         *     An EVE alliance ID
         * @param datasource
         *     The server name you would like data from
         * @param If_None_Match
         *     ETag from a previous request. A 304 will be returned if this matches the current ETag
         */
        public Requested<GetAlliancesAllianceId> getByAllianceid(int alliance_id, String If_None_Match) {
            String url = ("https://esi.evetech.net/v3/alliances/{alliance_id}/".replace("{alliance_id}", ""+alliance_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (If_None_Match!= null) {
                headerProperties.put("If-None-Match", (""+ If_None_Match));
            }
            return requestGet(url, headerProperties, GetAlliancesAllianceId.class);
        }

        public class Corporations {

            /**
             * List alliance's corporations
             * 
             * <p>
             * List all current member corporations of an alliance<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param alliance_id
             *     An EVE alliance ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<int[]> getByAllianceid(int alliance_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/alliances/{alliance_id}/corporations/".replace("{alliance_id}", ""+alliance_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, int[].class);
            }
        }

        public class Icons {

            /**
             * Get alliance icon
             * 
             * <p>
             * Get the icon urls for a alliance<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param alliance_id
             *     An EVE alliance ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetAlliancesAllianceIdIcons> getByAllianceid(int alliance_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/alliances/{alliance_id}/icons/".replace("{alliance_id}", ""+alliance_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetAlliancesAllianceIdIcons.class);
            }
        }
    }

    public class Characters {
        public final Anonymous.Characters.Affiliation affiliation = new Anonymous.Characters.Affiliation();
        public final Anonymous.Characters.Corporationhistory corporationhistory = new Anonymous.Characters.Corporationhistory();
        public final Anonymous.Characters.Portrait portrait = new Anonymous.Characters.Portrait();

        /**
         * Get character's public information
         * 
         * <p>
         * Public information about a character<br />
         * This route is cached for up to 3600 seconds
         * </p>
         * 
         * @param character_id
         *     An EVE character ID
         * @param datasource
         *     The server name you would like data from
         * @param If_None_Match
         *     ETag from a previous request. A 304 will be returned if this matches the current ETag
         */
        public Requested<GetCharactersCharacterId> getByCharacterid(int character_id, String If_None_Match) {
            String url = ("https://esi.evetech.net/v4/characters/{character_id}/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (If_None_Match!= null) {
                headerProperties.put("If-None-Match", (""+ If_None_Match));
            }
            return requestGet(url, headerProperties, GetCharactersCharacterId.class);
        }

        public class Affiliation {

            /**
             * Character affiliation
             * 
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
            public Requested<PostCharactersAffiliation[]> post(int[] characters) {
                String url = ("https://esi.evetech.net/v1/characters/affiliation/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                java.util.Map<String, Object> content = new HashMap<>();
                content.put("characters", characters);
                return requestPost(url, null, content, PostCharactersAffiliation[].class);
            }
        }

        public class Corporationhistory {

            /**
             * Get corporation history
             * 
             * <p>
             * Get a list of all the corporations a character has been a member of<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetCharactersCharacterIdCorporationhistory[]> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/characters/{character_id}/corporationhistory/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdCorporationhistory[].class);
            }
        }

        public class Portrait {

            /**
             * Get character portraits
             * 
             * <p>
             * Get portrait urls for a character<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param character_id
             *     An EVE character ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetCharactersCharacterIdPortrait> getByCharacterid(int character_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v2/characters/{character_id}/portrait/".replace("{character_id}", ""+character_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdPortrait.class);
            }
        }
    }

    public class Contracts {
        public final Anonymous.Contracts.Public public_ = new Anonymous.Contracts.Public();

        public class Public {
            public final Anonymous.Contracts.Public.Bids bids = new Anonymous.Contracts.Public.Bids();
            public final Anonymous.Contracts.Public.Items items = new Anonymous.Contracts.Public.Items();

            /**
             * Get public contracts
             * 
             * <p>
             * Returns a paginated list of all public contracts in the given region<br />
             * This route is cached for up to 1800 seconds
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param region_id
             *     An EVE region id
             */
            public Requested<GetContractsPublicRegionId[]> getByRegionid(String If_None_Match, Integer page, int region_id) {
                String url = ("https://esi.evetech.net/v1/contracts/public/{region_id}/".replace("{region_id}", ""+region_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetContractsPublicRegionId[].class);
            }

            public class Bids {

                /**
                 * Get public contract bids
                 * 
                 * <p>
                 * Lists bids on a public auction contract<br />
                 * This route is cached for up to 300 seconds
                 * </p>
                 * 
                 * @param contract_id
                 *     ID of a contract
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param page
                 *     Which page of results to return
                 */
                public Requested<GetContractsPublicBidsContractId[]> getByContractid(int contract_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v1/contracts/public/bids/{contract_id}/".replace("{contract_id}", ""+contract_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetContractsPublicBidsContractId[].class);
                }
            }

            public class Items {

                /**
                 * Get public contract items
                 * 
                 * <p>
                 * Lists items of a public contract<br />
                 * This route is cached for up to 3600 seconds
                 * </p>
                 * 
                 * @param contract_id
                 *     ID of a contract
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param page
                 *     Which page of results to return
                 */
                public Requested<GetContractsPublicItemsContractId[]> getByContractid(int contract_id, String If_None_Match, Integer page) {
                    String url = ("https://esi.evetech.net/v1/contracts/public/items/{contract_id}/".replace("{contract_id}", ""+contract_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetContractsPublicItemsContractId[].class);
                }
            }
        }
    }

    public class Corporations {
        public final Anonymous.Corporations.Npccorps npccorps = new Anonymous.Corporations.Npccorps();
        public final Anonymous.Corporations.Icons icons = new Anonymous.Corporations.Icons();
        public final Anonymous.Corporations.Alliancehistory alliancehistory = new Anonymous.Corporations.Alliancehistory();

        /**
         * Get corporation information
         * 
         * <p>
         * Public information about a corporation<br />
         * This route is cached for up to 3600 seconds
         * </p>
         * 
         * @param corporation_id
         *     An EVE corporation ID
         * @param datasource
         *     The server name you would like data from
         * @param If_None_Match
         *     ETag from a previous request. A 304 will be returned if this matches the current ETag
         */
        public Requested<GetCorporationsCorporationId> getByCorporationid(int corporation_id, String If_None_Match) {
            String url = ("https://esi.evetech.net/v4/corporations/{corporation_id}/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (If_None_Match!= null) {
                headerProperties.put("If-None-Match", (""+ If_None_Match));
            }
            return requestGet(url, headerProperties, GetCorporationsCorporationId.class);
        }

        public class Alliancehistory {

            /**
             * Get alliance history
             * 
             * <p>
             * Get a list of all the alliances a corporation has been a member of<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetCorporationsCorporationIdAlliancehistory[]> getByCorporationid(int corporation_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v2/corporations/{corporation_id}/alliancehistory/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdAlliancehistory[].class);
            }
        }

        public class Icons {

            /**
             * Get corporation icon
             * 
             * <p>
             * Get the icon urls for a corporation<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param corporation_id
             *     An EVE corporation ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetCorporationsCorporationIdIcons> getByCorporationid(int corporation_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/icons/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCorporationsCorporationIdIcons.class);
            }
        }

        public class Npccorps {

            /**
             * Get npc corporations
             * 
             * <p>
             * Get a list of npc corporations<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<int[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/corporations/npccorps/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, int[].class);
            }
        }
    }

    public class Dogma {
        public final Anonymous.Dogma.Attributes attributes = new Anonymous.Dogma.Attributes();
        public final Anonymous.Dogma.Dynamic dynamic = new Anonymous.Dogma.Dynamic();
        public final Anonymous.Dogma.Effects effects = new Anonymous.Dogma.Effects();

        public class Attributes {

            /**
             * Get attributes
             * 
             * <p>
             * Get a list of dogma attribute ids<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<int[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/dogma/attributes/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, int[].class);
            }

            /**
             * Get attribute information
             * 
             * <p>
             * Get information on a dogma attribute<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param attribute_id
             *     A dogma attribute ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetDogmaAttributesAttributeId> getByAttributeid(int attribute_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/dogma/attributes/{attribute_id}/".replace("{attribute_id}", ""+attribute_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetDogmaAttributesAttributeId.class);
            }
        }

        public class Dynamic {
            public final Anonymous.Dogma.Dynamic.Items items = new Anonymous.Dogma.Dynamic.Items();

            public class Items {

                /**
                 * Get dynamic item information
                 * 
                 * <p>
                 * Returns info about a dynamic item resulting from mutation with a mutaplasmid.<br />
                 * This route expires daily at 11:05
                 * </p>
                 * 
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 * @param item_id
                 *     item_id integer
                 * @param type_id
                 *     type_id integer
                 */
                public Requested<GetDogmaDynamicItemsTypeIdItemId> getByTypeidItemid(String If_None_Match, long item_id, int type_id) {
                    String url = ("https://esi.evetech.net/v1/dogma/dynamic/items/{type_id}/{item_id}/".replace("{item_id}", ""+item_id).replace("{type_id}", ""+type_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetDogmaDynamicItemsTypeIdItemId.class);
                }
            }
        }

        public class Effects {

            /**
             * Get effects
             * 
             * <p>
             * Get a list of dogma effect ids<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<int[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/dogma/effects/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, int[].class);
            }

            /**
             * Get effect information
             * 
             * <p>
             * Get information on a dogma effect<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param effect_id
             *     A dogma effect ID
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetDogmaEffectsEffectId> getByEffectid(int effect_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v2/dogma/effects/{effect_id}/".replace("{effect_id}", ""+effect_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetDogmaEffectsEffectId.class);
            }
        }
    }

    public class Fw {
        public final Anonymous.Fw.Leaderboards leaderboards = new Anonymous.Fw.Leaderboards();
        public final Anonymous.Fw.Stats stats = new Anonymous.Fw.Stats();
        public final Anonymous.Fw.Wars wars = new Anonymous.Fw.Wars();
        public final Anonymous.Fw.Systems systems = new Anonymous.Fw.Systems();

        public class Leaderboards {
            public final Anonymous.Fw.Leaderboards.Characters characters = new Anonymous.Fw.Leaderboards.Characters();
            public final Anonymous.Fw.Leaderboards.Corporations corporations = new Anonymous.Fw.Leaderboards.Corporations();

            /**
             * List of the top factions in faction warfare
             * 
             * <p>
             * Top 4 leaderboard of factions for kills and victory points separated by total, last week and yesterday<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetFwLeaderboards> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/fw/leaderboards/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetFwLeaderboards.class);
            }

            public class Characters {

                /**
                 * List of the top pilots in faction warfare
                 * 
                 * <p>
                 * Top 100 leaderboard of pilots for kills and victory points separated by total, last week and yesterday<br />
                 * This route expires daily at 11:05
                 * </p>
                 * 
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 */
                public Requested<GetFwLeaderboards> get(String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/fw/leaderboards/characters/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetFwLeaderboards.class);
                }
            }

            public class Corporations {

                /**
                 * List of the top corporations in faction warfare
                 * 
                 * <p>
                 * Top 10 leaderboard of corporations for kills and victory points separated by total, last week and yesterday<br />
                 * This route expires daily at 11:05
                 * </p>
                 * 
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 */
                public Requested<GetFwLeaderboards> get(String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/fw/leaderboards/corporations/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetFwLeaderboards.class);
                }
            }
        }

        public class Stats {

            /**
             * An overview of statistics about factions involved in faction warfare
             * 
             * <p>
             * Statistical overviews of factions involved in faction warfare<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetFwStats[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/fw/stats/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetFwStats[].class);
            }
        }

        public class Systems {

            /**
             * Ownership of faction warfare systems
             * 
             * <p>
             * An overview of the current ownership of faction warfare solar systems<br />
             * This route is cached for up to 1800 seconds
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetFwSystems[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v2/fw/systems/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetFwSystems[].class);
            }
        }

        public class Wars {

            /**
             * Data about which NPC factions are at war
             * 
             * <p>
             * Data about which NPC factions are at war<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetFwWars[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/fw/wars/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetFwWars[].class);
            }
        }
    }

    public class Incursions {

        /**
         * List incursions
         * 
         * <p>
         * Return a list of current incursions<br />
         * This route is cached for up to 300 seconds
         * </p>
         * 
         * @param datasource
         *     The server name you would like data from
         * @param If_None_Match
         *     ETag from a previous request. A 304 will be returned if this matches the current ETag
         */
        public Requested<GetIncursions[]> get(String If_None_Match) {
            String url = ("https://esi.evetech.net/v1/incursions/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (If_None_Match!= null) {
                headerProperties.put("If-None-Match", (""+ If_None_Match));
            }
            return requestGet(url, headerProperties, GetIncursions[].class);
        }
    }

    public class Industry {
        public final Anonymous.Industry.Facilities facilities = new Anonymous.Industry.Facilities();
        public final Anonymous.Industry.Systems systems = new Anonymous.Industry.Systems();

        public class Facilities {

            /**
             * List industry facilities
             * 
             * <p>
             * Return a list of industry facilities<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetIndustryFacilities[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/industry/facilities/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetIndustryFacilities[].class);
            }
        }

        public class Systems {

            /**
             * List solar system cost indices
             * 
             * <p>
             * Return cost indices for solar systems<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetIndustrySystems[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/industry/systems/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetIndustrySystems[].class);
            }
        }
    }

    public class Insurance {
        public final Anonymous.Insurance.Prices prices = new Anonymous.Insurance.Prices();

        public class Prices {

            /**
             * List insurance levels
             * 
             * <p>
             * Return available insurance levels for all ship types<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param Accept_Language
             *     Language to use in the response
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param language
             *     Language to use in the response, takes precedence over Accept-Language
             */
            public Requested<GetInsurancePrices[]> get(esi.evetech.net.structures.Accept_Language Accept_Language, String If_None_Match, esi.evetech.net.structures.language language) {
                String url = ("https://esi.evetech.net/v1/insurance/prices/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                if (Accept_Language!= null) {
                    headerProperties.put("Accept-Language", (""+ Accept_Language));
                }
                return requestGet(url, headerProperties, GetInsurancePrices[].class);
            }
        }
    }

    public class Killmails {

        /**
         * Get a single killmail
         * 
         * <p>
         * Return a single killmail from its ID and hash<br />
         * This route is cached for up to 1209600 seconds
         * </p>
         * 
         * @param datasource
         *     The server name you would like data from
         * @param If_None_Match
         *     ETag from a previous request. A 304 will be returned if this matches the current ETag
         * @param killmail_hash
         *     The killmail hash for verification
         * @param killmail_id
         *     The killmail ID to be queried
         */
        public Requested<GetKillmailsKillmailIdKillmailHash> getByKillmailidKillmailhash(String If_None_Match, String killmail_hash, int killmail_id) {
            String url = ("https://esi.evetech.net/v1/killmails/{killmail_id}/{killmail_hash}/".replace("{killmail_hash}", ""+killmail_hash).replace("{killmail_id}", ""+killmail_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (If_None_Match!= null) {
                headerProperties.put("If-None-Match", (""+ If_None_Match));
            }
            return requestGet(url, headerProperties, GetKillmailsKillmailIdKillmailHash.class);
        }
    }

    public class Loyalty {
        public final Anonymous.Loyalty.Stores stores = new Anonymous.Loyalty.Stores();

        public class Stores {
            public final Anonymous.Loyalty.Stores.Offers offers = new Anonymous.Loyalty.Stores.Offers();

            public class Offers {

                /**
                 * List loyalty store offers
                 * 
                 * <p>
                 * Return a list of offers from a specific corporation's loyalty store<br />
                 * This route expires daily at 11:05
                 * </p>
                 * 
                 * @param corporation_id
                 *     An EVE corporation ID
                 * @param datasource
                 *     The server name you would like data from
                 * @param If_None_Match
                 *     ETag from a previous request. A 304 will be returned if this matches the current ETag
                 */
                public Requested<GetLoyaltyStoresCorporationIdOffers[]> getByCorporationid(int corporation_id, String If_None_Match) {
                    String url = ("https://esi.evetech.net/v1/loyalty/stores/{corporation_id}/offers/".replace("{corporation_id}", ""+corporation_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                    HashMap<String, String> headerProperties = new HashMap<String, String>();
                    if (If_None_Match!= null) {
                        headerProperties.put("If-None-Match", (""+ If_None_Match));
                    }
                    return requestGet(url, headerProperties, GetLoyaltyStoresCorporationIdOffers[].class);
                }
            }
        }
    }

    public class Markets {
        public final Anonymous.Markets.Groups groups = new Anonymous.Markets.Groups();
        public final Anonymous.Markets.Prices prices = new Anonymous.Markets.Prices();
        public final Anonymous.Markets.History history = new Anonymous.Markets.History();
        public final Anonymous.Markets.Orders orders = new Anonymous.Markets.Orders();
        public final Anonymous.Markets.Types types = new Anonymous.Markets.Types();

        public class Groups {

            /**
             * Get item groups
             * 
             * <p>
             * Get a list of item groups<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<int[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/markets/groups/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, int[].class);
            }

            /**
             * Get item group information
             * 
             * <p>
             * Get information on an item group<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param Accept_Language
             *     Language to use in the response
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param language
             *     Language to use in the response, takes precedence over Accept-Language
             * @param market_group_id
             *     An Eve item group ID
             */
            public Requested<GetMarketsGroupsMarketGroupId> getByMarketgroupid(esi.evetech.net.structures.Accept_Language Accept_Language,
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
                return requestGet(url, headerProperties, GetMarketsGroupsMarketGroupId.class);
            }
        }

        public class History {

            /**
             * List historical market statistics in a region
             * 
             * <p>
             * Return a list of historical market statistics for the specified type in a region<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param region_id
             *     Return statistics in this region
             * @param type_id
             *     Return statistics for this type
             */
            public Requested<GetMarketsRegionIdHistory[]> getByRegionid(String If_None_Match, int region_id, int type_id) {
                String url = ("https://esi.evetech.net/v1/markets/{region_id}/history/".replace("{region_id}", ""+region_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+"&type_id="+flatten(type_id));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetMarketsRegionIdHistory[].class);
            }
        }

        public class Orders {

            /**
             * List orders in a region
             * 
             * <p>
             * Return a list of orders in a region<br />
             * This route is cached for up to 300 seconds
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
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
            public Requested<GetMarketsRegionIdOrders[]> getByRegionid(String If_None_Match,
                esi.evetech.net.structures.order_type order_type,
                Integer page,
                int region_id,
                Integer type_id) {
                String url = ("https://esi.evetech.net/v1/markets/{region_id}/orders/".replace("{region_id}", ""+region_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(order_type==null?"":"&order_type="+flatten(order_type))+(page==null?"":"&page="+flatten(page))+(type_id==null?"":"&type_id="+flatten(type_id)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetMarketsRegionIdOrders[].class);
            }
        }

        public class Prices {

            /**
             * List market prices
             * 
             * <p>
             * Return a list of prices<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetMarketsPrices[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/markets/prices/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetMarketsPrices[].class);
            }
        }

        public class Types {

            /**
             * List type IDs relevant to a market
             * 
             * <p>
             * Return a list of type IDs that have active orders in the region, for efficient market indexing.<br />
             * This route is cached for up to 600 seconds
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param region_id
             *     Return statistics in this region
             */
            public Requested<int[]> getByRegionid(String If_None_Match, Integer page, int region_id) {
                String url = ("https://esi.evetech.net/v1/markets/{region_id}/types/".replace("{region_id}", ""+region_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, int[].class);
            }
        }
    }

    public class Opportunities {
        public final Anonymous.Opportunities.Groups groups = new Anonymous.Opportunities.Groups();
        public final Anonymous.Opportunities.Tasks tasks = new Anonymous.Opportunities.Tasks();

        public class Groups {

            /**
             * Get opportunities groups
             * 
             * <p>
             * Return a list of opportunities groups<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<int[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/opportunities/groups/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, int[].class);
            }

            /**
             * Get opportunities group
             * 
             * <p>
             * Return information of an opportunities group<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param Accept_Language
             *     Language to use in the response
             * @param datasource
             *     The server name you would like data from
             * @param group_id
             *     ID of an opportunities group
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param language
             *     Language to use in the response, takes precedence over Accept-Language
             */
            public Requested<GetOpportunitiesGroupsGroupId> getByGroupid(esi.evetech.net.structures.Accept_Language Accept_Language,
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
                return requestGet(url, headerProperties, GetOpportunitiesGroupsGroupId.class);
            }
        }

        public class Tasks {

            /**
             * Get opportunities tasks
             * 
             * <p>
             * Return a list of opportunities tasks<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<int[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/opportunities/tasks/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, int[].class);
            }

            /**
             * Get opportunities task
             * 
             * <p>
             * Return information of an opportunities task<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param task_id
             *     ID of an opportunities task
             */
            public Requested<GetOpportunitiesTasksTaskId> getByTaskid(String If_None_Match, int task_id) {
                String url = ("https://esi.evetech.net/v1/opportunities/tasks/{task_id}/".replace("{task_id}", ""+task_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetOpportunitiesTasksTaskId.class);
            }
        }
    }

    public class Route {

        /**
         * Get route
         * 
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
         * @param If_None_Match
         *     ETag from a previous request. A 304 will be returned if this matches the current ETag
         * @param origin
         *     origin solar system ID
         */
        public Requested<int[]> getByOriginDestination(int[] avoid,
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
            return requestGet(url, headerProperties, int[].class);
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
         */
        public Requested<GetSearch> get(esi.evetech.net.structures.Accept_Language Accept_Language,
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
            return requestGet(url, headerProperties, GetSearch.class);
        }
    }

    public class Sovereignty {
        public final Anonymous.Sovereignty.Campaigns campaigns = new Anonymous.Sovereignty.Campaigns();
        public final Anonymous.Sovereignty.Map map = new Anonymous.Sovereignty.Map();
        public final Anonymous.Sovereignty.Structures structures = new Anonymous.Sovereignty.Structures();

        public class Campaigns {

            /**
             * List sovereignty campaigns
             * 
             * <p>
             * Shows sovereignty data for campaigns.<br />
             * This route is cached for up to 5 seconds
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetSovereigntyCampaigns[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/sovereignty/campaigns/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetSovereigntyCampaigns[].class);
            }
        }

        public class Map {

            /**
             * List sovereignty of systems
             * 
             * <p>
             * Shows sovereignty information for solar systems<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetSovereigntyMap[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/sovereignty/map/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetSovereigntyMap[].class);
            }
        }

        public class Structures {

            /**
             * List sovereignty structures
             * 
             * <p>
             * Shows sovereignty data for structures.<br />
             * This route is cached for up to 120 seconds
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetSovereigntyStructures[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/sovereignty/structures/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetSovereigntyStructures[].class);
            }
        }
    }

    public class Status {

        /**
         * Retrieve the uptime and player counts
         * 
         * <p>
         * EVE Server status<br />
         * This route is cached for up to 30 seconds
         * </p>
         * 
         * @param datasource
         *     The server name you would like data from
         * @param If_None_Match
         *     ETag from a previous request. A 304 will be returned if this matches the current ETag
         */
        public Requested<GetStatus> get(String If_None_Match) {
            String url = ("https://esi.evetech.net/v1/status/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (If_None_Match!= null) {
                headerProperties.put("If-None-Match", (""+ If_None_Match));
            }
            return requestGet(url, headerProperties, GetStatus.class);
        }
    }

    public class Universe {
        public final Anonymous.Universe.Ancestries ancestries = new Anonymous.Universe.Ancestries();
        public final Anonymous.Universe.Asteroidbelts asteroidbelts = new Anonymous.Universe.Asteroidbelts();
        public final Anonymous.Universe.Bloodlines bloodlines = new Anonymous.Universe.Bloodlines();
        public final Anonymous.Universe.Categories categories = new Anonymous.Universe.Categories();
        public final Anonymous.Universe.Constellations constellations = new Anonymous.Universe.Constellations();
        public final Anonymous.Universe.Graphics graphics = new Anonymous.Universe.Graphics();
        public final Anonymous.Universe.Groups groups = new Anonymous.Universe.Groups();
        public final Anonymous.Universe.Ids ids = new Anonymous.Universe.Ids();
        public final Anonymous.Universe.Moons moons = new Anonymous.Universe.Moons();
        public final Anonymous.Universe.Planets planets = new Anonymous.Universe.Planets();
        public final Anonymous.Universe.Races races = new Anonymous.Universe.Races();
        public final Anonymous.Universe.Regions regions = new Anonymous.Universe.Regions();
        public final Anonymous.Universe.Schematics schematics = new Anonymous.Universe.Schematics();
        public final Anonymous.Universe.Stargates stargates = new Anonymous.Universe.Stargates();
        public final Anonymous.Universe.Stars stars = new Anonymous.Universe.Stars();
        public final Anonymous.Universe.Structures structures = new Anonymous.Universe.Structures();
        public final Anonymous.Universe.Systemjumps systemjumps = new Anonymous.Universe.Systemjumps();
        public final Anonymous.Universe.Systems systems = new Anonymous.Universe.Systems();
        public final Anonymous.Universe.Types types = new Anonymous.Universe.Types();
        public final Anonymous.Universe.Factions factions = new Anonymous.Universe.Factions();
        public final Anonymous.Universe.Stations stations = new Anonymous.Universe.Stations();
        public final Anonymous.Universe.Systemkills systemkills = new Anonymous.Universe.Systemkills();
        public final Anonymous.Universe.Names names = new Anonymous.Universe.Names();

        public class Ancestries {

            /**
             * Get ancestries
             * 
             * <p>
             * Get all character ancestries<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param Accept_Language
             *     Language to use in the response
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param language
             *     Language to use in the response, takes precedence over Accept-Language
             */
            public Requested<GetUniverseAncestries[]> get(esi.evetech.net.structures.Accept_Language Accept_Language, String If_None_Match, esi.evetech.net.structures.language language) {
                String url = ("https://esi.evetech.net/v1/universe/ancestries/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                if (Accept_Language!= null) {
                    headerProperties.put("Accept-Language", (""+ Accept_Language));
                }
                return requestGet(url, headerProperties, GetUniverseAncestries[].class);
            }
        }

        public class Asteroidbelts {

            /**
             * Get asteroid belt information
             * 
             * <p>
             * Get information on an asteroid belt<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param asteroid_belt_id
             *     asteroid_belt_id integer
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetUniverseAsteroidBeltsAsteroidBeltId> getByAsteroidbeltid(int asteroid_belt_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/universe/asteroid_belts/{asteroid_belt_id}/".replace("{asteroid_belt_id}", ""+asteroid_belt_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetUniverseAsteroidBeltsAsteroidBeltId.class);
            }
        }

        public class Bloodlines {

            /**
             * Get bloodlines
             * 
             * <p>
             * Get a list of bloodlines<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param Accept_Language
             *     Language to use in the response
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param language
             *     Language to use in the response, takes precedence over Accept-Language
             */
            public Requested<GetUniverseBloodlines[]> get(esi.evetech.net.structures.Accept_Language Accept_Language, String If_None_Match, esi.evetech.net.structures.language language) {
                String url = ("https://esi.evetech.net/v1/universe/bloodlines/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                if (Accept_Language!= null) {
                    headerProperties.put("Accept-Language", (""+ Accept_Language));
                }
                return requestGet(url, headerProperties, GetUniverseBloodlines[].class);
            }
        }

        public class Categories {

            /**
             * Get item categories
             * 
             * <p>
             * Get a list of item categories<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<int[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/universe/categories/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, int[].class);
            }

            /**
             * Get item category information
             * 
             * <p>
             * Get information of an item category<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param Accept_Language
             *     Language to use in the response
             * @param category_id
             *     An Eve item category ID
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param language
             *     Language to use in the response, takes precedence over Accept-Language
             */
            public Requested<GetUniverseCategoriesCategoryId> getByCategoryid(esi.evetech.net.structures.Accept_Language Accept_Language,
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
                return requestGet(url, headerProperties, GetUniverseCategoriesCategoryId.class);
            }
        }

        public class Constellations {

            /**
             * Get constellations
             * 
             * <p>
             * Get a list of constellations<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<int[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/universe/constellations/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, int[].class);
            }

            /**
             * Get constellation information
             * 
             * <p>
             * Get information on a constellation<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param Accept_Language
             *     Language to use in the response
             * @param constellation_id
             *     constellation_id integer
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param language
             *     Language to use in the response, takes precedence over Accept-Language
             */
            public Requested<GetUniverseConstellationsConstellationId> getByConstellationid(esi.evetech.net.structures.Accept_Language Accept_Language,
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
                return requestGet(url, headerProperties, GetUniverseConstellationsConstellationId.class);
            }
        }

        public class Factions {

            /**
             * Get factions
             * 
             * <p>
             * Get a list of factions<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param Accept_Language
             *     Language to use in the response
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param language
             *     Language to use in the response, takes precedence over Accept-Language
             */
            public Requested<GetUniverseFactions[]> get(esi.evetech.net.structures.Accept_Language Accept_Language, String If_None_Match, esi.evetech.net.structures.language language) {
                String url = ("https://esi.evetech.net/v2/universe/factions/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                if (Accept_Language!= null) {
                    headerProperties.put("Accept-Language", (""+ Accept_Language));
                }
                return requestGet(url, headerProperties, GetUniverseFactions[].class);
            }
        }

        public class Graphics {

            /**
             * Get graphics
             * 
             * <p>
             * Get a list of graphics<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<int[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/universe/graphics/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, int[].class);
            }

            /**
             * Get graphic information
             * 
             * <p>
             * Get information on a graphic<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param graphic_id
             *     graphic_id integer
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetUniverseGraphicsGraphicId> getByGraphicid(int graphic_id, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/universe/graphics/{graphic_id}/".replace("{graphic_id}", ""+graphic_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetUniverseGraphicsGraphicId.class);
            }
        }

        public class Groups {

            /**
             * Get item groups
             * 
             * <p>
             * Get a list of item groups<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             */
            public Requested<int[]> get(String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/universe/groups/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, int[].class);
            }

            /**
             * Get item group information
             * 
             * <p>
             * Get information on an item group<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param Accept_Language
             *     Language to use in the response
             * @param datasource
             *     The server name you would like data from
             * @param group_id
             *     An Eve item group ID
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param language
             *     Language to use in the response, takes precedence over Accept-Language
             */
            public Requested<GetUniverseGroupsGroupId> getByGroupid(esi.evetech.net.structures.Accept_Language Accept_Language,
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
                return requestGet(url, headerProperties, GetUniverseGroupsGroupId.class);
            }
        }

        public class Ids {

            /**
             * Bulk names to IDs
             * 
             * <p>
             * Resolve a set of names to IDs in the following categories: agents, alliances, characters, constellations, corporations factions, inventory_types, regions, stations, and systems. Only exact matches will be returned. All names searched for are cached for 12 hours
             * </p>
             * 
             * @param Accept_Language
             *     Language to use in the response
             * @param datasource
             *     The server name you would like data from
             * @param language
             *     Language to use in the response, takes precedence over Accept-Language
             * @param names
             *     The names to resolve
             */
            public Requested<PostUniverseIds> post(esi.evetech.net.structures.Accept_Language Accept_Language, esi.evetech.net.structures.language language, String[] names) {
                String url = ("https://esi.evetech.net/v1/universe/ids/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (Accept_Language!= null) {
                    headerProperties.put("Accept-Language", (""+ Accept_Language));
                }
                java.util.Map<String, Object> content = new HashMap<>();
                content.put("names", names);
                return requestPost(url, headerProperties, content, PostUniverseIds.class);
            }
        }

        public class Moons {

            /**
             * Get moon information
             * 
             * <p>
             * Get information on a moon<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param moon_id
             *     moon_id integer
             */
            public Requested<GetUniverseMoonsMoonId> getByMoonid(String If_None_Match, int moon_id) {
                String url = ("https://esi.evetech.net/v1/universe/moons/{moon_id}/".replace("{moon_id}", ""+moon_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetUniverseMoonsMoonId.class);
            }
        }

        public class Names {

            /**
             * Get names and categories for a set of IDs
             * 
             * <p>
             * Resolve a set of IDs to names and categories. Supported ID's for resolving are: Characters, Corporations, Alliances, Stations, Solar Systems, Constellations, Regions, Types, Factions
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param ids
             *     The ids to resolve
             */
            public Requested<PostUniverseNames[]> post(int[] ids) {
                String url = ("https://esi.evetech.net/v3/universe/names/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                java.util.Map<String, Object> content = new HashMap<>();
                content.put("ids", ids);
                return requestPost(url, null, content, PostUniverseNames[].class);
            }
        }

        public class Planets {

            /**
             * Get planet information
             * 
             * <p>
             * Get information on a planet<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param planet_id
             *     planet_id integer
             */
            public Requested<GetUniversePlanetsPlanetId> getByPlanetid(String If_None_Match, int planet_id) {
                String url = ("https://esi.evetech.net/v1/universe/planets/{planet_id}/".replace("{planet_id}", ""+planet_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetUniversePlanetsPlanetId.class);
            }
        }

        public class Races {

            /**
             * Get character races
             * 
             * <p>
             * Get a list of character races<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param Accept_Language
             *     Language to use in the response
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param language
             *     Language to use in the response, takes precedence over Accept-Language
             */
            public Requested<GetUniverseRaces[]> get(esi.evetech.net.structures.Accept_Language Accept_Language, String If_None_Match, esi.evetech.net.structures.language language) {
                String url = ("https://esi.evetech.net/v1/universe/races/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(language==null?"":"&language="+flatten(language)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                if (Accept_Language!= null) {
                    headerProperties.put("Accept-Language", (""+ Accept_Language));
                }
                return requestGet(url, headerProperties, GetUniverseRaces[].class);
            }
        }

        public class Regions {

            /**
             * Get regions
             * 
             * <p>
             * Get a list of regions<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<int[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/universe/regions/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, int[].class);
            }

            /**
             * Get region information
             * 
             * <p>
             * Get information on a region<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param Accept_Language
             *     Language to use in the response
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param language
             *     Language to use in the response, takes precedence over Accept-Language
             * @param region_id
             *     region_id integer
             */
            public Requested<GetUniverseRegionsRegionId> getByRegionid(esi.evetech.net.structures.Accept_Language Accept_Language,
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
                return requestGet(url, headerProperties, GetUniverseRegionsRegionId.class);
            }
        }

        public class Schematics {

            /**
             * Get schematic information
             * 
             * <p>
             * Get information on a planetary factory schematic<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param schematic_id
             *     A PI schematic ID
             */
            public Requested<GetUniverseSchematicsSchematicId> getBySchematicid(String If_None_Match, int schematic_id) {
                String url = ("https://esi.evetech.net/v1/universe/schematics/{schematic_id}/".replace("{schematic_id}", ""+schematic_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetUniverseSchematicsSchematicId.class);
            }
        }

        public class Stargates {

            /**
             * Get stargate information
             * 
             * <p>
             * Get information on a stargate<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param stargate_id
             *     stargate_id integer
             */
            public Requested<GetUniverseStargatesStargateId> getByStargateid(String If_None_Match, int stargate_id) {
                String url = ("https://esi.evetech.net/v1/universe/stargates/{stargate_id}/".replace("{stargate_id}", ""+stargate_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetUniverseStargatesStargateId.class);
            }
        }

        public class Stars {

            /**
             * Get star information
             * 
             * <p>
             * Get information on a star<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param star_id
             *     star_id integer
             */
            public Requested<GetUniverseStarsStarId> getByStarid(String If_None_Match, int star_id) {
                String url = ("https://esi.evetech.net/v1/universe/stars/{star_id}/".replace("{star_id}", ""+star_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetUniverseStarsStarId.class);
            }
        }

        public class Stations {

            /**
             * Get station information
             * 
             * <p>
             * Get information on a station<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param station_id
             *     station_id integer
             */
            public Requested<GetUniverseStationsStationId> getByStationid(String If_None_Match, int station_id) {
                String url = ("https://esi.evetech.net/v2/universe/stations/{station_id}/".replace("{station_id}", ""+station_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetUniverseStationsStationId.class);
            }
        }

        public class Structures {

            /**
             * List all public structures
             * 
             * <p>
             * List all public structures<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param filter
             *     Only list public structures that have this service online
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<long[]> get(esi.evetech.net.structures.filter filter, String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/universe/structures/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(filter==null?"":"&filter="+flatten(filter)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, long[].class);
            }
        }

        public class Systemjumps {

            /**
             * Get system jumps
             * 
             * <p>
             * Get the number of jumps in solar systems within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with jumps will be listed<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetUniverseSystemJumps[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/universe/system_jumps/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetUniverseSystemJumps[].class);
            }
        }

        public class Systemkills {

            /**
             * Get system kills
             * 
             * <p>
             * Get the number of ship, pod and NPC kills per solar system within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with kills will be listed<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<GetUniverseSystemKills[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v2/universe/system_kills/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetUniverseSystemKills[].class);
            }
        }

        public class Systems {

            /**
             * Get solar systems
             * 
             * <p>
             * Get a list of solar systems<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             */
            public Requested<int[]> get(String If_None_Match) {
                String url = ("https://esi.evetech.net/v1/universe/systems/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, int[].class);
            }

            /**
             * Get solar system information
             * 
             * <p>
             * Get information on a solar system.<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param Accept_Language
             *     Language to use in the response
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param language
             *     Language to use in the response, takes precedence over Accept-Language
             * @param system_id
             *     system_id integer
             */
            public Requested<GetUniverseSystemsSystemId> getBySystemid(esi.evetech.net.structures.Accept_Language Accept_Language,
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
                return requestGet(url, headerProperties, GetUniverseSystemsSystemId.class);
            }
        }

        public class Types {

            /**
             * Get types
             * 
             * <p>
             * Get a list of type ids<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             */
            public Requested<int[]> get(String If_None_Match, Integer page) {
                String url = ("https://esi.evetech.net/v1/universe/types/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, int[].class);
            }

            /**
             * Get type information
             * 
             * <p>
             * Get information on a type<br />
             * This route expires daily at 11:05
             * </p>
             * 
             * @param Accept_Language
             *     Language to use in the response
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param language
             *     Language to use in the response, takes precedence over Accept-Language
             * @param type_id
             *     An Eve item type ID
             */
            public Requested<GetUniverseTypesTypeId> getByTypeid(esi.evetech.net.structures.Accept_Language Accept_Language,
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
                return requestGet(url, headerProperties, GetUniverseTypesTypeId.class);
            }
        }
    }

    public class Wars {
        public final Anonymous.Wars.Killmails killmails = new Anonymous.Wars.Killmails();

        /**
         * List wars
         * 
         * <p>
         * Return a list of wars<br />
         * This route is cached for up to 3600 seconds
         * </p>
         * 
         * @param datasource
         *     The server name you would like data from
         * @param If_None_Match
         *     ETag from a previous request. A 304 will be returned if this matches the current ETag
         * @param max_war_id
         *     Only return wars with ID smaller than this
         */
        public Requested<int[]> get(String If_None_Match, Integer max_war_id) {
            String url = ("https://esi.evetech.net/v1/wars/"+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(max_war_id==null?"":"&max_war_id="+flatten(max_war_id)));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (If_None_Match!= null) {
                headerProperties.put("If-None-Match", (""+ If_None_Match));
            }
            return requestGet(url, headerProperties, int[].class);
        }

        /**
         * Get war information
         * 
         * <p>
         * Return details about a war<br />
         * This route is cached for up to 3600 seconds
         * </p>
         * 
         * @param datasource
         *     The server name you would like data from
         * @param If_None_Match
         *     ETag from a previous request. A 304 will be returned if this matches the current ETag
         * @param war_id
         *     ID for a war
         */
        public Requested<GetWarsWarId> getByWarid(String If_None_Match, int war_id) {
            String url = ("https://esi.evetech.net/v1/wars/{war_id}/".replace("{war_id}", ""+war_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource)));
            HashMap<String, String> headerProperties = new HashMap<String, String>();
            if (If_None_Match!= null) {
                headerProperties.put("If-None-Match", (""+ If_None_Match));
            }
            return requestGet(url, headerProperties, GetWarsWarId.class);
        }

        public class Killmails {

            /**
             * List kills for a war
             * 
             * <p>
             * Return a list of kills related to a war<br />
             * This route is cached for up to 3600 seconds
             * </p>
             * 
             * @param datasource
             *     The server name you would like data from
             * @param If_None_Match
             *     ETag from a previous request. A 304 will be returned if this matches the current ETag
             * @param page
             *     Which page of results to return
             * @param war_id
             *     A valid war ID
             */
            public Requested<GetCharactersCharacterIdKillmailsRecent[]> getByWarid(String If_None_Match, Integer page, int war_id) {
                String url = ("https://esi.evetech.net/v1/wars/{war_id}/killmails/".replace("{war_id}", ""+war_id)+"?"+(datasource==null?"":"&datasource="+flatten(datasource))+(page==null?"":"&page="+flatten(page)));
                HashMap<String, String> headerProperties = new HashMap<String, String>();
                if (If_None_Match!= null) {
                    headerProperties.put("If-None-Match", (""+ If_None_Match));
                }
                return requestGet(url, headerProperties, GetCharactersCharacterIdKillmailsRecent[].class);
            }
        }
    }
}
