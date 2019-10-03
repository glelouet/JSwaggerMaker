package esi.evetech.net.anonymous;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetKillmailsKillmailIdKillmailHash;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Killmails
    extends DelegateTransfer<Anonymous>
{

    public Killmails(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get a single killmail
     * 
     * <p>
     * Return a single killmail from its ID and hash<br />
     * This route is cached for up to 1209600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param killmail_hash
     *     The killmail hash for verification
     * @param killmail_id
     *     The killmail ID to be queried
     */
    public Requested<GetKillmailsKillmailIdKillmailHash> getByKillmailIdKillmailHash(String If_None_Match, String killmail_hash, int killmail_id) {
        String url = ("https://esi.evetech.net/v1/killmails/{killmail_id}/{killmail_hash}/".replace("{killmail_hash}", ""+killmail_hash).replace("{killmail_id}", ""+killmail_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetKillmailsKillmailIdKillmailHash.class);
    }
}
