package esi.evetech.net.anonymous.universe;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetUniverseSchematicsSchematicId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Schematics
    extends DelegateTransfer<Anonymous>
{

    public Schematics(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get schematic information
     * 
     * <p>
     * Get information on a planetary factory schematic<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param schematic_id
     *     A PI schematic ID
     */
    public Requested<GetUniverseSchematicsSchematicId> getBySchematicId(String If_None_Match, int schematic_id) {
        String url = ("https://esi.evetech.net/v1/universe/schematics/{schematic_id}/".replace("{schematic_id}", ""+schematic_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetUniverseSchematicsSchematicId.class);
    }
}
