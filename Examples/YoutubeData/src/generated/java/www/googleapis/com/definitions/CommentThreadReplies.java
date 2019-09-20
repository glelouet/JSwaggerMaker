package www.googleapis.com.definitions;

public class CommentThreadReplies {
    /**
     * A limited number of replies. Unless the number of replies returned equals total_reply_count in the snippet the returned replies are only a subset of the total number of replies.
     */
    public Caption[] comments;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        CommentThreadReplies othersame = ((CommentThreadReplies) other);
        if ((comments!= othersame.comments)&&((comments == null)||(!comments.equals(othersame.comments)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((comments == null)? 0 :comments.hashCode());
    }
}
