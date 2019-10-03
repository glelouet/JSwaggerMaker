package esi.evetech.net.anonymous.dogma;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetDogmaAttributesAttributeId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Attributes
    extends DelegateTransfer<Anonymous>
{

    public Attributes(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get attributes
     * 
     * <p>
     * Get a list of dogma attribute ids<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<int[]> get(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/dogma/attributes/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, int[].class);
    }

    /**
     * Get attribute information
     * 
     * <p>
     * Get information on a dogma attribute<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param attribute_id
     *     A dogma attribute ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<GetDogmaAttributesAttributeId> getByAttributeId(int attribute_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/dogma/attributes/{attribute_id}/".replace("{attribute_id}", ""+attribute_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetDogmaAttributesAttributeId.class);
    }
}
