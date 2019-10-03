package wft_geo_db.p.mashape.com.usersecurity.v1.geo;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import wft_geo_db.p.mashape.com.UserSecurity;
import wft_geo_db.p.mashape.com.definitions.CountriesResponse;
import wft_geo_db.p.mashape.com.definitions.CountryResponse;
import wft_geo_db.p.mashape.com.usersecurity.v1.geo.countries.Regions;

public class Countries
    extends DelegateTransfer<UserSecurity>
{
    public final Regions regions;

    public Countries(UserSecurity delegate) {
        super(delegate);
        regions = new Regions((delegate));
    }

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
}
