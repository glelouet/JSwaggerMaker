package esi.evetech.net.evesso.corporations;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.corporations.contacts.Labels;
import esi.evetech.net.responses.GetCorporationsCorporationIdContacts;
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
     * Get corporation contacts
     * 
     * <p>
     * Return contacts of a corporation<br />
     * This route is cached for up to 300 seconds
     * </p>
     * 
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCorporationsCorporationIdContacts[]> getByCorporationId(int corporation_id, String If_None_Match, Integer page) {
        String url = ("https://esi.evetech.net/v2/corporations/{corporation_id}/contacts/".replace("{corporation_id}", ""+corporation_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(page==null?"":"&page="+flatten(page))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCorporationsCorporationIdContacts[].class);
    }
}
