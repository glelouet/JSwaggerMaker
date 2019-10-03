package discourse.example.com.anonymous.admin.logs;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class StaffActionLogs_json
    extends DelegateTransfer<Anonymous>
{

    public StaffActionLogs_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * get staff action logs
     * </p>
     * 
     * @param action_name
     * @param action_id
     */
    public Requested<Object> get(String action_name, Long action_id) {
        String url = ("https://discourse.example.com//admin/logs/staff_action_logs.json"+"?"+(action_name==null?"":"&action_name="+flatten(action_name))+(action_id==null?"":"&action_id="+flatten(action_id)));
        return requestGet(url, null, Object.class);
    }
}
