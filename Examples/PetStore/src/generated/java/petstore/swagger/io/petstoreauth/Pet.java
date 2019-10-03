package petstore.swagger.io.petstoreauth;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import petstore.swagger.io.PetstoreAuth;
import petstore.swagger.io.petstoreauth.pet.Findbystatus;
import petstore.swagger.io.petstoreauth.pet.Findbytags;
import petstore.swagger.io.petstoreauth.pet.Uploadimage;

public class Pet
    extends DelegateTransfer<PetstoreAuth>
{
    public final Findbystatus findbystatus;
    public final Findbytags findbytags;
    public final Uploadimage uploadimage;

    public Pet(PetstoreAuth delegate) {
        super(delegate);
        findbystatus = new Findbystatus((delegate));
        findbytags = new Findbytags((delegate));
        uploadimage = new Uploadimage((delegate));
    }

    /**
     * Add a new pet to the store
     * 
     * <p>
     * </p>
     * 
     * @param body
     *     Pet object that needs to be added to the store
     */
    public void post(petstore.swagger.io.definitions.Pet body) {
        String url = ("https://petstore.swagger.io/v2/pet");
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        requestPost(url, null, content, Void.class);
    }

    /**
     * Update an existing pet
     * 
     * <p>
     * </p>
     * 
     * @param body
     *     Pet object that needs to be added to the store
     */
    public void put(petstore.swagger.io.definitions.Pet body) {
        String url = ("https://petstore.swagger.io/v2/pet");
        Map<String, Object> content = new HashMap<>();
        content.put("body", (body));
        requestPut(url, null, content, Void.class);
    }

    /**
     * Updates a pet in the store with form data
     * 
     * <p>
     * </p>
     * 
     * @param petId
     *     ID of pet that needs to be updated
     */
    public void postByPetId(long petId) {
        String url = ("https://petstore.swagger.io/v2/pet/{petId}".replace("{petId}", ""+petId));
        requestPost(url, null, null, Void.class);
    }

    /**
     * Deletes a pet
     * 
     * <p>
     * </p>
     * 
     * @param api_key
     * @param petId
     *     Pet id to delete
     */
    public void deleteByPetId(String api_key, long petId) {
        String url = ("https://petstore.swagger.io/v2/pet/{petId}".replace("{petId}", ""+petId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (api_key!= null) {
            headerProperties.put("api_key", (""+ api_key));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
