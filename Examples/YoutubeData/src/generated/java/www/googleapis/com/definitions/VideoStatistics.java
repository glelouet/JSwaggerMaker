package www.googleapis.com.definitions;

public class VideoStatistics {
    /**
     * The number of comments for the video.
     */
    public String commentCount;
    /**
     * The number of users who have indicated that they disliked the video by giving it a negative rating.
     */
    public String dislikeCount;
    /**
     * The number of users who currently have the video marked as a favorite video.
     */
    public String favoriteCount;
    /**
     * The number of users who have indicated that they liked the video by giving it a positive rating.
     */
    public String likeCount;
    /**
     * The number of times the video has been viewed.
     */
    public String viewCount;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoStatistics othersame = ((VideoStatistics) other);
        if ((commentCount!= othersame.commentCount)&&((commentCount == null)||(!commentCount.equals(othersame.commentCount)))) {
            return false;
        }
        if ((dislikeCount!= othersame.dislikeCount)&&((dislikeCount == null)||(!dislikeCount.equals(othersame.dislikeCount)))) {
            return false;
        }
        if ((favoriteCount!= othersame.favoriteCount)&&((favoriteCount == null)||(!favoriteCount.equals(othersame.favoriteCount)))) {
            return false;
        }
        if ((likeCount!= othersame.likeCount)&&((likeCount == null)||(!likeCount.equals(othersame.likeCount)))) {
            return false;
        }
        if ((viewCount!= othersame.viewCount)&&((viewCount == null)||(!viewCount.equals(othersame.viewCount)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((commentCount == null)? 0 :commentCount.hashCode())+((dislikeCount == null)? 0 :dislikeCount.hashCode()))+((favoriteCount == null)? 0 :favoriteCount.hashCode()))+((likeCount == null)? 0 :likeCount.hashCode()))+((viewCount == null)? 0 :viewCount.hashCode()));
    }
}
