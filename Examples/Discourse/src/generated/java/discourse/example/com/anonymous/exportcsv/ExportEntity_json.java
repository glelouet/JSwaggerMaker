package discourse.example.com.anonymous.exportcsv;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class ExportEntity_json
    extends DelegateTransfer<Anonymous>
{

    public ExportEntity_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Start export of a report
     * </p>
     * 
     * @param entity
     * @param args_name_
     * @param args_start_date_
     * @param args_end_date_
     * @param args_group_id_
     */
    public Requested<Object> post(String entity,
        String args_name_,
        String args_start_date_,
        String args_end_date_,
        long args_group_id_) {
        String url = ("https://discourse.example.com//export_csv/export_entity.json");
        Map<String, Object> content = new HashMap<>();
        content.put("entity", entity);
        content.put("args_name_", args_name_);
        content.put("args_start_date_", args_start_date_);
        content.put("args_end_date_", args_end_date_);
        content.put("args_group_id_", args_group_id_);
        return requestPost(url, null, content, Object.class);
    }
}
