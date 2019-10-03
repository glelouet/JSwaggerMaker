package api.apis.guru;

import api.apis.guru.anonymous.List_json;
import api.apis.guru.anonymous.Metrics_json;
import fr.lelouet.jswaggermaker.client.common.impl.securities.Disconnected;


/**
 * access api.apis.guru with no authorization.
 */
public class Anonymous
    extends Disconnected
{
    public final List_json list_json = new List_json(this);
    public final Metrics_json metrics_json = new Metrics_json(this);
}
