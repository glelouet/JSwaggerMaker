package api.github.com.anonymous.repos;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.anonymous.repos.issues.Comments;
import api.github.com.anonymous.repos.issues.Events;
import api.github.com.anonymous.repos.issues.Labels;
import api.github.com.definitions.Issue;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Issues
    extends DelegateTransfer<Anonymous>
{
    public final Comments comments;
    public final Events events;
    public final Labels labels;

    public Issues(Anonymous delegate) {
        super(delegate);
        comments = new Comments((delegate));
        events = new Events((delegate));
        labels = new Labels((delegate));
    }

    /**
     * 
     * <p>
     * List issues for a repository.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param filter
     *     Issues assigned to you / created by you / mentioning you / you're
     *     subscribed to updates for / All issues the authenticated user can see
     *     
     * @param state
     * @param labels
     *     String list of comma separated Label names. Example - bug,ui,@high.
     * @param sort
     * @param direction
     * @param since
     *     Optional string of a timestamp in ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
     *     Only issues updated at or after this time are returned.
     *     
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Issues[]> getByOwnerRepo(String owner,
        String repo,
        api.github.com.structures.filter filter,
        api.github.com.structures.state state,
        String labels,
        api.github.com.structures.sort sort,
        api.github.com.structures.direction direction,
        String since,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/issues".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(filter==null?"":"&filter="+flatten(filter))+(state==null?"":"&state="+flatten(state))+(labels==null?"":"&labels="+flatten(labels))+(sort==null?"":"&sort="+flatten(sort))+(direction==null?"":"&direction="+flatten(direction))+(since==null?"":"&since="+flatten(since)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Issues[].class);
    }

    /**
     * 
     * <p>
     * Create an issue.
     * Any user with pull access to a repository can create an issue.
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
    public Requested<Issue> postByOwnerRepo(String owner,
        String repo,
        String Accept,
        Issue body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/issues".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, Issue.class);
    }

    /**
     * 
     * <p>
     * Get a single issue
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param number
     *     Number of issue.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Issue> getByOwnerRepoNumber_(String owner,
        String repo,
        long number,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/issues/{number}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Issue.class);
    }
}
