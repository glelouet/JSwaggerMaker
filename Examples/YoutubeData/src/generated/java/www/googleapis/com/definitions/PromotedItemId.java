package www.googleapis.com.definitions;

import www.googleapis.com.structures.Type;

public class PromotedItemId {
    /**
     * If type is recentUpload, this field identifies the channel from which to take the recent upload. If missing, the channel is assumed to be the same channel for which the invideoPromotion is set.
     */
    public String recentlyUploadedBy;
    /**
     * Describes the type of the promoted item.
     */
    public Type type;
    /**
     * If the promoted item represents a video, this field represents the unique YouTube ID identifying it. This field will be present only if type has the value video.
     */
    public String videoId;
    /**
     * If the promoted item represents a website, this field represents the url pointing to the website. This field will be present only if type has the value website.
     */
    public String websiteUrl;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        PromotedItemId othersame = ((PromotedItemId) other);
        if ((recentlyUploadedBy!= othersame.recentlyUploadedBy)&&((recentlyUploadedBy == null)||(!recentlyUploadedBy.equals(othersame.recentlyUploadedBy)))) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        if ((videoId!= othersame.videoId)&&((videoId == null)||(!videoId.equals(othersame.videoId)))) {
            return false;
        }
        if ((websiteUrl!= othersame.websiteUrl)&&((websiteUrl == null)||(!websiteUrl.equals(othersame.websiteUrl)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((recentlyUploadedBy == null)? 0 :recentlyUploadedBy.hashCode())+((type == null)? 0 :type.hashCode()))+((videoId == null)? 0 :videoId.hashCode()))+((websiteUrl == null)? 0 :websiteUrl.hashCode()));
    }
}
