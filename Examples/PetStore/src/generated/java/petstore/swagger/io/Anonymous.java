package petstore.swagger.io;

import java.util.HashMap;
import java.util.Map;
import fr.lelouet.jswaggermaker.client.common.impl.securities.Disconnected;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;


/**
 * access petstore.swagger.io with no authorization.
 */
public class Anonymous
    extends Disconnected
{
    public final Anonymous.Store store = new Anonymous.Store();
    public final Anonymous.User user = new Anonymous.User();

    public class Store {
        public final Anonymous.Store.Order order = new Anonymous.Store.Order();

        public class Order {

            /**
             * Place an order for a pet
             * <p>
             * </p>
             * 
             * @param body
             *     order placed for purchasing the pet
             */
            public Requested<petstore.swagger.io.definitions.Order> post(petstore.swagger.io.definitions.Order body) {
                String url = ("https://petstore.swagger.io/v2/store/order");
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                return requestPost(url, null, content, petstore.swagger.io.definitions.Order.class);
            }

            /**
             * Find purchase order by ID
             * <p>
             * For valid response try integer IDs with value >= 1 and <= 10. Other values will generated exceptions
             * </p>
             * 
             * @param orderId
             *     ID of pet that needs to be fetched
             */
            public Requested<petstore.swagger.io.definitions.Order> getByOrderid(long orderId) {
                String url = ("https://petstore.swagger.io/v2/store/order/{orderId}".replace("{orderId}", ""+orderId));
                return requestGet(url, null, petstore.swagger.io.definitions.Order.class);
            }

            /**
             * Delete purchase order by ID
             * <p>
             * For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors
             * </p>
             * 
             * @param orderId
             *     ID of the order that needs to be deleted
             */
            public void deleteByOrderid(long orderId) {
                String url = ("https://petstore.swagger.io/v2/store/order/{orderId}".replace("{orderId}", ""+orderId));
                requestDel(url, null);
            }
        }
    }

    public class User {
        public final Anonymous.User.Createwitharray createwitharray = new Anonymous.User.Createwitharray();
        public final Anonymous.User.Createwithlist createwithlist = new Anonymous.User.Createwithlist();
        public final Anonymous.User.Login login = new Anonymous.User.Login();
        public final Anonymous.User.Logout logout = new Anonymous.User.Logout();

        /**
         * Create user
         * <p>
         * This can only be done by the logged in user.
         * </p>
         * 
         * @param body
         *     Created user object
         */
        public void post(petstore.swagger.io.definitions.User body) {
            String url = ("https://petstore.swagger.io/v2/user");
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            requestPost(url, null, content, Void.class);
        }

        /**
         * Get user by user name
         * <p>
         * </p>
         * 
         * @param username
         *     The name that needs to be fetched. Use user1 for testing. 
         */
        public Requested<petstore.swagger.io.definitions.User> getByUsername(String username) {
            String url = ("https://petstore.swagger.io/v2/user/{username}".replace("{username}", ""+username));
            return requestGet(url, null, petstore.swagger.io.definitions.User.class);
        }

        /**
         * Updated user
         * <p>
         * This can only be done by the logged in user.
         * </p>
         * 
         * @param username
         *     name that need to be updated
         * @param body
         *     Updated user object
         */
        public void putByUsername(String username, petstore.swagger.io.definitions.User body) {
            String url = ("https://petstore.swagger.io/v2/user/{username}".replace("{username}", ""+username));
            Map<String, Object> content = new HashMap<>();
            content.put("body", body);
            requestPut(url, null, content);
        }

        /**
         * Delete user
         * <p>
         * This can only be done by the logged in user.
         * </p>
         * 
         * @param username
         *     The name that needs to be deleted
         */
        public void deleteByUsername(String username) {
            String url = ("https://petstore.swagger.io/v2/user/{username}".replace("{username}", ""+username));
            requestDel(url, null);
        }

        public class Createwitharray {

            /**
             * Creates list of users with given input array
             * <p>
             * </p>
             * 
             * @param body
             *     List of user object
             */
            public void post(petstore.swagger.io.definitions.User[] body) {
                String url = ("https://petstore.swagger.io/v2/user/createWithArray");
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                requestPost(url, null, content, Void.class);
            }
        }

        public class Createwithlist {

            /**
             * Creates list of users with given input array
             * <p>
             * </p>
             * 
             * @param body
             *     List of user object
             */
            public void post(petstore.swagger.io.definitions.User[] body) {
                String url = ("https://petstore.swagger.io/v2/user/createWithList");
                Map<String, Object> content = new HashMap<>();
                content.put("body", body);
                requestPost(url, null, content, Void.class);
            }
        }

        public class Login {

            /**
             * Logs user into the system
             * <p>
             * </p>
             * 
             * @param username
             *     The user name for login
             * @param password
             *     The password for login in clear text
             */
            public Requested<String> get(String username, String password) {
                String url = ("https://petstore.swagger.io/v2/user/login"+"?"+(username==null?"":"&username="+flatten(username))+(password==null?"":"&password="+flatten(password)));
                return requestGet(url, null, String.class);
            }
        }

        public class Logout {

            /**
             * Logs out current logged in user session
             * <p>
             * </p>
             */
            public void get() {
                String url = ("https://petstore.swagger.io/v2/user/logout");
                requestGet(url, null, Void.class);
            }
        }
    }
}
