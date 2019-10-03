package esi.evetech.net.evesso.alliances.contacts;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetAlliancesAllianceIdContactsLabels;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Labels
    extends DelegateTransfer<Evesso>
{

    public Labels(Evesso delegate) {
        super(delegate);
    }

    /**
     * Get alliance contact labels
     * 
     * <p>
     * Return custom labels for an alliance's contacts<br />
     * This route is cached for up to 300 seconds
     * </p>
     * 
     * @param alliance_id
     *     An EVE alliance ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetAlliancesAllianceIdContactsLabels[]> getByAllianceId(int alliance_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/alliances/{alliance_id}/contacts/labels/".replace("{alliance_id}", ""+alliance_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetAlliancesAllianceIdContactsLabels[].class);
    }
}
