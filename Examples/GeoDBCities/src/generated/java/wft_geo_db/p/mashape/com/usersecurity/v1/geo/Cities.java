package wft_geo_db.p.mashape.com.usersecurity.v1.geo;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import wft_geo_db.p.mashape.com.UserSecurity;
import wft_geo_db.p.mashape.com.definitions.PopulatedPlaceResponse;
import wft_geo_db.p.mashape.com.definitions.PopulatedPlacesResponse;
import wft_geo_db.p.mashape.com.usersecurity.v1.geo.cities.Datetime;
import wft_geo_db.p.mashape.com.usersecurity.v1.geo.cities.Distance;
import wft_geo_db.p.mashape.com.usersecurity.v1.geo.cities.Nearbycities;
import wft_geo_db.p.mashape.com.usersecurity.v1.geo.cities.Time;

public class Cities
    extends DelegateTransfer<UserSecurity>
{
    public final Datetime datetime;
    public final Distance distance;
    public final Nearbycities nearbycities;
    public final Time time;

    public Cities(UserSecurity delegate) {
        super(delegate);
        datetime = new Datetime((delegate));
        distance = new Distance((delegate));
        nearbycities = new Nearbycities((delegate));
        time = new Time((delegate));
    }

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
}
