package api.github.com.anonymous.repos.issues;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.CommentBody;
import api.github.com.definitions.IssuesComment;
import api.github.com.definitions.IssuesComments;
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
     * List comments in a repository.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param direction
     *     Ignored without 'sort' parameter.
     * @param sort
     *     
     * @param since
     *     The time should be passed in as UTC in the ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
     *     Example: "2012-10-09T23:39:01Z".
     *     
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<IssuesComments[]> getByOwnerRepo(String owner,
        String repo,
        String direction,
        api.github.com.structures.sort sort,
        String since,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/issues/comments".replace("{owner}", ""+owner).replace("{repo}", ""+repo)+"?"+(direction==null?"":"&direction="+flatten(direction))+(sort==null?"":"&sort="+flatten(sort))+(since==null?"":"&since="+flatten(since)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, IssuesComments[].class);
    }

    /**
     * 
     * <p>
     * Get a single comment.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param commentId
     *     ID of comment.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<IssuesComment> getByOwnerRepoCommentId(String owner,
        String repo,
        long commentId,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/issues/comments/{commentId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{commentId}", ""+commentId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, IssuesComment.class);
    }

    /**
     * 
     * <p>
     * Delete a comment.
     * </p>
     * 
     * @param owner
     *     Name of repository owner.
     * @param repo
     *     Name of repository.
     * @param commentId
     *     ID of comment.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByOwnerRepoCommentId(String owner,
        String repo,
        long commentId,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/issues/comments/{commentId}".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{commentId}", ""+commentId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }

    /**
     * 
     * <p>
     * List comments on an issue.
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
    public Requested<IssuesComments[]> getByOwnerRepoNumber_(String owner,
        String repo,
        long number,
        String Accept) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/issues/{number}/comments".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, IssuesComments[].class);
    }

    /**
     * 
     * <p>
     * Create a comment.
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
     * @param body
     */
    public Requested<IssuesComment> postByOwnerRepoNumber_(String owner,
        String repo,
        long number,
        String Accept,
        CommentBody body) {
        String url = ("https://api.github.com//repos/{owner}/{repo}/issues/{number}/comments".replace("{owner}", ""+owner).replace("{repo}", ""+repo).replace("{number}", ""+number));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, IssuesComment.class);
    }
}
