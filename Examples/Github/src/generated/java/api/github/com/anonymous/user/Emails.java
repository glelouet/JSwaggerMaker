package api.github.com.anonymous.user;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Emails
    extends DelegateTransfer<Anonymous>
{

    public Emails(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List email addresses for a user.
     * In the final version of the API, this method will return an array of hashes
     * with extended information for each email address indicating if the address
     * has been verified and if it's primary email address for GitHub.
     * Until API v3 is finalized, use the application/vnd.github.v3 media type to
     * get other response format.
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<String[]> get(String Accept) {
        String url = ("https://api.github.com//user/emails");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, String[].class);
    }

    /**
     * 
     * <p>
     * Add email address(es).
     * You can post a single email address or an array of addresses.
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public void post(String Accept, String[] body) {
        String url = ("https://api.github.com//user/emails");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        requestPost(url, headerProperties, content, Void.class);
    }

    /**
     * 
     * <p>
     * Delete email address(es).
     * You can include a single email address or an array of addresses.
     * </p>
     * 
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public void delete(String Accept, String[] body) {
        String url = ("https://api.github.com//user/emails");
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
