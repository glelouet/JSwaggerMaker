package wft_geo_db.p.mashape.com;

import fr.lelouet.jswaggermaker.client.common.impl.securities.APIKey;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import io.swagger.models.auth.In;
import wft_geo_db.p.mashape.com.definitions.CountriesResponse;
import wft_geo_db.p.mashape.com.definitions.CountryResponse;
import wft_geo_db.p.mashape.com.definitions.CurrenciesResponse;
import wft_geo_db.p.mashape.com.definitions.DateTimeResponse;
import wft_geo_db.p.mashape.com.definitions.DistanceResponse;
import wft_geo_db.p.mashape.com.definitions.LanguagesResponse;
import wft_geo_db.p.mashape.com.definitions.LocalesResponse;
import wft_geo_db.p.mashape.com.definitions.PopulatedPlaceResponse;
import wft_geo_db.p.mashape.com.definitions.PopulatedPlacesResponse;
import wft_geo_db.p.mashape.com.definitions.RegionResponse;
import wft_geo_db.p.mashape.com.definitions.RegionsResponse;
import wft_geo_db.p.mashape.com.definitions.TimeResponse;
import wft_geo_db.p.mashape.com.definitions.TimeZonesResponse;


/**
 * access wft-geo-db.p.mashape.com with authorization type apiKey.
 */
