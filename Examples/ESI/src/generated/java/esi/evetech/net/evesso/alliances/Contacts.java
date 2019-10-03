package esi.evetech.net.evesso.alliances;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.alliances.contacts.Labels;
import esi.evetech.net.responses.GetAlliancesAllianceIdContacts;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Contacts
    extends DelegateTransfer<Evesso>
{
    public final Labels labels;

    public Contacts(Evesso delegate) {
        super(delegate);
        labels = new Labels((delegate));
    }

    /**
     * Get alliance contacts
     * 
     * <p>
     * Return contacts of an alliance<br />
     * This route is cached for up to 300 seconds
     * </p>
     * 
     * @param alliance_id
     *     An EVE alliance ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetAlliancesAllianceIdContacts[]> getByAllianceId(int alliance_id, String If_None_Match, Integer page) {
        String url = ("https://esi.evetech.net/v2/alliances/{alliance_id}/contacts/".replace("{alliance_id}", ""+alliance_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(page==null?"":"&page="+flatten(page))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetAlliancesAllianceIdContacts[].class);
    }
}
