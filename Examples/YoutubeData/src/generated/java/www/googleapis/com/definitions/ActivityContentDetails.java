package www.googleapis.com.definitions;

public class ActivityContentDetails {
    /**
     * The bulletin object contains details about a channel bulletin post. This object is only present if the snippet.type is bulletin.
     */
    public ActivityContentDetailsBulletin bulletin;
    /**
     * The channelItem object contains details about a resource which was added to a channel. This property is only present if the snippet.type is channelItem.
     */
    public ActivityContentDetailsBulletin channelItem;
    /**
     * The comment object contains information about a resource that received a comment. This property is only present if the snippet.type is comment.
     */
    public ActivityContentDetailsBulletin comment;
    /**
     * The favorite object contains information about a video that was marked as a favorite video. This property is only present if the snippet.type is favorite.
     */
    public ActivityContentDetailsBulletin favorite;
    /**
     * The like object contains information about a resource that received a positive (like) rating. This property is only present if the snippet.type is like.
     */
    public ActivityContentDetailsBulletin like;
    /**
     * The playlistItem object contains information about a new playlist item. This property is only present if the snippet.type is playlistItem.
     */
    public ActivityContentDetailsPlaylistItem playlistItem;
    /**
     * The promotedItem object contains details about a resource which is being promoted. This property is only present if the snippet.type is promotedItem.
     */
    public ActivityContentDetailsPromotedItem promotedItem;
    /**
     * The recommendation object contains information about a recommended resource. This property is only present if the snippet.type is recommendation.
     */
    public ActivityContentDetailsRecommendation recommendation;
    /**
     * The social object contains details about a social network post. This property is only present if the snippet.type is social.
     */
    public ActivityContentDetailsSocial social;
    /**
     * The subscription object contains information about a channel that a user subscribed to. This property is only present if the snippet.type is subscription.
     */
    public ActivityContentDetailsBulletin subscription;
    /**
     * The upload object contains information about the uploaded video. This property is only present if the snippet.type is upload.
     */
    public ActivityContentDetailsUpload upload;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ActivityContentDetails othersame = ((ActivityContentDetails) other);
        if ((bulletin!= othersame.bulletin)&&((bulletin == null)||(!bulletin.equals(othersame.bulletin)))) {
            return false;
        }
        if ((channelItem!= othersame.channelItem)&&((channelItem == null)||(!channelItem.equals(othersame.channelItem)))) {
            return false;
        }
        if ((comment!= othersame.comment)&&((comment == null)||(!comment.equals(othersame.comment)))) {
            return false;
        }
        if ((favorite!= othersame.favorite)&&((favorite == null)||(!favorite.equals(othersame.favorite)))) {
            return false;
        }
        if ((like!= othersame.like)&&((like == null)||(!like.equals(othersame.like)))) {
            return false;
        }
        if ((playlistItem!= othersame.playlistItem)&&((playlistItem == null)||(!playlistItem.equals(othersame.playlistItem)))) {
            return false;
        }
        if ((promotedItem!= othersame.promotedItem)&&((promotedItem == null)||(!promotedItem.equals(othersame.promotedItem)))) {
            return false;
        }
        if ((recommendation!= othersame.recommendation)&&((recommendation == null)||(!recommendation.equals(othersame.recommendation)))) {
            return false;
        }
        if ((social!= othersame.social)&&((social == null)||(!social.equals(othersame.social)))) {
            return false;
        }
        if ((subscription!= othersame.subscription)&&((subscription == null)||(!subscription.equals(othersame.subscription)))) {
            return false;
        }
        if ((upload!= othersame.upload)&&((upload == null)||(!upload.equals(othersame.upload)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((bulletin == null)? 0 :bulletin.hashCode())+((channelItem == null)? 0 :channelItem.hashCode()))+((comment == null)? 0 :comment.hashCode()))+((favorite == null)? 0 :favorite.hashCode()))+((like == null)? 0 :like.hashCode()))+((playlistItem == null)? 0 :playlistItem.hashCode()))+((promotedItem == null)? 0 :promotedItem.hashCode()))+((recommendation == null)? 0 :recommendation.hashCode()))+((social == null)? 0 :social.hashCode()))+((subscription == null)? 0 :subscription.hashCode()))+((upload == null)? 0 :upload.hashCode()));
    }
}
