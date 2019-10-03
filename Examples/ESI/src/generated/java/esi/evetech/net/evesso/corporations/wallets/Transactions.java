package esi.evetech.net.evesso.corporations.wallets;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCorporationsCorporationIdWalletsDivisionTransactions;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Transactions
    extends DelegateTransfer<Evesso>
{
    /**
     * the roles required for {@link #getByCorporationIdDivision this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_WALLETS_DIVISION_TRANSACTIONS_ROLES = new String[] {"Accountant", "Junior_Accountant"};

    public Transactions(Evesso delegate) {
        super(delegate);
    }

    /**
     * Get corporation wallet transactions
     * 
     * <p>
     * Get wallet transactions of a corporation<br />
     * This route is cached for up to 3600 seconds<br />
     * Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant
     * </p>
     * <p>
     * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_WALLETS_DIVISION_TRANSACTIONS_ROLES here}
     * </p>
     * 
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param division
     *     Wallet key of the division to fetch journals from
     * @param from_id
     *     Only show journal entries happened before the transaction referenced by this id
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCorporationsCorporationIdWalletsDivisionTransactions[]> getByCorporationIdDivision(int corporation_id,
        int division,
        Long from_id,
        String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/wallets/{division}/transactions/".replace("{corporation_id}", ""+corporation_id).replace("{division}", ""+division)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(from_id==null?"":"&from_id="+flatten(from_id))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCorporationsCorporationIdWalletsDivisionTransactions[].class);
    }
}
