package api.github.com.anonymous.gists;

import java.util.HashMap;
import java.util.Map;
import api.github.com.Anonymous;
import api.github.com.definitions.Comment;
import api.github.com.definitions.CommentBody;
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
     * List comments on a gist.
     * </p>
     * 
     * @param id
     *     Id of gist.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<api.github.com.definitions.Comments[]> getById(long id, String Accept) {
        String url = ("https://api.github.com//gists/{id}/comments".replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, api.github.com.definitions.Comments[].class);
    }

    /**
     * 
     * <p>
     * Create a commen
     * </p>
     * 
     * @param id
     *     Id of gist.
     * @param Accept
     *     Is used to set specified media type.
     * @param body
     */
    public Requested<Comment> postById(long id, String Accept, CommentBody body) {
        String url = ("https://api.github.com//gists/{id}/comments".replace("{id}", ""+id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        Map<String, Object> content = new HashMap<>();
        content.put("body", body);
        return requestPost(url, headerProperties, content, Comment.class);
    }

    /**
     * 
     * <p>
     * Get a single comment.
     * </p>
     * 
     * @param id
     *     Id of gist.
     * @param commentId
     *     Id of comment.
     * @param Accept
     *     Is used to set specified media type.
     */
    public Requested<Comment> getByIdCommentId(long id, long commentId, String Accept) {
        String url = ("https://api.github.com//gists/{id}/comments/{commentId}".replace("{id}", ""+id).replace("{commentId}", ""+commentId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        return requestGet(url, headerProperties, Comment.class);
    }

    /**
     * 
     * <p>
     * Delete a comment.
     * </p>
     * 
     * @param id
     *     Id of gist.
     * @param commentId
     *     Id of comment.
     * @param Accept
     *     Is used to set specified media type.
     */
    public void deleteByIdCommentId(long id, long commentId, String Accept) {
        String url = ("https://api.github.com//gists/{id}/comments/{commentId}".replace("{id}", ""+id).replace("{commentId}", ""+commentId));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (Accept!= null) {
            headerProperties.put("Accept", (""+ Accept));
        }
        requestDel(url, headerProperties, Void.class);
    }
}
