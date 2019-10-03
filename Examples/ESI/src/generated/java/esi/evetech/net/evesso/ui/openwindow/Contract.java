package esi.evetech.net.evesso.ui.openwindow;

import esi.evetech.net.Evesso;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Contract
    extends DelegateTransfer<Evesso>
{

    public Contract(Evesso delegate) {
        super(delegate);
    }

    /**
     * Open Contract Window
     * 
     * <p>
     * Open the contract window inside the client
     * </p>
     * 
     * @param contract_id
     *     The contract to open
     * @param datasource
     *     The server name you would like data from
     * @param token
     *     Access token to use if unable to set a header
     */
    public void post(int contract_id) {
        String url = ("https://esi.evetech.net/v1/ui/openwindow/contract/"+"?"+"&contract_id="+flatten(contract_id)+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        requestPost(url, null, null, Void.class);
    }
}
