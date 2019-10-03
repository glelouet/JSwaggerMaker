package api.github.com.anonymous.repos.commits;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.CommitComment;
import api.github.com.definitions.CommitCommentBody;
import api.github.com.definitions.RepoComments;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Comments
    extends DelegateTransfer<Anonymous>
{

    public Comments(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * List comments for a single commitList comments for a single commit.
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
    public Requested<RepoComments[]> getByOwnerRepoShaCode(String owner,
        String repo,
        String shaCode,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/commits/{shaCode}/comments".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{shaCode}", ""+shaCode));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, RepoComments[].class);
    }

    /**
     * 
     * <p>
     * Create a commit comment.
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
     * @param body
     */
    public Requested<CommitComment> postByOwnerRepoShaCode(String owner,
        String repo,
        String shaCode,
        String Accept,
        CommitCommentBody body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/commits/{shaCode}/comments".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{shaCode}", ""+shaCode));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, CommitComment.class);
    }
}
