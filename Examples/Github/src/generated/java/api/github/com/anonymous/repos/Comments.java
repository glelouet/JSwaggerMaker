package api.github.com.anonymous.repos;

import java.util.HashMap;
import api.github.com.Anonymous;
import api.github.com.definitions.CommitComment;
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
     * List commit comments for a repository.
     * Comments are ordered by ascending ID.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<RepoComments[]> getByOwnerRepo(String owner, String repo, String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/comments".replace("{owner}", ""+owner).replace("{repo}", ""+repo));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, RepoComments[].class);
    }

    /**
     * 
     * <p>
     * Get a single commit comment.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param commentId
     *     Id of comment.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<CommitComment> getByOwnerRepoCommentId(String owner,
        String repo,
        long commentId,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/comments/{commentId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{commentId}", ""+commentId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, CommitComment.class);
    }

    /**
     * 
     * <p>
     * Delete a commit comment
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param commentId
     *     Id of comment.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByOwnerRepoCommentId(String owner,
        String repo,
        long commentId,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/comments/{commentId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{commentId}", ""+commentId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
