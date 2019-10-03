package esi.evetech.net.evesso.characters;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.Evesso;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Cspa
    extends DelegateTransfer<Evesso>
{

    public Cspa(Evesso delegate) {
        super(delegate);
    }

    /**
     * Calculate a CSPA charge cost
     * 
     * <p>
     * Takes a source character ID in the url and a set of target character ID's in the body, returns a CSPA charge cost
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param characters
     *     The target characters to calculate the charge for
     * @param datasource
     *     The server name you would like data from
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<Float> postByCharacterId(int character_id, int[] characters) {
        String url = ("https://esi.evetech.net/v4/characters/{character_id}/cspa/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        Map<String, Object> content = new HashMap<>();
        content.put("characters", characters);
        return requestPost(url, null, content, Float.class);
    }
}
