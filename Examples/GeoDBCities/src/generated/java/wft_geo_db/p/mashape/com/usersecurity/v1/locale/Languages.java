package wft_geo_db.p.mashape.com.usersecurity.v1.locale;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import wft_geo_db.p.mashape.com.UserSecurity;
import wft_geo_db.p.mashape.com.definitions.LanguagesResponse;

public class Languages
    extends DelegateTransfer<UserSecurity>
{

    public Languages(UserSecurity delegate) {
        super(delegate);
    }

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
