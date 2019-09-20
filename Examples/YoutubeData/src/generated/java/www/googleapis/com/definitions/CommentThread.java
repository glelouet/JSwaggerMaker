package www.googleapis.com.definitions;

public class CommentThread {
    /**
     * Etag of this resource.
     */
    public String etag;
    /**
     * The ID that YouTube uses to uniquely identify the comment thread.
     */
    public String id;
    /**
     * Identifies what kind of resource this is. Value: the fixed string "youtube#commentThread".
     */
    public String kind;
    /**
     * The replies object contains a limited number of replies (if any) to the top level comment found in the snippet.
     */
    public CommentThreadReplies replies;
    /**
     * The snippet object contains basic details about the comment thread and also the top level comment.
     */
    public CommentThreadSnippet snippet;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        CommentThread othersame = ((CommentThread) other);
        if ((etag!= othersame.etag)&&((etag == null)||(!etag.equals(othersame.etag)))) {
            return false;
        }
        if ((id!= othersame.id)&&((id == null)||(!id.equals(othersame.id)))) {
            return false;
        }
        if ((kind!= othersame.kind)&&((kind == null)||(!kind.equals(othersame.kind)))) {
            return false;
        }
        if ((replies!= othersame.replies)&&((replies == null)||(!replies.equals(othersame.replies)))) {
            return false;
        }
        if ((snippet!= othersame.snippet)&&((snippet == null)||(!snippet.equals(othersame.snippet)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((etag == null)? 0 :etag.hashCode())+((id == null)? 0 :id.hashCode()))+((kind == null)? 0 :kind.hashCode()))+((replies == null)? 0 :replies.hashCode()))+((snippet == null)? 0 :snippet.hashCode()));
    }
}
