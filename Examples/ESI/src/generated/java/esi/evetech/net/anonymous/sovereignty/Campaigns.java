package esi.evetech.net.anonymous.sovereignty;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetSovereigntyCampaigns;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Campaigns
    extends DelegateTransfer<Anonymous>
{

    public Campaigns(Anonymous delegate) {
        super(delegate);
    }

    /**
     * List sovereignty campaigns
     * 
     * <p>
     * Shows sovereignty data for campaigns.<br />
     * This route is cached for up to 5 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<GetSovereigntyCampaigns[]> get(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/sovereignty/campaigns/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetSovereigntyCampaigns[].class);
    }
}
