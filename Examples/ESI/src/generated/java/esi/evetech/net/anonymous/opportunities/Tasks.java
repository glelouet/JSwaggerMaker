package esi.evetech.net.anonymous.opportunities;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetOpportunitiesTasksTaskId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Tasks
    extends DelegateTransfer<Anonymous>
{

    public Tasks(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get opportunities tasks
     * 
     * <p>
     * Return a list of opportunities tasks<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<int[]> get(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/opportunities/tasks/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, int[].class);
    }

    /**
     * Get opportunities task
     * 
     * <p>
     * Return information of an opportunities task<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param task_id
     *     ID of an opportunities task
     */
    public Requested<GetOpportunitiesTasksTaskId> getByTaskId(String If_None_Match, int task_id) {
        String url = ("https://esi.evetech.net/v1/opportunities/tasks/{task_id}/".replace("{task_id}", ""+task_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetOpportunitiesTasksTaskId.class);
    }
}
