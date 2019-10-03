package esi.evetech.net.anonymous.alliances;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetAlliancesAllianceIdIcons;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Icons
    extends DelegateTransfer<Anonymous>
{

    public Icons(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get alliance icon
     * 
     * <p>
     * Get the icon urls for a alliance<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param alliance_id
     *     An EVE alliance ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<GetAlliancesAllianceIdIcons> getByAllianceId(int alliance_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/alliances/{alliance_id}/icons/".replace("{alliance_id}", ""+alliance_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetAlliancesAllianceIdIcons.class);
    }
}
