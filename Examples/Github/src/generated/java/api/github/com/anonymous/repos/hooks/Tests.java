package api.github.com.anonymous.repos.hooks;

import java.util.HashMap;
import api.github.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tests
    extends DelegateTransfer<Anonymous>
{

    public Tests(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Test a push hook.
     * This will trigger the hook with the latest push to the current repository
     * if the hook is subscribed to push events. If the hook is not subscribed
     * to push events, the server will respond with 204 but no test POST will
     * be generated.
     * Note: Previously /repos/:owner/:repo/hooks/:id/tes
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param hookId
     *     Id of hook.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void postByOwnerRepoHookId(String owner,
        String repo,
        long hookId,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/hooks/{hookId}/tests".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{hookId}", ""+hookId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestPost(url, headerProperties, null, Void.class);
    }
}
