package api.apis.guru.anonymous;

import api.apis.guru.Anonymous;
import api.apis.guru.definitions.Metrics;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Metrics_json
    extends DelegateTransfer<Anonymous>
{

    public Metrics_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get basic metrics
     * 
     * <p>
     * Some basic metrics for the entire directory.
     * Just stunning numbers to put on a front page and are intended purely for WoW effect :)
     * </p>
     */
    public Requested<Metrics> get() {
        String url = ("https://api.apis.guru/v2//metrics.json");
        return requestGet(url, null, Metrics.class);
    }
}
