package petstore.swagger.io.petstoreauth.pet;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import petstore.swagger.io.PetstoreAuth;
import petstore.swagger.io.definitions.Pet;

public class Findbytags
    extends DelegateTransfer<PetstoreAuth>
{

    public Findbytags(PetstoreAuth delegate) {
        super(delegate);
    }

    /**
     * Finds Pets by tags
     * 
     * <p>
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * </p>
     * 
     * @param tags
     *     Tags to filter by
     */
    public Requested<Pet[]> get(String[] tags) {
        String url = ("https://petstore.swagger.io/v2/pet/findByTags"+"?"+(tags==null?"":"&tags="+flatten(tags)));
        return requestGet(url, null, Pet[].class);
    }
}