public class UserSecurity
    extends APIKey
{
    public static final String[] SCOPES = new String[] { };
    public final UserSecurity.V1 v1 = new UserSecurity.V1();

    public UserSecurity(String key) {
        super(key, "X-Mashape-Key", In.HEADER);
    }

    public class V1 {
        public final UserSecurity.V1 .Geo geo = new UserSecurity.V1 .Geo();
        public final UserSecurity.V1 .Locale locale = new UserSecurity.V1 .Locale();

        public class Geo {
            public final UserSecurity.V1 .Geo.Admindivisions admindivisions = new UserSecurity.V1 .Geo.Admindivisions();
            public final UserSecurity.V1 .Geo.Cities cities = new UserSecurity.V1 .Geo.Cities();
            public final UserSecurity.V1 .Geo.Countries countries = new UserSecurity.V1 .Geo.Countries();
            public final UserSecurity.V1 .Geo.Locations locations = new UserSecurity.V1 .Geo.Locations();

            public class Admindivisions {
                public final UserSecurity.V1 .Geo.Admindivisions.Nearbycities nearbycities = new UserSecurity.V1 .Geo.Admindivisions.Nearbycities();
                public final UserSecurity.V1 .Geo.Admindivisions.Nearbydivisions nearbydivisions = new UserSecurity.V1 .Geo.Admindivisions.Nearbydivisions();

                /**
                 * Find administrative divisions
                 * 
                 * <p>
                 * Find administrative divisions, filtering by optional criteria. If no criteria are set, you will get back all known divisions.
                 * </p>
                 * 
                 * @param location
                 *     Only divisions near this location. Latitude/longitude in ISO-6709 format: ±DD.DDDD±DDD.DDDD
                 * @param radius
                 *     The location radius within which to find divisions
                 * @param distanceUnit
                 *     The unit of distance: MI | KM
                 * @param countryIds
                 *     Only divisions in these countries (comma-delimited country codes or WikiData ids)
                 * @param excludedCountryIds
                 *     Only divisions NOT in these countries (comma-delimited country codes or WikiData ids)
                 * @param minPopulation
                 *     Only divisions having at least this population
                 * @param namePrefix
                 *     Only divisions whose names start with this prefix. If languageCode is set, the prefix will be matched on the name as it appears in that language.
                 * @param timeZoneIds
                 *     Only divisions in these time-zones (comma-delimited)
                 * @param asciiMode
                 *     Display results using ASCII characters
                 * @param hateoasMode
                 *     Include HATEOAS-style links in results
                 * @param languageCode
                 *     Display results in this language
                 * @param limit
                 *     The maximum number of results to retrieve
                 * @param offset
                 *     The zero-ary offset index into the results
                 * @param sort
                 *     How to sort the results. Format: ±SORT_FIELD,±SORT_FIELD where SORT_FIELD = countryCode | elevation | name | population
                 * @param includeDeleted
                 *     Whether to include any divisions marked deleted: ALL | SINCE_YESTERDAY | SINCE_LAST_WEEK | NONE
                 */
                public Requested<PopulatedPlacesResponse> get(String location,
                    Integer radius,
                    String distanceUnit,
                    String countryIds,
                    String excludedCountryIds,
                    Integer minPopulation,
                    String namePrefix,
                    String timeZoneIds,
                    Boolean asciiMode,
                    Boolean hateoasMode,
                    String languageCode,
                    Integer limit,
                    Integer offset,
                    String sort,
                    String includeDeleted) {
                    String url = ("https://wft-geo-db.p.mashape.com//v1/geo/adminDivisions"+"?"+(location==null?"":"&location="+flatten(location))+(radius==null?"":"&radius="+flatten(radius))+(distanceUnit==null?"":"&distanceUnit="+flatten(distanceUnit))+(countryIds==null?"":"&countryIds="+flatten(countryIds))+(excludedCountryIds==null?"":"&excludedCountryIds="+flatten(excludedCountryIds))+(minPopulation==null?"":"&minPopulation="+flatten(minPopulation))+(namePrefix==null?"":"&namePrefix="+flatten(namePrefix))+(timeZoneIds==null?"":"&timeZoneIds="+flatten(timeZoneIds))+(asciiMode==null?"":"&asciiMode="+flatten(asciiMode))+(hateoasMode==null?"":"&hateoasMode="+flatten(hateoasMode))+(languageCode==null?"":"&languageCode="+flatten(languageCode))+(limit==null?"":"&limit="+flatten(limit))+(offset==null?"":"&offset="+flatten(offset))+(sort==null?"":"&sort="+flatten(sort))+(includeDeleted==null?"":"&includeDeleted="+flatten(includeDeleted)));
                    return requestGet(url, null, PopulatedPlacesResponse.class);
                }

                /**
                 * Get administrative division details
                 * 
                 * <p>
                 * Get the details for a specific administrative division, including location coordinates, population, and elevation above sea-level (if available).
                 * </p>
                 * 
                 * @param divisionId
                 *     The division id (either native 'id' or 'wikiDataId')
                 * @param asciiMode
                 *     Display results using ASCII characters
                 * @param languageCode
                 *     Display results in this language
                 */
                public Requested<PopulatedPlaceResponse> getByDivisionId(String divisionId, Boolean asciiMode, String languageCode) {
                    String url = ("https://wft-geo-db.p.mashape.com//v1/geo/adminDivisions/{divisionId}".replace("{divisionId}", ""+divisionId)+"?"+(asciiMode==null?"":"&asciiMode="+flatten(asciiMode))+(languageCode==null?"":"&languageCode="+flatten(languageCode)));
                    return requestGet(url, null, PopulatedPlaceResponse.class);
                }

                public class Nearbycities {

                    /**
                     * Find cities near division
                     * 
                     * <p>
                     * Find cities near the given administrative division, filtering by optional criteria. If no criteria are set, you will get back all known cities.
                     * </p>
                     * 
                     * @param divisionId
                     *     The division id (either native 'id' or 'wikiDataId')
                     * @param radius
                     *     The location radius within which to find cities
                     * @param distanceUnit
                     *     The unit of distance: MI | KM
                     * @param countryIds
                     *     Only divisions in these countries (comma-delimited country codes or WikiData ids)
                     * @param excludedCountryIds
                     *     Only divisions NOT in these countries (comma-delimited country codes or WikiData ids)
                     * @param minPopulation
                     *     Only cities having at least this population
                     * @param namePrefix
                     *     Only cities whose names start with this prefix. If languageCode is set, the prefix will be matched on the name as it appears in that language.
                     * @param timeZoneIds
                     *     Only cities in these time-zones (comma-delimited)
                     * @param types
                     *     Only cities for these types (comma-delimited): CITY | ADM2
                     * @param asciiMode
                     *     Display results using ASCII characters
                     * @param hateoasMode
                     *     Include HATEOAS-style links in results
                     * @param languageCode
                     *     Display results in this language
                     * @param limit
                     *     The maximum number of results to retrieve
                     * @param offset
                     *     The zero-ary offset index into the results
                     * @param sort
                     *     How to sort the results. Format: ±SORT_FIELD,±SORT_FIELD where SORT_FIELD = countryCode | elevation | name | population
                     * @param includeDeleted
                     *     Whether to include any cities marked deleted: ALL | SINCE_YESTERDAY | SINCE_LAST_WEEK | NONE
                     */
                    public Requested<PopulatedPlacesResponse> getByDivisionId(String divisionId,
                        Integer radius,
                        String distanceUnit,
                        String countryIds,
                        String excludedCountryIds,
                        Integer minPopulation,
                        String namePrefix,
                        String timeZoneIds,
                        String types,
                        Boolean asciiMode,
                        Boolean hateoasMode,
                        String languageCode,
                        Integer limit,
                        Integer offset,
                        String sort,
                        String includeDeleted) {
                        String url = ("https://wft-geo-db.p.mashape.com//v1/geo/adminDivisions/{divisionId}/nearbyCities".replace("{divisionId}", ""+divisionId)+"?"+(radius==null?"":"&radius="+flatten(radius))+(distanceUnit==null?"":"&distanceUnit="+flatten(distanceUnit))+(countryIds==null?"":"&countryIds="+flatten(countryIds))+(excludedCountryIds==null?"":"&excludedCountryIds="+flatten(excludedCountryIds))+(minPopulation==null?"":"&minPopulation="+flatten(minPopulation))+(namePrefix==null?"":"&namePrefix="+flatten(namePrefix))+(timeZoneIds==null?"":"&timeZoneIds="+flatten(timeZoneIds))+(types==null?"":"&types="+flatten(types))+(asciiMode==null?"":"&asciiMode="+flatten(asciiMode))+(hateoasMode==null?"":"&hateoasMode="+flatten(hateoasMode))+(languageCode==null?"":"&languageCode="+flatten(languageCode))+(limit==null?"":"&limit="+flatten(limit))+(offset==null?"":"&offset="+flatten(offset))+(sort==null?"":"&sort="+flatten(sort))+(includeDeleted==null?"":"&includeDeleted="+flatten(includeDeleted)));
                        return requestGet(url, null, PopulatedPlacesResponse.class);
                    }
                }

                public class Nearbydivisions {

                    /**
                     * Find divisions near division
                     * 
                     * <p>
                     * Find administrative divisions near the given origin division, filtering by optional criteria. If no criteria are set, you will get back all known divisions.
                     * </p>
                     * 
                     * @param divisionId
                     *     The division id (either native 'id' or 'wikiDataId')
                     * @param radius
                     *     The location radius within which to find divisions
                     * @param distanceUnit
                     *     The unit of distance: MI | KM
                     * @param countryIds
                     *     Only divisions in these countries (comma-delimited country codes or WikiData ids)
                     * @param excludedCountryIds
                     *     Only divisions NOT in these countries (comma-delimited country codes or WikiData ids)
                     * @param minPopulation
                     *     Only divisions having at least this population
                     * @param namePrefix
                     *     Only divisions whose names start with this prefix. If languageCode is set, the prefix will be matched on the name as it appears in that language.
                     * @param timeZoneIds
                     *     Only divisions in these time-zones (comma-delimited)
                     * @param asciiMode
                     *     Display results using ASCII characters
                     * @param hateoasMode
                     *     Include HATEOAS-style links in results
                     * @param languageCode
                     *     Display results in this language
                     * @param limit
                     *     The maximum number of results to retrieve
                     * @param offset
                     *     The zero-ary offset index into the results
                     * @param sort
                     *     How to sort the results. Format: ±SORT_FIELD,±SORT_FIELD where SORT_FIELD = countryCode | elevation | name | population
                     * @param includeDeleted
                     *     Whether to include any divisions marked deleted: ALL | SINCE_YESTERDAY | SINCE_LAST_WEEK | NONE
                     */
                    public Requested<PopulatedPlacesResponse> getByDivisionId(String divisionId,
                        Integer radius,
                        String distanceUnit,
                        String countryIds,
                        String excludedCountryIds,
                        Integer minPopulation,
                        String namePrefix,
                        String timeZoneIds,
                        Boolean asciiMode,
                        Boolean hateoasMode,
                        String languageCode,
                        Integer limit,
                        Integer offset,
                        String sort,
                        String includeDeleted) {
                        String url = ("https://wft-geo-db.p.mashape.com//v1/geo/adminDivisions/{divisionId}/nearbyDivisions".replace("{divisionId}", ""+divisionId)+"?"+(radius==null?"":"&radius="+flatten(radius))+(distanceUnit==null?"":"&distanceUnit="+flatten(distanceUnit))+(countryIds==null?"":"&countryIds="+flatten(countryIds))+(excludedCountryIds==null?"":"&excludedCountryIds="+flatten(excludedCountryIds))+(minPopulation==null?"":"&minPopulation="+flatten(minPopulation))+(namePrefix==null?"":"&namePrefix="+flatten(namePrefix))+(timeZoneIds==null?"":"&timeZoneIds="+flatten(timeZoneIds))+(asciiMode==null?"":"&asciiMode="+flatten(asciiMode))+(hateoasMode==null?"":"&hateoasMode="+flatten(hateoasMode))+(languageCode==null?"":"&languageCode="+flatten(languageCode))+(limit==null?"":"&limit="+flatten(limit))+(offset==null?"":"&offset="+flatten(offset))+(sort==null?"":"&sort="+flatten(sort))+(includeDeleted==null?"":"&includeDeleted="+flatten(includeDeleted)));
                        return requestGet(url, null, PopulatedPlacesResponse.class);
                    }
                }
            }

            public class Cities {
                public final UserSecurity.V1 .Geo.Cities.Datetime datetime = new UserSecurity.V1 .Geo.Cities.Datetime();
                public final UserSecurity.V1 .Geo.Cities.Distance distance = new UserSecurity.V1 .Geo.Cities.Distance();
                public final UserSecurity.V1 .Geo.Cities.Nearbycities nearbycities = new UserSecurity.V1 .Geo.Cities.Nearbycities();
                public final UserSecurity.V1 .Geo.Cities.Time time = new UserSecurity.V1 .Geo.Cities.Time();

                /**
                 * Find cities
                 * 
                 * <p>
                 * Find cities, filtering by optional criteria. If no criteria are set, you will get back all known cities.
                 * </p>
                 * 
                 * @param location
                 *     Only cities near this location. Latitude/longitude in ISO-6709 format: ±DD.DDDD±DDD.DDDD
                 * @param radius
                 *     The location radius within which to find cities
                 * @param distanceUnit
                 *     The unit of distance: MI | KM
                 * @param countryIds
                 *     Only cities in these countries (comma-delimited country codes or WikiData ids)
                 * @param excludedCountryIds
                 *     Only cities NOT in these countries (comma-delimited country codes or WikiData ids)
                 * @param namePrefix
                 *     Only cities whose names start with this prefix. If languageCode is set, the prefix will be matched on the name as it appears in that language.
                 * @param minPopulation
                 *     Only cities having at least this population
                 * @param timeZoneIds
                 *     Only cities in these time-zones (comma-delimited)
                 * @param types
                 *     Only cities for these types (comma-delimited): CITY | ADM2
                 * @param asciiMode
                 *     Display results using ASCII characters
                 * @param hateoasMode
                 *     Include HATEOAS-style links in results
                 * @param languageCode
                 *     Display results in this language
                 * @param limit
                 *     The maximum number of results to retrieve
                 * @param offset
                 *     The zero-ary offset index into the results
                 * @param sort
                 *     How to sort the results. Format: ±SORT_FIELD,±SORT_FIELD where SORT_FIELD = countryCode | elevation | name | population
                 * @param includeDeleted
                 *     Whether to include any cities marked deleted: ALL | SINCE_YESTERDAY | SINCE_LAST_WEEK | NONE
                 */
                public Requested<PopulatedPlacesResponse> get(String location,
                    Integer radius,
                    String distanceUnit,
                    String countryIds,
                    String excludedCountryIds,
                    String namePrefix,
                    Integer minPopulation,
                    String timeZoneIds,
                    String types,
                    Boolean asciiMode,
                    Boolean hateoasMode,
                    String languageCode,
                    Integer limit,
                    Integer offset,
                    String sort,
                    String includeDeleted) {
                    String url = ("https://wft-geo-db.p.mashape.com//v1/geo/cities"+"?"+(location==null?"":"&location="+flatten(location))+(radius==null?"":"&radius="+flatten(radius))+(distanceUnit==null?"":"&distanceUnit="+flatten(distanceUnit))+(countryIds==null?"":"&countryIds="+flatten(countryIds))+(excludedCountryIds==null?"":"&excludedCountryIds="+flatten(excludedCountryIds))+(namePrefix==null?"":"&namePrefix="+flatten(namePrefix))+(minPopulation==null?"":"&minPopulation="+flatten(minPopulation))+(timeZoneIds==null?"":"&timeZoneIds="+flatten(timeZoneIds))+(types==null?"":"&types="+flatten(types))+(asciiMode==null?"":"&asciiMode="+flatten(asciiMode))+(hateoasMode==null?"":"&hateoasMode="+flatten(hateoasMode))+(languageCode==null?"":"&languageCode="+flatten(languageCode))+(limit==null?"":"&limit="+flatten(limit))+(offset==null?"":"&offset="+flatten(offset))+(sort==null?"":"&sort="+flatten(sort))+(includeDeleted==null?"":"&includeDeleted="+flatten(includeDeleted)));
                    return requestGet(url, null, PopulatedPlacesResponse.class);
                }

                /**
                 * Get city details
                 * 
                 * <p>
                 * Get the details for a specific city, including location coordinates, population, and elevation above sea-level (if available).
                 * </p>
                 * 
                 * @param cityId
                 *     The city id (either native 'id' or 'wikiDataId')
                 * @param asciiMode
                 *     Display results using ASCII characters
                 * @param languageCode
                 *     Display results in this language
                 */
                public Requested<PopulatedPlaceResponse> getByCityId(String cityId, Boolean asciiMode, String languageCode) {
                    String url = ("https://wft-geo-db.p.mashape.com//v1/geo/cities/{cityId}".replace("{cityId}", ""+cityId)+"?"+(asciiMode==null?"":"&asciiMode="+flatten(asciiMode))+(languageCode==null?"":"&languageCode="+flatten(languageCode)));
                    return requestGet(url, null, PopulatedPlaceResponse.class);
                }

                public class Datetime {

                    /**
                     * Get city date-time
                     * 
                     * <p>
                     * Get city date-time
                     * </p>
                     * 
                     * @param cityId
                     *     The city id (either native 'id' or 'wikiDataId')
                     */
                    public Requested<DateTimeResponse> getByCityId(String cityId) {
                        String url = ("https://wft-geo-db.p.mashape.com//v1/geo/cities/{cityId}/dateTime".replace("{cityId}", ""+cityId));
                        return requestGet(url, null, DateTimeResponse.class);
                    }
                }

                public class Distance {

                    /**
                     * Get city distance
                     * 
                     * <p>
                     * Get distance to the given city
                     * </p>
                     * 
                     * @param cityId
                     *     The city id (either native 'id' or 'wikiDataId')
                     * @param fromCityId
                     *     Distance from this city
                     * @param distanceUnit
                     *     The unit of distance: MI | KM
                     */
                    public Requested<DistanceResponse> getByCityId(String cityId, String fromCityId, String distanceUnit) {
                        String url = ("https://wft-geo-db.p.mashape.com//v1/geo/cities/{cityId}/distance".replace("{cityId}", ""+cityId)+"?"+(fromCityId==null?"":"&fromCityId="+flatten(fromCityId))+(distanceUnit==null?"":"&distanceUnit="+flatten(distanceUnit)));
                        return requestGet(url, null, DistanceResponse.class);
                    }
                }

                public class Nearbycities {

                    /**
                     * Find cities near city
                     * 
                     * <p>
                     * Find cities near the given origin city, filtering by optional criteria. If no criteria are set, you will get back all known cities.
                     * </p>
                     * 
                     * @param radius
                     *     The location radius within which to find cities
                     * @param distanceUnit
                     *     The unit of distance: MI | KM
                     * @param cityId
                     *     The city id (either native 'id' or 'wikiDataId')
                     * @param countryIds
                     *     Only divisions in these countries (comma-delimited country codes or WikiData ids)
                     * @param excludedCountryIds
                     *     Only divisions NOT in these countries (comma-delimited country codes or WikiData ids)
                     * @param minPopulation
                     *     Only cities having at least this population
                     * @param namePrefix
                     *     Only cities whose names start with this prefix. If languageCode is set, the prefix will be matched on the name as it appears in that language.
                     * @param timeZoneIds
                     *     Only cities in these time-zones (comma-delimited)
                     * @param types
                     *     Only cities for these types (comma-delimited): CITY | ADM2
                     * @param asciiMode
                     *     Display results using ASCII characters
                     * @param hateoasMode
                     *     Include HATEOAS-style links in results
                     * @param languageCode
                     *     Display results in this language
                     * @param limit
                     *     The maximum number of results to retrieve
                     * @param offset
                     *     The zero-ary offset index into the results
                     * @param sort
                     *     How to sort the results. Format: ±SORT_FIELD,±SORT_FIELD where SORT_FIELD = countryCode | elevation | name | population
                     * @param includeDeleted
                     *     Whether to include any cities marked deleted: ALL | SINCE_YESTERDAY | SINCE_LAST_WEEK | NONE
                     */
                    public Requested<PopulatedPlacesResponse> getByCityId(Integer radius,
                        String distanceUnit,
                        String cityId,
                        String countryIds,
                        String excludedCountryIds,
                        Integer minPopulation,
                        String namePrefix,
                        String timeZoneIds,
                        String types,
                        Boolean asciiMode,
                        Boolean hateoasMode,
                        String languageCode,
                        Integer limit,
                        Integer offset,
                        String sort,
                        String includeDeleted) {
                        String url = ("https://wft-geo-db.p.mashape.com//v1/geo/cities/{cityId}/nearbyCities".replace("{cityId}", ""+cityId)+"?"+(radius==null?"":"&radius="+flatten(radius))+(distanceUnit==null?"":"&distanceUnit="+flatten(distanceUnit))+(countryIds==null?"":"&countryIds="+flatten(countryIds))+(excludedCountryIds==null?"":"&excludedCountryIds="+flatten(excludedCountryIds))+(minPopulation==null?"":"&minPopulation="+flatten(minPopulation))+(namePrefix==null?"":"&namePrefix="+flatten(namePrefix))+(timeZoneIds==null?"":"&timeZoneIds="+flatten(timeZoneIds))+(types==null?"":"&types="+flatten(types))+(asciiMode==null?"":"&asciiMode="+flatten(asciiMode))+(hateoasMode==null?"":"&hateoasMode="+flatten(hateoasMode))+(languageCode==null?"":"&languageCode="+flatten(languageCode))+(limit==null?"":"&limit="+flatten(limit))+(offset==null?"":"&offset="+flatten(offset))+(sort==null?"":"&sort="+flatten(sort))+(includeDeleted==null?"":"&includeDeleted="+flatten(includeDeleted)));
                        return requestGet(url, null, PopulatedPlacesResponse.class);
                    }
                }

                public class Time {

                    /**
                     * Get city time
                     * 
                     * <p>
                     * Get city time
                     * </p>
                     * 
                     * @param cityId
                     *     The city id (either native 'id' or 'wikiDataId')
                     */
                    public Requested<TimeResponse> getByCityId(String cityId) {
                        String url = ("https://wft-geo-db.p.mashape.com//v1/geo/cities/{cityId}/time".replace("{cityId}", ""+cityId));
                        return requestGet(url, null, TimeResponse.class);
                    }
                }
            }

            public class Countries {
                public final UserSecurity.V1 .Geo.Countries.Regions regions = new UserSecurity.V1 .Geo.Countries.Regions();

                /**
                 * Find countries
                 * 
                 * <p>
                 * Find countries, filtering by optional criteria. If no criteria are set, you will get back all known countries.
                 * </p>
                 * 
                 * @param currencyCode
                 *     Only countries supporting this currency
                 * @param namePrefix
                 *     Only countries whose names start with this prefix. If languageCode is set, the prefix will be matched on the name as it appears in that language.
                 * @param asciiMode
                 *     Display results using ASCII characters
                 * @param hateoasMode
                 *     Include HATEOAS-style links in results
                 * @param languageCode
                 *     Display results in this language
                 * @param limit
                 *     The maximum number of results to retrieve
                 * @param offset
                 *     The zero-ary offset index into the results
                 */
                public Requested<CountriesResponse> get(String currencyCode,
                    String namePrefix,
                    Boolean asciiMode,
                    Boolean hateoasMode,
                    String languageCode,
                    Integer limit,
                    Integer offset) {
                    String url = ("https://wft-geo-db.p.mashape.com//v1/geo/countries"+"?"+(currencyCode==null?"":"&currencyCode="+flatten(currencyCode))+(namePrefix==null?"":"&namePrefix="+flatten(namePrefix))+(asciiMode==null?"":"&asciiMode="+flatten(asciiMode))+(hateoasMode==null?"":"&hateoasMode="+flatten(hateoasMode))+(languageCode==null?"":"&languageCode="+flatten(languageCode))+(limit==null?"":"&limit="+flatten(limit))+(offset==null?"":"&offset="+flatten(offset)));
                    return requestGet(url, null, CountriesResponse.class);
                }

                /**
                 * Get country details
                 * 
                 * <p>
                 * Get the details for a specific country, including number of regions.
                 * </p>
                 * 
                 * @param countryId
                 *     An ISO-3166 country code or WikiData id
                 * @param asciiMode
                 *     Display results using ASCII characters
                 * @param languageCode
                 *     Display results in this language
                 */
                public Requested<CountryResponse> getByCountryId(String countryId, Boolean asciiMode, String languageCode) {
                    String url = ("https://wft-geo-db.p.mashape.com//v1/geo/countries/{countryId}".replace("{countryId}", ""+countryId)+"?"+(asciiMode==null?"":"&asciiMode="+flatten(asciiMode))+(languageCode==null?"":"&languageCode="+flatten(languageCode)));
                    return requestGet(url, null, CountryResponse.class);
                }

                public class Regions {
                    public final UserSecurity.V1 .Geo.Countries.Regions.Admindivisions admindivisions = new UserSecurity.V1 .Geo.Countries.Regions.Admindivisions();
                    public final UserSecurity.V1 .Geo.Countries.Regions.Cities cities = new UserSecurity.V1 .Geo.Countries.Regions.Cities();

                    /**
                     * Find country regions
                     * 
                     * <p>
                     * Get all regions in a specific country. These could be states, provinces, districts, or otherwise major political divisions.
                     * </p>
                     * 
                     * @param countryId
                     *     An ISO-3166 country code or WikiData id
                     * @param namePrefix
                     *     Only regions whose names start with this prefix. If languageCode is set, the prefix will be matched on the name as it appears in that language.
                     * @param asciiMode
                     *     Display results using ASCII characters
                     * @param hateoasMode
                     *     Include HATEOAS-style links in results
                     * @param languageCode
                     *     Display results in this language
                     * @param limit
                     *     The maximum number of results to retrieve
                     * @param offset
                     *     The zero-ary offset index into the results
                     */
                    public Requested<RegionsResponse> getByCountryId(String countryId,
                        String namePrefix,
                        Boolean asciiMode,
                        Boolean hateoasMode,
                        String languageCode,
                        Integer limit,
                        Integer offset) {
                        String url = ("https://wft-geo-db.p.mashape.com//v1/geo/countries/{countryId}/regions".replace("{countryId}", ""+countryId)+"?"+(namePrefix==null?"":"&namePrefix="+flatten(namePrefix))+(asciiMode==null?"":"&asciiMode="+flatten(asciiMode))+(hateoasMode==null?"":"&hateoasMode="+flatten(hateoasMode))+(languageCode==null?"":"&languageCode="+flatten(languageCode))+(limit==null?"":"&limit="+flatten(limit))+(offset==null?"":"&offset="+flatten(offset)));
                        return requestGet(url, null, RegionsResponse.class);
                    }

                    /**
                     * Get region details
                     * 
                     * <p>
                     * Get the details of a specific country region, including number of cities.
                     * </p>
                     * 
                     * @param countryId
                     *     An ISO-3166 country code or WikiData id
                     * @param regionCode
                     *     An ISO-3166 or FIPS region code
                     * @param asciiMode
                     *     Display results using ASCII characters
                     * @param languageCode
                     *     Display results in this language
                     */
                    public Requested<RegionResponse> getByCountryIdRegionCode(String countryId,
                        String regionCode,
                        Boolean asciiMode,
                        String languageCode) {
                        String url = ("https://wft-geo-db.p.mashape.com//v1/geo/countries/{countryId}/regions/{regionCode}".replace("{countryId}", ""+countryId).replace("{regionCode}", ""+regionCode)+"?"+(asciiMode==null?"":"&asciiMode="+flatten(asciiMode))+(languageCode==null?"":"&languageCode="+flatten(languageCode)));
                        return requestGet(url, null, RegionResponse.class);
                    }

                    public class Admindivisions {

                        /**
                         * Find country region administrative divisions
                         * 
                         * <p>
                         * Get the administrative divisions in a specific country region. The country and region info is omitted in the response.
                         * </p>
                         * 
                         * @param countryId
                         *     An ISO-3166 country code or WikiData id
                         * @param regionCode
                         *     An ISO-3166 or FIPS region code
                         * @param minPopulation
                         *     Only divisions having at least this population
                         * @param namePrefix
                         *     Only divisions whose names start with this prefix. If languageCode is set, the prefix will be matched on the name as it appears in that language.
                         * @param timeZoneIds
                         *     Only divisions in these time-zones (comma-delimited)
                         * @param asciiMode
                         *     Display results using ASCII characters
                         * @param hateoasMode
                         *     Include HATEOAS-style links in results
                         * @param languageCode
                         *     Display results in this language
                         * @param limit
                         *     The maximum number of results to retrieve
                         * @param offset
                         *     The zero-ary offset index into the results
                         * @param sort
                         *     How to sort the results. Format: ±SORT_FIELD,±SORT_FIELD where SORT_FIELD = elevation | name | population
                         * @param includeDeleted
                         *     Whether to include any divisions marked deleted: ALL | SINCE_YESTERDAY | SINCE_LAST_WEEK | NONE
                         */
                        public Requested<PopulatedPlacesResponse> getByCountryIdRegionCode(String countryId,
                            String regionCode,
                            Integer minPopulation,
                            String namePrefix,
                            String timeZoneIds,
                            Boolean asciiMode,
                            Boolean hateoasMode,
                            String languageCode,
                            Integer limit,
                            Integer offset,
                            String sort,
                            String includeDeleted) {
                            String url = ("https://wft-geo-db.p.mashape.com//v1/geo/countries/{countryId}/regions/{regionCode}/adminDivisions".replace("{countryId}", ""+countryId).replace("{regionCode}", ""+regionCode)+"?"+(minPopulation==null?"":"&minPopulation="+flatten(minPopulation))+(namePrefix==null?"":"&namePrefix="+flatten(namePrefix))+(timeZoneIds==null?"":"&timeZoneIds="+flatten(timeZoneIds))+(asciiMode==null?"":"&asciiMode="+flatten(asciiMode))+(hateoasMode==null?"":"&hateoasMode="+flatten(hateoasMode))+(languageCode==null?"":"&languageCode="+flatten(languageCode))+(limit==null?"":"&limit="+flatten(limit))+(offset==null?"":"&offset="+flatten(offset))+(sort==null?"":"&sort="+flatten(sort))+(includeDeleted==null?"":"&includeDeleted="+flatten(includeDeleted)));
                            return requestGet(url, null, PopulatedPlacesResponse.class);
                        }
                    }

                    public class Cities {

                        /**
                         * Find country region cities
                         * 
                         * <p>
                         * Get the cities in a specific country region. The country and region info is omitted in the response.
                         * </p>
                         * 
                         * @param countryId
                         *     An ISO-3166 country code or WikiData id
                         * @param regionCode
                         *     An ISO-3166 or FIPS region code
                         * @param minPopulation
                         *     Only cities having at least this population
                         * @param namePrefix
                         *     Only cities whose names start with this prefix. If languageCode is set, the prefix will be matched on the name as it appears in that language.
                         * @param timeZoneIds
                         *     Only cities in these time-zones (comma-delimited)
                         * @param types
                         *     Only cities for these types (comma-delimited): CITY | ADM2
                         * @param asciiMode
                         *     Display results using ASCII characters
                         * @param hateoasMode
                         *     Include HATEOAS-style links in results
                         * @param languageCode
                         *     Display results in this language
                         * @param limit
                         *     The maximum number of results to retrieve
                         * @param offset
                         *     The zero-ary offset index into the results
                         * @param sort
                         *     How to sort the results. Format: ±SORT_FIELD,±SORT_FIELD where SORT_FIELD = elevation | name | population
                         * @param includeDeleted
                         *     Whether to include any cities marked deleted: ALL | SINCE_YESTERDAY | SINCE_LAST_WEEK | NONE
                         */
                        public Requested<PopulatedPlacesResponse> getByCountryIdRegionCode(String countryId,
                            String regionCode,
                            Integer minPopulation,
                            String namePrefix,
                            String timeZoneIds,
                            String types,
                            Boolean asciiMode,
                            Boolean hateoasMode,
                            String languageCode,
                            Integer limit,
                            Integer offset,
                            String sort,
                            String includeDeleted) {
                            String url = ("https://wft-geo-db.p.mashape.com//v1/geo/countries/{countryId}/regions/{regionCode}/cities".replace("{countryId}", ""+countryId).replace("{regionCode}", ""+regionCode)+"?"+(minPopulation==null?"":"&minPopulation="+flatten(minPopulation))+(namePrefix==null?"":"&namePrefix="+flatten(namePrefix))+(timeZoneIds==null?"":"&timeZoneIds="+flatten(timeZoneIds))+(types==null?"":"&types="+flatten(types))+(asciiMode==null?"":"&asciiMode="+flatten(asciiMode))+(hateoasMode==null?"":"&hateoasMode="+flatten(hateoasMode))+(languageCode==null?"":"&languageCode="+flatten(languageCode))+(limit==null?"":"&limit="+flatten(limit))+(offset==null?"":"&offset="+flatten(offset))+(sort==null?"":"&sort="+flatten(sort))+(includeDeleted==null?"":"&includeDeleted="+flatten(includeDeleted)));
                            return requestGet(url, null, PopulatedPlacesResponse.class);
                        }
                    }
                }
            }

            public class Locations {
                public final UserSecurity.V1 .Geo.Locations.Nearbycities nearbycities = new UserSecurity.V1 .Geo.Locations.Nearbycities();
                public final UserSecurity.V1 .Geo.Locations.Nearbydivisions nearbydivisions = new UserSecurity.V1 .Geo.Locations.Nearbydivisions();

                public class Nearbycities {

                    /**
                     * Find cities near location
                     * 
                     * <p>
                     * Find cities near the given location, filtering by optional criteria. If no criteria are set, you will get back all known cities.
                     * </p>
                     * 
                     * @param locationId
                     *     Only cities near this location. Latitude/longitude in ISO-6709 format: ±DD.DDDD±DDD.DDDD
                     * @param radius
                     *     The location radius within which to find cities
                     * @param distanceUnit
                     *     The unit of distance: MI | KM
                     * @param countryIds
                     *     Only divisions in these countries (comma-delimited country codes or WikiData ids)
                     * @param excludedCountryIds
                     *     Only divisions NOT in these countries (comma-delimited country codes or WikiData ids)
                     * @param minPopulation
                     *     Only cities having at least this population
                     * @param namePrefix
                     *     Only cities whose names start with this prefix. If languageCode is set, the prefix will be matched on the name as it appears in that language.
                     * @param timeZoneIds
                     *     Only cities in these time-zones (comma-delimited)
                     * @param types
                     *     Only cities for these types (comma-delimited): CITY | ADM2
                     * @param asciiMode
                     *     Display results using ASCII characters
                     * @param hateoasMode
                     *     Include HATEOAS-style links in results
                     * @param languageCode
                     *     Display results in this language
                     * @param limit
                     *     The maximum number of results to retrieve
                     * @param offset
                     *     The zero-ary offset index into the results
                     * @param sort
                     *     How to sort the results. Format: ±SORT_FIELD,±SORT_FIELD where SORT_FIELD = countryCode | elevation | name | population
                     * @param includeDeleted
                     *     Whether to include any cities marked deleted: ALL | SINCE_YESTERDAY | SINCE_LAST_WEEK | NONE
                     */
                    public Requested<PopulatedPlacesResponse> getByLocationId(String locationId,
                        Integer radius,
                        String distanceUnit,
                        String countryIds,
                        String excludedCountryIds,
                        Integer minPopulation,
                        String namePrefix,
                        String timeZoneIds,
                        String types,
                        Boolean asciiMode,
                        Boolean hateoasMode,
                        String languageCode,
                        Integer limit,
                        Integer offset,
                        String sort,
                        String includeDeleted) {
                        String url = ("https://wft-geo-db.p.mashape.com//v1/geo/locations/{locationId}/nearbyCities".replace("{locationId}", ""+locationId)+"?"+(radius==null?"":"&radius="+flatten(radius))+(distanceUnit==null?"":"&distanceUnit="+flatten(distanceUnit))+(countryIds==null?"":"&countryIds="+flatten(countryIds))+(excludedCountryIds==null?"":"&excludedCountryIds="+flatten(excludedCountryIds))+(minPopulation==null?"":"&minPopulation="+flatten(minPopulation))+(namePrefix==null?"":"&namePrefix="+flatten(namePrefix))+(timeZoneIds==null?"":"&timeZoneIds="+flatten(timeZoneIds))+(types==null?"":"&types="+flatten(types))+(asciiMode==null?"":"&asciiMode="+flatten(asciiMode))+(hateoasMode==null?"":"&hateoasMode="+flatten(hateoasMode))+(languageCode==null?"":"&languageCode="+flatten(languageCode))+(limit==null?"":"&limit="+flatten(limit))+(offset==null?"":"&offset="+flatten(offset))+(sort==null?"":"&sort="+flatten(sort))+(includeDeleted==null?"":"&includeDeleted="+flatten(includeDeleted)));
                        return requestGet(url, null, PopulatedPlacesResponse.class);
                    }
                }

                public class Nearbydivisions {

                    /**
                     * Find divisions near location
                     * 
                     * <p>
                     * Find administrative divisions near the given location, filtering by optional criteria. If no criteria are set, you will get back all known divisions.
                     * </p>
                     * 
                     * @param locationId
                     *     Only divisions near this location. Latitude/longitude in ISO-6709 format: ±DD.DDDD±DDD.DDDD
                     * @param radius
                     *     The location radius within which to find divisions
                     * @param distanceUnit
                     *     The unit of distance: MI | KM
                     * @param countryIds
                     *     Only divisions in these countries (comma-delimited country codes or WikiData ids)
                     * @param excludedCountryIds
                     *     Only divisions NOT in these countries (comma-delimited country codes or WikiData ids)
                     * @param minPopulation
                     *     Only divisions having at least this population
                     * @param namePrefix
                     *     Only divisions whose names start with this prefix. If languageCode is set, the prefix will be matched on the name as it appears in that language.
                     * @param timeZoneIds
                     *     Only divisions in these time-zones (comma-delimited)
                     * @param asciiMode
                     *     Display results using ASCII characters
                     * @param hateoasMode
                     *     Include HATEOAS-style links in results
                     * @param languageCode
                     *     Display results in this language
                     * @param limit
                     *     The maximum number of results to retrieve
                     * @param offset
                     *     The zero-ary offset index into the results
                     * @param sort
                     *     How to sort the results. Format: ±SORT_FIELD,±SORT_FIELD where SORT_FIELD = countryCode | elevation | name | population
                     * @param includeDeleted
                     *     Whether to include any divisions marked deleted: ALL | SINCE_YESTERDAY | SINCE_LAST_WEEK | NONE
                     */
                    public Requested<PopulatedPlacesResponse> getByLocationId(String locationId,
                        Integer radius,
                        String distanceUnit,
                        String countryIds,
                        String excludedCountryIds,
                        Integer minPopulation,
                        String namePrefix,
                        String timeZoneIds,
                        Boolean asciiMode,
                        Boolean hateoasMode,
                        String languageCode,
                        Integer limit,
                        Integer offset,
                        String sort,
                        String includeDeleted) {
                        String url = ("https://wft-geo-db.p.mashape.com//v1/geo/locations/{locationId}/nearbyDivisions".replace("{locationId}", ""+locationId)+"?"+(radius==null?"":"&radius="+flatten(radius))+(distanceUnit==null?"":"&distanceUnit="+flatten(distanceUnit))+(countryIds==null?"":"&countryIds="+flatten(countryIds))+(excludedCountryIds==null?"":"&excludedCountryIds="+flatten(excludedCountryIds))+(minPopulation==null?"":"&minPopulation="+flatten(minPopulation))+(namePrefix==null?"":"&namePrefix="+flatten(namePrefix))+(timeZoneIds==null?"":"&timeZoneIds="+flatten(timeZoneIds))+(asciiMode==null?"":"&asciiMode="+flatten(asciiMode))+(hateoasMode==null?"":"&hateoasMode="+flatten(hateoasMode))+(languageCode==null?"":"&languageCode="+flatten(languageCode))+(limit==null?"":"&limit="+flatten(limit))+(offset==null?"":"&offset="+flatten(offset))+(sort==null?"":"&sort="+flatten(sort))+(includeDeleted==null?"":"&includeDeleted="+flatten(includeDeleted)));
                        return requestGet(url, null, PopulatedPlacesResponse.class);
                    }
                }
            }
        }

        public class Locale {
            public final UserSecurity.V1 .Locale.Currencies currencies = new UserSecurity.V1 .Locale.Currencies();
            public final UserSecurity.V1 .Locale.Languages languages = new UserSecurity.V1 .Locale.Languages();
            public final UserSecurity.V1 .Locale.Locales locales = new UserSecurity.V1 .Locale.Locales();
            public final UserSecurity.V1 .Locale.Timezones timezones = new UserSecurity.V1 .Locale.Timezones();

            public class Currencies {

                /**
                 * Find currencies
                 * 
                 * <p>
                 * Find currencies, filtering by optional criteria. If no criteria are set, you will get back all known currencies.
                 * </p>
                 * 
                 * @param countryId
                 *     Only currencies supported by this country
                 * @param hateoasMode
                 *     Include HATEOAS-style links in results
                 * @param limit
                 *     The maximum number of results to retrieve
                 * @param offset
                 *     The zero-ary offset index into the results
                 */
                public Requested<CurrenciesResponse> get(String countryId,
                    Boolean hateoasMode,
                    Integer limit,
                    Integer offset) {
                    String url = ("https://wft-geo-db.p.mashape.com//v1/locale/currencies"+"?"+(countryId==null?"":"&countryId="+flatten(countryId))+(hateoasMode==null?"":"&hateoasMode="+flatten(hateoasMode))+(limit==null?"":"&limit="+flatten(limit))+(offset==null?"":"&offset="+flatten(offset)));
                    return requestGet(url, null, CurrenciesResponse.class);
                }
            }

            public class Languages {

                /**
                 * Get languages
                 * 
                 * <p>
                 * Get all supported languages
                 * </p>
                 * 
                 * @param hateoasMode
                 *     Include HATEOAS-style links in results
                 * @param limit
                 *     The maximum number of results to retrieve
                 * @param offset
                 *     The zero-ary offset index into the results
                 */
                public Requested<LanguagesResponse> get(Boolean hateoasMode, Integer limit, Integer offset) {
                    String url = ("https://wft-geo-db.p.mashape.com//v1/locale/languages"+"?"+(hateoasMode==null?"":"&hateoasMode="+flatten(hateoasMode))+(limit==null?"":"&limit="+flatten(limit))+(offset==null?"":"&offset="+flatten(offset)));
                    return requestGet(url, null, LanguagesResponse.class);
                }
            }

            public class Locales {

                /**
                 * Get locales
                 * 
                 * <p>
                 * Get all known locales
                 * </p>
                 * 
                 * @param hateoasMode
                 *     Include HATEOAS-style links in results
                 * @param limit
                 *     The maximum number of results to retrieve
                 * @param offset
                 *     The zero-ary offset index into the results
                 */
                public Requested<LocalesResponse> get(Boolean hateoasMode, Integer limit, Integer offset) {
                    String url = ("https://wft-geo-db.p.mashape.com//v1/locale/locales"+"?"+(hateoasMode==null?"":"&hateoasMode="+flatten(hateoasMode))+(limit==null?"":"&limit="+flatten(limit))+(offset==null?"":"&offset="+flatten(offset)));
                    return requestGet(url, null, LocalesResponse.class);
                }
            }

            public class Timezones {
                public final UserSecurity.V1 .Locale.Timezones.Datetime datetime = new UserSecurity.V1 .Locale.Timezones.Datetime();
                public final UserSecurity.V1 .Locale.Timezones.Time time = new UserSecurity.V1 .Locale.Timezones.Time();

                /**
                 * Get time-zones
                 * 
                 * <p>
                 * Get all known time-zones
                 * </p>
                 * 
                 * @param hateoasMode
                 *     Include HATEOAS-style links in results
                 * @param limit
                 *     The maximum number of results to retrieve
                 * @param offset
                 *     The zero-ary offset index into the results
                 */
                public Requested<TimeZonesResponse> get(Boolean hateoasMode, Integer limit, Integer offset) {
                    String url = ("https://wft-geo-db.p.mashape.com//v1/locale/timezones"+"?"+(hateoasMode==null?"":"&hateoasMode="+flatten(hateoasMode))+(limit==null?"":"&limit="+flatten(limit))+(offset==null?"":"&offset="+flatten(offset)));
                    return requestGet(url, null, TimeZonesResponse.class);
                }

                public class Datetime {

                    /**
                     * Get time-zone date-time
                     * 
                     * <p>
                     * Get time-zone date-time
                     * </p>
                     * 
                     * @param zoneId
                     *     The time-zone id
                     */
                    public Requested<DateTimeResponse> getByZoneId(String zoneId) {
                        String url = ("https://wft-geo-db.p.mashape.com//v1/locale/timezones/{zoneId}/dateTime".replace("{zoneId}", ""+zoneId));
                        return requestGet(url, null, DateTimeResponse.class);
                    }
                }

                public class Time {

                    /**
                     * Get time-zone time
                     * 
                     * <p>
                     * Get time-zone time
                     * </p>
                     * 
                     * @param zoneId
                     *     The time-zone id
                     */
                    public Requested<TimeResponse> getByZoneId(String zoneId) {
                        String url = ("https://wft-geo-db.p.mashape.com//v1/locale/timezones/{zoneId}/time".replace("{zoneId}", ""+zoneId));
                        return requestGet(url, null, TimeResponse.class);
                    }
                }
            }
        }
    }
}
