package petstore.swagger.io;

import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.ATransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import petstore.swagger.io.definitions.Pet;


/**
 * access petstore.swagger.io with authorization type apiKey.
 */
public class api_key
    extends ATransfer
{
    public static final String[] SCOPES = new String[] { };

    /**
     * Find pet by ID
     * <p>
     * Returns a single pet
     * </p>
     * 
     * @param petId
     *     ID of pet to return
     */
    public Requested<Pet> getPetById(long petId, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/pet/{petId}".replace("{petId}", ""+petId));
        return requestGet(url, properties, Pet.class);
    }

    /**
     * Returns pet inventories by status
     * <p>
     * Returns a map of status codes to quantities
     * </p>
     */
    public Requested<Map<String, Integer>> getInventory(Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/store/inventory");
        return requestGetMap(url, properties, Integer.class);
    }
}
