package wft_geo_db.p.mashape.com.usersecurity.v1.locale;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import wft_geo_db.p.mashape.com.UserSecurity;
import wft_geo_db.p.mashape.com.definitions.CurrenciesResponse;

public class Currencies
    extends DelegateTransfer<UserSecurity>
{

    public Currencies(UserSecurity delegate) {
        super(delegate);
    }

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
