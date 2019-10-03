package esi.evetech.net.evesso.ui.openwindow;

import esi.evetech.net.Evesso;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Information
    extends DelegateTransfer<Evesso>
{

    public Information(Evesso delegate) {
        super(delegate);
    }

    /**
     * Open Information Window
     * 
     * <p>
     * Open the information window for a character, corporation or alliance inside the client
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param target_id
     *     The target to open
     * @param token
     *     Access token to use if unable to set a header
     */
    public void post(int target_id) {
        String url = ("https://esi.evetech.net/v1/ui/openwindow/information/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+"&target_id="+flatten(target_id)+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        requestPost(url, null, null, Void.class);
    }
}
