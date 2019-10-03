package petstore.swagger.io;

import fr.lelouet.jswaggermaker.client.common.impl.securities.Oauth2;
import petstore.swagger.io.petstoreauth.Pet;


/**
 * access petstore.swagger.io with authorization type oauth2.
 */
public class PetstoreAuth
    extends Oauth2
{
    public static final String[] SCOPES = new String[] {"write:pets", "read:pets"};
    public final Pet pet = new Pet(this);

    public PetstoreAuth(String refreshToken, String basicAuth) {
        super(refreshToken, basicAuth, "https://petstore.swagger.io/oauth/authorize");
    }
}
