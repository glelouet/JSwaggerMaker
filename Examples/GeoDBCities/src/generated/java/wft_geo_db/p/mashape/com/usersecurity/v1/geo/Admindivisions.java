package wft_geo_db.p.mashape.com.usersecurity.v1.geo;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import wft_geo_db.p.mashape.com.UserSecurity;
import wft_geo_db.p.mashape.com.definitions.PopulatedPlaceResponse;
import wft_geo_db.p.mashape.com.definitions.PopulatedPlacesResponse;
import wft_geo_db.p.mashape.com.usersecurity.v1.geo.admindivisions.Nearbycities;
import wft_geo_db.p.mashape.com.usersecurity.v1.geo.admindivisions.Nearbydivisions;

public class Admindivisions
    extends DelegateTransfer<UserSecurity>
{
    public final Nearbycities nearbycities;
    public final Nearbydivisions nearbydivisions;

    public Admindivisions(UserSecurity delegate) {
        super(delegate);
        nearbycities = new Nearbycities((delegate));
        nearbydivisions = new Nearbydivisions((delegate));
    }

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
}
