package api.apis.guru.anonymous;

import java.util.Map;
import api.apis.guru.Anonymous;
import api.apis.guru.definitions.API;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class List_json
    extends DelegateTransfer<Anonymous>
{

    public List_json(Anonymous delegate) {
        super(delegate);
    }

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
