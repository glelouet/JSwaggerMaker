package wft_geo_db.p.mashape.com.usersecurity.v1.geo.countries;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import wft_geo_db.p.mashape.com.UserSecurity;
import wft_geo_db.p.mashape.com.definitions.RegionResponse;
import wft_geo_db.p.mashape.com.definitions.RegionsResponse;
import wft_geo_db.p.mashape.com.usersecurity.v1.geo.countries.regions.Admindivisions;
import wft_geo_db.p.mashape.com.usersecurity.v1.geo.countries.regions.Cities;

public class Regions
    extends DelegateTransfer<UserSecurity>
{
    public final Admindivisions admindivisions;
    public final Cities cities;

    public Regions(UserSecurity delegate) {
        super(delegate);
        admindivisions = new Admindivisions((delegate));
        cities = new Cities((delegate));
    }

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
}
