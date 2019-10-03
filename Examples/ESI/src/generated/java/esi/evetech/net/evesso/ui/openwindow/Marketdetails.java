package esi.evetech.net.evesso.ui.openwindow;

import esi.evetech.net.Evesso;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Marketdetails
    extends DelegateTransfer<Evesso>
{

    public Marketdetails(Evesso delegate) {
        super(delegate);
    }

    /**
     * Open Market Details
     * 
     * <p>
     * Open the market details window for a specific typeID inside the client
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param token
     *     Access token to use if unable to set a header
     * @param type_id
     *     The item type to open in market window
     */
    public void post(int type_id) {
        String url = ("https://esi.evetech.net/v1/ui/openwindow/marketdetails/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token))+"&type_id="+flatten(type_id));
        requestPost(url, null, null, Void.class);
    }
}
