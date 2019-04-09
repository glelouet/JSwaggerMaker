package petstore.swagger.io;

import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.securities.APIKey;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import io.swagger.models.auth.In;
import petstore.swagger.io.definitions.Pet;


/**
 * access petstore.swagger.io with authorization type apiKey.
 */
public class ApiKey
    extends APIKey
{
    public static final String[] SCOPES = new String[] { };

    public ApiKey(String key) {
        super(key, "api_key", In.HEADER);
    }

    /**
     * Find pet by ID
     * <p>
     * Returns a single pet
     * </p>
     * 
     * @param petId
     *     ID of pet to return
     */
    public Requested<Pet> getPetById(long petId) {
        String url = ("https://petstore.swagger.io/v2/pet/{petId}".replace("{petId}", ""+petId));
        return requestGet(url, null, Pet.class);
    }

    /**
     * Returns pet inventories by status
     * <p>
     * Returns a map of status codes to quantities
     * </p>
     */
    public Requested<Map<String, Integer>> getInventory() {
        String url = ("https://petstore.swagger.io/v2/store/inventory");
        return requestGetMap(url, null, Integer.class);
    }
}
