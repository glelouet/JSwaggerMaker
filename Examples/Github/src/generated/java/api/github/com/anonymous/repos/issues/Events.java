package api.github.com.anonymous.repos.issues;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.IssueEvent;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Events
    extends DelegateTransfer<Anonymous>
{

    public Events(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List issue events for a repository.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<IssueEvent[]> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/issues/events".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, IssueEvent[].class);
    }

    /**
     * 
     * <p>
     * Get a single event.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param eventId
     *     Id of the event.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<IssueEvent> getByOwnerRepoEventId(String owner,
        String repo,
        long eventId,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/issues/events/{eventId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{eventId}", ""+eventId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, IssueEvent.class);
    }

    /**
     * 
     * <p>
     * List events for an issue.
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
    public Requested<IssueEvent[]> getByOwnerRepoNumber_(String owner,
        String repo,
        long number,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/issues/{number}/events".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, IssueEvent[].class);
    }
}
