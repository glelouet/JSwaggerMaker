package www.googleapis.com.definitions;

import www.googleapis.com.structures.Moderationstatus;
import www.googleapis.com.structures.Viewerrating;

public class CommentSnippet {
    /**
     * The id of the author's YouTube channel, if any.
     */
    public Object authorChannelId;
    /**
     * Link to the author's YouTube channel, if any.
     */
    public String authorChannelUrl;
    /**
     * The name of the user who posted the comment.
     */
    public String authorDisplayName;
    /**
     * The URL for the avatar of the user who posted the comment.
     */
    public String authorProfileImageUrl;
    /**
     * Whether the current viewer can rate this comment.
     */
    public boolean canRate;
    /**
     * The id of the corresponding YouTube channel. In case of a channel comment this is the channel the comment refers to. In case of a video comment it's the video's channel.
     */
    public String channelId;
    /**
     * The total number of likes this comment has received.
     */
    public long likeCount;
    /**
     * The comment's moderation status. Will not be set if the comments were requested through the id filter.
     */
    public Moderationstatus moderationStatus;
    /**
     * The unique id of the parent comment, only set for replies.
     */
    public String parentId;
    /**
     * The date and time when the comment was orignally published. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String publishedAt;
    /**
     * The comment's text. The format is either plain text or HTML dependent on what has been requested. Even the plain text representation may differ from the text originally posted in that it may replace video links with video titles etc.
     */
    public String textDisplay;
    /**
     * The comment's original raw text as initially posted or last updated. The original text will only be returned if it is accessible to the viewer, which is only guaranteed if the viewer is the comment's author.
     */
    public String textOriginal;
    /**
     * The date and time when was last updated . The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String updatedAt;
    /**
     * The ID of the video the comment refers to, if any.
     */
    public String videoId;
    /**
     * The rating the viewer has given to this comment. For the time being this will never return RATE_TYPE_DISLIKE and instead return RATE_TYPE_NONE. This may change in the future.
     */
    public Viewerrating viewerRating;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        CommentSnippet othersame = ((CommentSnippet) other);
        if ((authorChannelId!= othersame.authorChannelId)&&((authorChannelId == null)||(!authorChannelId.equals(othersame.authorChannelId)))) {
            return false;
        }
        if ((authorChannelUrl!= othersame.authorChannelUrl)&&((authorChannelUrl == null)||(!authorChannelUrl.equals(othersame.authorChannelUrl)))) {
            return false;
        }
        if ((authorDisplayName!= othersame.authorDisplayName)&&((authorDisplayName == null)||(!authorDisplayName.equals(othersame.authorDisplayName)))) {
            return false;
        }
        if ((authorProfileImageUrl!= othersame.authorProfileImageUrl)&&((authorProfileImageUrl == null)||(!authorProfileImageUrl.equals(othersame.authorProfileImageUrl)))) {
            return false;
        }
        if (canRate!= othersame.canRate) {
            return false;
        }
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if (likeCount!= othersame.likeCount) {
            return false;
        }
        if ((moderationStatus!= othersame.moderationStatus)&&((moderationStatus == null)||(!moderationStatus.equals(othersame.moderationStatus)))) {
            return false;
        }
        if ((parentId!= othersame.parentId)&&((parentId == null)||(!parentId.equals(othersame.parentId)))) {
            return false;
        }
        if ((publishedAt!= othersame.publishedAt)&&((publishedAt == null)||(!publishedAt.equals(othersame.publishedAt)))) {
            return false;
        }
        if ((textDisplay!= othersame.textDisplay)&&((textDisplay == null)||(!textDisplay.equals(othersame.textDisplay)))) {
            return false;
        }
        if ((textOriginal!= othersame.textOriginal)&&((textOriginal == null)||(!textOriginal.equals(othersame.textOriginal)))) {
            return false;
        }
        if ((updatedAt!= othersame.updatedAt)&&((updatedAt == null)||(!updatedAt.equals(othersame.updatedAt)))) {
            return false;
        }
        if ((videoId!= othersame.videoId)&&((videoId == null)||(!videoId.equals(othersame.videoId)))) {
            return false;
        }
        if ((viewerRating!= othersame.viewerRating)&&((viewerRating == null)||(!viewerRating.equals(othersame.viewerRating)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((authorChannelId == null)? 0 :authorChannelId.hashCode())+((authorChannelUrl == null)? 0 :authorChannelUrl.hashCode()))+((authorDisplayName == null)? 0 :authorDisplayName.hashCode()))+((authorProfileImageUrl == null)? 0 :authorProfileImageUrl.hashCode()))+ Boolean.hashCode(canRate))+((channelId == null)? 0 :channelId.hashCode()))+ Long.hashCode(likeCount))+((moderationStatus == null)? 0 :moderationStatus.hashCode()))+((parentId == null)? 0 :parentId.hashCode()))+((publishedAt == null)? 0 :publishedAt.hashCode()))+((textDisplay == null)? 0 :textDisplay.hashCode()))+((textOriginal == null)? 0 :textOriginal.hashCode()))+((updatedAt == null)? 0 :updatedAt.hashCode()))+((videoId == null)? 0 :videoId.hashCode()))+((viewerRating == null)? 0 :viewerRating.hashCode()));
    }
}
