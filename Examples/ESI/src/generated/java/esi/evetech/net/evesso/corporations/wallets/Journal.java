package esi.evetech.net.evesso.corporations.wallets;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCorporationsCorporationIdWalletsDivisionJournal;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Journal
    extends DelegateTransfer<Evesso>
{
    /**
     * the roles required for {@link #getByCorporationIdDivision this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_WALLETS_DIVISION_JOURNAL_ROLES = new String[] {"Accountant", "Junior_Accountant"};

    public Journal(Evesso delegate) {
        super(delegate);
    }

    /**
     * Get corporation wallet journal
     * 
     * <p>
     * Retrieve the given corporation's wallet journal for the given division going 30 days back<br />
     * This route is cached for up to 3600 seconds<br />
     * Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant
     * </p>
     * <p>
     * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_WALLETS_DIVISION_JOURNAL_ROLES here}
     * </p>
     * 
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param division
     *     Wallet key of the division to fetch journals from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCorporationsCorporationIdWalletsDivisionJournal[]> getByCorporationIdDivision(int corporation_id,
        int division,
        String If_None_Match,
        Integer page) {
        String url = ("https://esi.evetech.net/v4/corporations/{corporation_id}/wallets/{division}/journal/".replace("{corporation_id}", ""+corporation_id).replace("{division}", ""+division)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(page==null?"":"&page="+flatten(page))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCorporationsCorporationIdWalletsDivisionJournal[].class);
    }
}
