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
public class petstore_auth
    extends Oauth2
{
    public static final String[] SCOPES = new String[] {"write:pets", "read:pets"};

    public petstore_auth(String refreshToken, String basicAuth) {
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
    public void addPet(Pet body, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/pet");
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        requestPost(url, properties, content, Void.class);
    }

    /**
     * Update an existing pet
     * <p>
     * </p>
     * 
     * @param body
     *     Pet object that needs to be added to the store
     */
    public void updatePet(Pet body, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/pet");
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        requestPut(url, properties, content);
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
    public Requested<Pet[]> findPetsByStatus(String[] status, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/pet/findByStatus"+"?"+(status==null?"":"&status="+flatten(status)));
        return requestGet(url, properties, Pet[].class);
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
    public Requested<Pet[]> findPetsByTags(String[] tags, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/pet/findByTags"+"?"+(tags==null?"":"&tags="+flatten(tags)));
        return requestGet(url, properties, Pet[].class);
    }

    /**
     * Updates a pet in the store with form data
     * <p>
     * </p>
     * 
     * @param petId
     *     ID of pet that needs to be updated
     */
    public void updatePetWithForm(long petId, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/pet/{petId}".replace("{petId}", ""+petId));
        requestPost(url, properties, null, Void.class);
    }

    /**
     * Deletes a pet
     * <p>
     * </p>
     * 
     * @param petId
     *     Pet id to delete
     */
    public void deletePet(long petId, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/pet/{petId}".replace("{petId}", ""+petId));
        requestDel(url, properties);
    }

    /**
     * uploads an image
     * <p>
     * </p>
     * 
     * @param petId
     *     ID of pet to update
     */
    public Requested<ApiResponse> uploadFile(long petId, Map<String, String> properties) {
        String url = ("https://petstore.swagger.io/v2/pet/{petId}/uploadImage".replace("{petId}", ""+petId));
        return requestPost(url, properties, null, ApiResponse.class);
    }
}
