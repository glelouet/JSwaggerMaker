package petstore.swagger.io;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.securities.Oauth2;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import petstore.swagger.io.definitions.ApiResponse;
import petstore.swagger.io.definitions.Pet;


/**
 * access petstore.swagger.io with authorization type oauth2.
 */
public class PetstoreAuth
    extends Oauth2
{
    public static final String[] SCOPES = new String[] {"write:pets", "read:pets"};

    public PetstoreAuth(String refreshToken, String basicAuth) {
        super(refreshToken, basicAuth, "https://petstore.swagger.io/oauth/authorize");
    }

    /**
     * Add a new pet to the store
     * <p>
     * </p>
     * 
     * @param body
     *     Pet object that needs to be added to the store
     */
    public void addPet(Pet body) {
        String url = ("https://petstore.swagger.io/v2/pet");
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        requestPost(url, null, content, Void.class);
    }

    /**
     * Update an existing pet
     * <p>
     * </p>
     * 
     * @param body
     *     Pet object that needs to be added to the store
     */
    public void updatePet(Pet body) {
        String url = ("https://petstore.swagger.io/v2/pet");
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        requestPut(url, null, content);
    }

    /**
     * Finds Pets by status
     * <p>
     * Multiple status values can be provided with comma separated strings
     * </p>
     * 
     * @param status
     *     Status values that need to be considered for filter
     */
    public Requested<Pet[]> findPetsByStatus(String[] status) {
        String url = ("https://petstore.swagger.io/v2/pet/findByStatus"+"?"+(status==null?"":"&status="+flatten(status)));
        return requestGet(url, null, Pet[].class);
    }

    /**
     * Finds Pets by tags
     * <p>
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * </p>
     * 
     * @param tags
     *     Tags to filter by
     */
    public Requested<Pet[]> findPetsByTags(String[] tags) {
        String url = ("https://petstore.swagger.io/v2/pet/findByTags"+"?"+(tags==null?"":"&tags="+flatten(tags)));
        return requestGet(url, null, Pet[].class);
    }

    /**
     * Updates a pet in the store with form data
     * <p>
     * </p>
     * 
     * @param petId
     *     ID of pet that needs to be updated
     */
    public void updatePetWithForm(long petId) {
        String url = ("https://petstore.swagger.io/v2/pet/{petId}".replace("{petId}", ""+petId));
        requestPost(url, null, null, Void.class);
    }

    /**
     * Deletes a pet
     * <p>
     * </p>
     * 
     * @param api_key
     * @param petId
     *     Pet id to delete
     */
    public void deletePet(String api_key, long petId) {
        String url = ("https://petstore.swagger.io/v2/pet/{petId}".replace("{petId}", ""+petId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (api_key!= null) {
            headerProperties.put("api_key", (""+ api_key));
        }
        requestDel(url, headerProperties);
    }

    /**
     * uploads an image
     * <p>
     * </p>
     * 
     * @param petId
     *     ID of pet to update
     */
    public Requested<ApiResponse> uploadFile(long petId) {
        String url = ("https://petstore.swagger.io/v2/pet/{petId}/uploadImage".replace("{petId}", ""+petId));
        return requestPost(url, null, null, ApiResponse.class);
    }
}
