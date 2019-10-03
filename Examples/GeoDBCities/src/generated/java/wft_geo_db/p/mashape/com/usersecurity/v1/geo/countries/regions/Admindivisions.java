package wft_geo_db.p.mashape.com.usersecurity.v1.geo.countries.regions;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import wft_geo_db.p.mashape.com.UserSecurity;
import wft_geo_db.p.mashape.com.definitions.PopulatedPlacesResponse;

public class Admindivisions
    extends DelegateTransfer<UserSecurity>
{

    public Admindivisions(UserSecurity delegate) {
        super(delegate);
    }

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
