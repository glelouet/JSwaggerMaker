package discourse.example.com.anonymous.admin;

import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.admin.logs.StaffActionLogs_json;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Logs
    extends DelegateTransfer<Anonymous>
{
    public final StaffActionLogs_json staff_action_logs_json;

    public Logs(Anonymous delegate) {
        super(delegate);
        staff_action_logs_json = new StaffActionLogs_json((delegate));
    }
}
