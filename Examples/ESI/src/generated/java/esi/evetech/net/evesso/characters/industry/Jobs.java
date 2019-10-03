package esi.evetech.net.evesso.characters.industry;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCharactersCharacterIdIndustryJobs;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Jobs
    extends DelegateTransfer<Evesso>
{

    public Jobs(Evesso delegate) {
        super(delegate);
    }

    /**
     * List character industry jobs
     * 
     * <p>
     * List industry jobs placed by a character<br />
     * This route is cached for up to 300 seconds
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param include_completed
     *     Whether to retrieve completed character industry jobs. Only includes jobs from the past 90 days
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCharactersCharacterIdIndustryJobs[]> getByCharacterId(int character_id, String If_None_Match, Boolean include_completed) {
        String url = ("https://esi.evetech.net/v1/characters/{character_id}/industry/jobs/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(include_completed==null?"":"&include_completed="+flatten(include_completed))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdIndustryJobs[].class);
    }
}
