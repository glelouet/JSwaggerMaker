package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.exportcsv.ExportEntity_json;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ExportCsv
    extends DelegateTransfer<Anonymous>
{
    public final ExportEntity_json export_entity_json;

    public ExportCsv(Anonymous delegate) {
        super(delegate);
        export_entity_json = new ExportEntity_json((delegate));
    }
}
