package api.github.com.anonymous.repos;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.anonymous.repos.commits.Comments;
import api.github.com.anonymous.repos.commits.Status;
import api.github.com.definitions.Commit;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Commits
    extends DelegateTransfer<Anonymous>
{
    public final Status status;
    public final Comments comments;

    public Commits(Anonymous delegate) {
        super(delegate);
        status = new Status((delegate));
        comments = new Comments((delegate));
    }

    /**
     * 
     * <p>
     * List commits on a repository.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param since
     *     The time should be passed in as UTC in the ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
     *     Example: "2012-10-09T23:39:01Z".
     *     
     * @param sha
     *     Sha or branch to start listing commits from.
     * @param path
     *     Only commits containing this file path will be returned.
     * @param author
     *     GitHub login, name, or email by which to filter by commit author.
     * @param until
     *     ISO 8601 Date - Only commits before this date will be returned.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Commits[]> getByOwnerRepo(String owner,
        String repo,
        String since,
        String sha,
        String path,
        String author,
        String until,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/commits".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(since==null?"":"&since="+flatten(since))+(sha==null?"":"&sha="+flatten(sha))+(path==null?"":"&path="+flatten(path))+(author==null?"":"&author="+flatten(author))+(until==null?"":"&until="+flatten(until)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Commits[].class);
    }

    /**
     * 
     * <p>
     * Get a single commit.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param shaCode
     *     SHA-1 code of the commit.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Commit> getByOwnerRepoShaCode(String owner,
        String repo,
        String shaCode,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/commits/{shaCode}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{shaCode}", ""+shaCode));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Commit.class);
    }
}
