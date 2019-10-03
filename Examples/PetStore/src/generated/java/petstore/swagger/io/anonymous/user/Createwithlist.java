package petstore.swagger.io.anonymous.user;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import petstore.swagger.io.Anonymous;
import petstore.swagger.io.definitions.User;

public class Createwithlist
    extends DelegateTransfer<Anonymous>
{

    public Createwithlist(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Creates list of users with given input array
     * 
     * <p>
     * </p>
     * 
     * @param body
     *     List of user object
     */
    public void post(User[] body) {
        String url = ("https://petstore.swagger.io/v2/user/createWithList");
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        requestPost(url, null, content, Void.class);
    }
}
