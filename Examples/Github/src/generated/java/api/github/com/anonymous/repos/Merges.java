package api.github.com.anonymous.repos;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.MergesBody;
import api.github.com.definitions.MergesSuccessful;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Merges
    extends DelegateTransfer<Anonymous>
{

    public Merges(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Perform a merge.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<MergesSuccessful> postByOwnerRepo(String owner,
        String repo,
        String Accept,
        MergesBody body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/merges".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, MergesSuccessful.class);
    }
}
