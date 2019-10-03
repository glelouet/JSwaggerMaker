package esi.evetech.net.anonymous.wars;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetCharactersCharacterIdKillmailsRecent;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Killmails
    extends DelegateTransfer<Anonymous>
{

    public Killmails(Anonymous delegate) {
        super(delegate);
    }

    /**
     * List kills for a war
     * 
     * <p>
     * Return a list of kills related to a war<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     * @param war_id
     *     A valid war ID
     */
    public Requested<GetCharactersCharacterIdKillmailsRecent[]> getByWarId(String If_None_Match, Integer page, int war_id) {
        String url = ("https://esi.evetech.net/v1/wars/{war_id}/killmails/".replace("{war_id}", ""+war_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(page==null?"":"&page="+flatten(page)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdKillmailsRecent[].class);
    }
}
