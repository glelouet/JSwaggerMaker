package api.apis.guru;

import java.util.Map;
import api.apis.guru.definitions.API;
import api.apis.guru.definitions.Metrics;
import fr.lelouet.jswaggermaker.client.common.impl.securities.Disconnected;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;


/**
 * access api.apis.guru with no authorization.
 */
public class Anonymous
    extends Disconnected
{
    public final Anonymous.ListJson list_json = new Anonymous.ListJson();
    public final Anonymous.MetricsJson metrics_json = new Anonymous.MetricsJson();

    public class ListJson {

        /**
         * List all APIs
         * 
         * <p>
         * List all APIs in the directory.
         * Returns links to OpenAPI specification for each API in the directory.
         * If API exist in multiple versions `preferred` one is explicitly marked.
         * Some basic info from OpenAPI spec is cached inside each object.
         * This allows to generate some simple views without need to fetch OpenAPI spec for each API.
         * </p>
         */
        public Requested<Map<String, API>> get() {
            String url = ("https://api.apis.guru/v2//list.json");
            return requestGetMap(url, null, API.class);
        }
    }

    public class MetricsJson {

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
}
