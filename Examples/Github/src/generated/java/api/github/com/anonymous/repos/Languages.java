package api.github.com.anonymous.repos;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Languages
    extends DelegateTransfer<Anonymous>
{

    public Languages(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List languages.
     * List languages for the specified repository. The value on the right of a
     * language is the number of bytes of code written in that language.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Map<String, Long>> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/languages".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGetMap(url, headerProperties, Long.class);
    }
}
