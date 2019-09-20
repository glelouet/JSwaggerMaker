package www.googleapis.com.definitions;

public class CommentThreadSnippet {
    /**
     * Whether the current viewer of the thread can reply to it. This is viewer specific - other viewers may see a different value for this field.
     */
    public boolean canReply;
    /**
     * The YouTube channel the comments in the thread refer to or the channel with the video the comments refer to. If video_id isn't set the comments refer to the channel itself.
     */
    public String channelId;
    /**
     * Whether the thread (and therefore all its comments) is visible to all YouTube users.
     */
    public boolean isPublic;
    /**
     * The top level comment of this thread.
     */
    public Caption topLevelComment;
    /**
     * The total number of replies (not including the top level comment).
     */
    public long totalReplyCount;
    /**
     * The ID of the video the comments refer to, if any. No video_id implies a channel discussion comment.
     */
    public String videoId;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        CommentThreadSnippet othersame = ((CommentThreadSnippet) other);
        if (canReply!= othersame.canReply) {
            return false;
        }
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if (isPublic!= othersame.isPublic) {
            return false;
        }
        if ((topLevelComment!= othersame.topLevelComment)&&((topLevelComment == null)||(!topLevelComment.equals(othersame.topLevelComment)))) {
            return false;
        }
        if (totalReplyCount!= othersame.totalReplyCount) {
            return false;
        }
        if ((videoId!= othersame.videoId)&&((videoId == null)||(!videoId.equals(othersame.videoId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(canReply)+((channelId == null)? 0 :channelId.hashCode()))+ Boolean.hashCode(isPublic))+((topLevelComment == null)? 0 :topLevelComment.hashCode()))+ Long.hashCode(totalReplyCount))+((videoId == null)? 0 :videoId.hashCode()));
    }
}
