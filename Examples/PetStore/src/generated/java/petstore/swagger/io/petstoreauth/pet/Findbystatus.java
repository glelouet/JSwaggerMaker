package petstore.swagger.io.petstoreauth.pet;

import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import petstore.swagger.io.PetstoreAuth;
import petstore.swagger.io.definitions.Pet;

public class Findbystatus
    extends DelegateTransfer<PetstoreAuth>
{

    public Findbystatus(PetstoreAuth delegate) {
        super(delegate);
    }

    /**
     * Finds Pets by status
     * 
     * <p>
     * Multiple status values can be provided with comma separated strings
     * </p>
     * 
     * @param status
     *     Status values that need to be considered for filter
     */
    public Requested<Pet[]> get(String[] status) {
        String url = ("https://petstore.swagger.io/v2/pet/findByStatus"+"?"+(status==null?"":"&status="+flatten(status)));
        return requestGet(url, null, Pet[].class);
    }
}
