package petstore.swagger.io.apikey;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import petstore.swagger.io.ApiKey;

public class Pet
    extends DelegateTransfer<ApiKey>
{

    public Pet(ApiKey delegate) {
        super(delegate);
    }

    /**
     * Find pet by ID
     * 
     * <p>
     * Returns a single pet
     * </p>
     * 
     * @param petId
     *     ID of pet to return
     */
    public Requested<petstore.swagger.io.definitions.Pet> getByPetId(long petId) {
        String url = ("https://petstore.swagger.io/v2/pet/{petId}".replace("{petId}", ""+petId));
        return requestGet(url, null, petstore.swagger.io.definitions.Pet.class);
    }
}
