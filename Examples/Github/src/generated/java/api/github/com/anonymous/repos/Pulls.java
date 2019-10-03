package api.github.com.anonymous.repos;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.anonymous.repos.pulls.Comments;
import api.github.com.anonymous.repos.pulls.Commits;
import api.github.com.anonymous.repos.pulls.Files;
import api.github.com.anonymous.repos.pulls.Merge;
import api.github.com.definitions.PullRequest;
import api.github.com.definitions.PullsPost;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Pulls
    extends DelegateTransfer<Anonymous>
{
    public final Comments comments;
    public final Commits commits;
    public final Files files;
    public final Merge merge;

    public Pulls(Anonymous delegate) {
        super(delegate);
        comments = new Comments((delegate));
        commits = new Commits((delegate));
        files = new Files((delegate));
        merge = new Merge((delegate));
    }

    /**
     * 
     * <p>
     * List pull requests.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param state
     *     String to filter by state.
     * @param head
     *     Filter pulls by head user and branch name in the format of 'user:ref-name'.
     *     Example: github:new-script-format.
     *     
     * @param base
     *     Filter pulls by base branch name. Example - gh-pages.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Pulls[]> getByOwnerRepo(String owner,
        String repo,
        api.github.com.structures.state state,
        String head,
        String base,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/pulls".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(state==null?"":"&state="+flatten(state))+(head==null?"":"&head="+flatten(head))+(base==null?"":"&base="+flatten(base)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Pulls[].class);
    }

    /**
     * 
     * <p>
     * Create a pull request.
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
    public Requested<api.github.com.definitions.Pulls[]> postByOwnerRepo(String owner,
        String repo,
        String Accept,
        PullsPost body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/pulls".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, api.github.com.definitions.Pulls[].class);
    }

    /**
     * 
     * <p>
     * Get a single pull request.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param number
     *     Id of pull.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<PullRequest> getByOwnerRepoNumber_(String owner,
        String repo,
        long number,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/pulls/{number}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, PullRequest.class);
    }
}
