package petstore.swagger.io.petstoreauth.pet;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import petstore.swagger.io.PetstoreAuth;
import petstore.swagger.io.definitions.ApiResponse;

public class Uploadimage
    extends DelegateTransfer<PetstoreAuth>
{

    public Uploadimage(PetstoreAuth delegate) {
        super(delegate);
    }

    /**
     * uploads an image
     * 
     * <p>
     * </p>
     * 
     * @param petId
     *     ID of pet to update
     */
    public Requested<ApiResponse> postByPetId(long petId) {
        String url = ("https://petstore.swagger.io/v2/pet/{petId}/uploadImage".replace("{petId}", ""+petId));
        return requestPost(url, null, null, ApiResponse.class);
    }
}
