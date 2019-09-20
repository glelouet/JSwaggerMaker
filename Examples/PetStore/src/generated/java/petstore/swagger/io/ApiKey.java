package petstore.swagger.io;

import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.securities.APIKey;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import io.swagger.models.auth.In;


/**
 * access petstore.swagger.io with authorization type apiKey.
 */
public class ApiKey
    extends APIKey
{
    public static final String[] SCOPES = new String[] { };
    public final ApiKey.Pet pet = new ApiKey.Pet();
    public final ApiKey.Store store = new ApiKey.Store();

    public ApiKey(String key) {
        super(key, "api_key", In.HEADER);
    }

    public class Pet {

        /**
         * Find pet by ID
         * <p>
         * Returns a single pet
         * </p>
         * 
         * @param petId
         *     ID of pet to return
         */
        public Requested<petstore.swagger.io.definitions.Pet> getByPetid(long petId) {
            String url = ("https://petstore.swagger.io/v2/pet/{petId}".replace("{petId}", ""+petId));
            return requestGet(url, null, petstore.swagger.io.definitions.Pet.class);
        }
    }

    public class Store {
        public final ApiKey.Store.Inventory inventory = new ApiKey.Store.Inventory();

        public class Inventory {

            /**
             * Returns pet inventories by status
             * <p>
             * Returns a map of status codes to quantities
             * </p>
             */
            public Requested<Map<String, Integer>> get() {
                String url = ("https://petstore.swagger.io/v2/store/inventory");
                return requestGetMap(url, null, Integer.class);
            }
        }
    }
}
