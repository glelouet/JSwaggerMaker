package esi.evetech.net.evesso.corporations.industry;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCorporationsCorporationIdIndustryJobs;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Jobs
    extends DelegateTransfer<Evesso>
{
    /**
     * the roles required for {@link #getByCorporationId this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_INDUSTRY_JOBS_ROLES = new String[] {"Factory_Manager"};

    public Jobs(Evesso delegate) {
        super(delegate);
    }

    /**
     * List corporation industry jobs
     * 
     * <p>
     * List industry jobs run by a corporation<br />
     * This route is cached for up to 300 seconds<br />
     * Requires one of the following EVE corporation role(s): Factory_Manager
     * </p>
     * <p>
     * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_INDUSTRY_JOBS_ROLES here}
     * </p>
     * 
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param include_completed
     *     Whether to retrieve completed corporation industry jobs. Only includes jobs from the past 90 days
     * @param page
     *     Which page of results to return
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCorporationsCorporationIdIndustryJobs[]> getByCorporationId(int corporation_id,
        String If_None_Match,
        Boolean include_completed,
        Integer page) {
        String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/industry/jobs/".replace("{corporation_id}", ""+corporation_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(include_completed==null?"":"&include_completed="+flatten(include_completed))+(page==null?"":"&page="+flatten(page))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCorporationsCorporationIdIndustryJobs[].class);
    }
}
