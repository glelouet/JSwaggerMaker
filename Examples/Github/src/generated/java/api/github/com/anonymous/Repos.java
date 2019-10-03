package api.github.com.anonymous;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.anonymous.repos.Assignees;
import api.github.com.anonymous.repos.Branches;
import api.github.com.anonymous.repos.Collaborators;
import api.github.com.anonymous.repos.Comments;
import api.github.com.anonymous.repos.Commits;
import api.github.com.anonymous.repos.Compare;
import api.github.com.anonymous.repos.Contents;
import api.github.com.anonymous.repos.Contributors;
import api.github.com.anonymous.repos.Deployments;
import api.github.com.anonymous.repos.Downloads;
import api.github.com.anonymous.repos.Events;
import api.github.com.anonymous.repos.Forks;
import api.github.com.anonymous.repos.Git;
import api.github.com.anonymous.repos.Hooks;
import api.github.com.anonymous.repos.Issues;
import api.github.com.anonymous.repos.Keys;
import api.github.com.anonymous.repos.Labels;
import api.github.com.anonymous.repos.Languages;
import api.github.com.anonymous.repos.Merges;
import api.github.com.anonymous.repos.Milestones;
import api.github.com.anonymous.repos.Notifications;
import api.github.com.anonymous.repos.Pulls;
import api.github.com.anonymous.repos.Readme;
import api.github.com.anonymous.repos.Releases;
import api.github.com.anonymous.repos.Stargazers;
import api.github.com.anonymous.repos.Stats;
import api.github.com.anonymous.repos.Statuses;
import api.github.com.anonymous.repos.Subscribers;
import api.github.com.anonymous.repos.Subscription;
import api.github.com.anonymous.repos.Tags;
import api.github.com.anonymous.repos.Teams;
import api.github.com.anonymous.repos.Watchers;
import api.github.com.definitions.Repo;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Repos
    extends DelegateTransfer<Anonymous>
{
    public final Assignees assignees;
    public final Branches branches;
    public final Collaborators collaborators;
    public final Comments comments;
    public final Commits commits;
    public final Compare compare;
    public final Contents contents;
    public final Contributors contributors;
    public final Deployments deployments;
    public final Downloads downloads;
    public final Events events;
    public final Forks forks;
    public final Git git;
    public final Hooks hooks;
    public final Issues issues;
    public final Keys keys;
    public final Labels labels;
    public final Languages languages;
    public final Merges merges;
    public final Milestones milestones;
    public final Notifications notifications;
    public final Pulls pulls;
    public final Readme readme;
    public final Releases releases;
    public final Stargazers stargazers;
    public final Stats stats;
    public final Statuses statuses;
    public final Subscribers subscribers;
    public final Subscription subscription;
    public final Tags tags;
    public final Teams teams;
    public final Watchers watchers;

    public Repos(Anonymous delegate) {
        super(delegate);
        assignees = new Assignees((delegate));
        branches = new Branches((delegate));
        collaborators = new Collaborators((delegate));
        comments = new Comments((delegate));
        commits = new Commits((delegate));
        compare = new Compare((delegate));
        contents = new Contents((delegate));
        contributors = new Contributors((delegate));
        deployments = new Deployments((delegate));
        downloads = new Downloads((delegate));
        events = new Events((delegate));
        forks = new Forks((delegate));
        git = new Git((delegate));
        hooks = new Hooks((delegate));
        issues = new Issues((delegate));
        keys = new Keys((delegate));
        labels = new Labels((delegate));
        languages = new Languages((delegate));
        merges = new Merges((delegate));
        milestones = new Milestones((delegate));
        notifications = new Notifications((delegate));
        pulls = new Pulls((delegate));
        readme = new Readme((delegate));
        releases = new Releases((delegate));
        stargazers = new Stargazers((delegate));
        stats = new Stats((delegate));
        statuses = new Statuses((delegate));
        subscribers = new Subscribers((delegate));
        subscription = new Subscription((delegate));
        tags = new Tags((delegate));
        teams = new Teams((delegate));
        watchers = new Watchers((delegate));
    }

    /**
     * 
     * <p>
     * Get repository.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Repo> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Repo.class);
    }

    /**
     * 
     * <p>
     * Delete a Repository.
     * Deleting a repository requires admin access. If OAuth is used, the delete_repo
     * scope is required.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }

    /**
     * 
     * <p>
     * Get archive link.
     * This method will return a 302 to a URL to download a tarball or zipball
     * archive for a repository. Please make sure your HTTP framework is
     * configured to follow redirects or you will need to use the Location header
     * to make a second GET request.
     * Note: For private repositories, these links are temporary and expire quickly.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param archive_format
     * @param path
     *     Valid Git reference, defaults to 'master'.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void getByOwnerRepoArchiveFormatPath(String owner,
        String repo,
        api.github.com.structures.archive_format archive_format,
        String path,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/{archive_format}/{path}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{archive_format}", ""+archive_format).replace("{path}", ""+path));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestGet(url, headerProperties, Void.class);
    }
}
