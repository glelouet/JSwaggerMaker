package petstore.swagger.io;

import fr.lelouet.jswaggermaker.client.common.impl.securities.APIKey;
import io.swagger.models.auth.In;
import petstore.swagger.io.apikey.Pet;
import petstore.swagger.io.apikey.Store;


/**
 * access petstore.swagger.io with authorization type apiKey.
 */
public class ApiKey
    extends APIKey
{
    public static final String[] SCOPES = new String[] { };
    public final Pet pet = new Pet(this);
    public final Store store = new Store(this);

    public ApiKey(String key) {
        super(key, "api_key", In.HEADER);
    }
}
