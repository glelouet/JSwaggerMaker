package api.github.com.anonymous.repos.git;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.GitCommit;
import api.github.com.definitions.RepoCommit;
import api.github.com.definitions.RepoCommitBody;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Commits
    extends DelegateTransfer<Anonymous>
{

    public Commits(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Create a Commit.
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
    public Requested<GitCommit> postByOwnerRepo(String owner,
        String repo,
        String Accept,
        RepoCommitBody body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/git/commits".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, GitCommit.class);
    }

    /**
     * 
     * <p>
     * Get a Commit.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param shaCode
     *     SHA-1 code.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<RepoCommit> getByOwnerRepoShaCode(String owner,
        String repo,
        String shaCode,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/git/commits/{shaCode}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{shaCode}", ""+shaCode));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, RepoCommit.class);
    }
}
