package wft_geo_db.p.mashape.com;

import fr.lelouet.jswaggermaker.client.common.impl.securities.APIKey;
import io.swagger.models.auth.In;
import wft_geo_db.p.mashape.com.usersecurity.V1;


/**
 * access wft-geo-db.p.mashape.com with authorization type apiKey.
 */
public class UserSecurity
    extends APIKey
{
    public static final String[] SCOPES = new String[] { };
    public final V1 v1 = new V1(this);

    public UserSecurity(String key) {
        super(key, "X-Mashape-Key", In.HEADER);
    }
}
