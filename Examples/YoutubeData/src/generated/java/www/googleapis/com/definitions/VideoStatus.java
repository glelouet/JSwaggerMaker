package www.googleapis.com.definitions;

import www.googleapis.com.structures.FAILUREREASON;
import www.googleapis.com.structures.LICENSE;
import www.googleapis.com.structures.PRIVACYSTATUS;
import www.googleapis.com.structures.REJECTIONREASON;
import www.googleapis.com.structures.UPLOADSTATUS;

public class VideoStatus {
    /**
     * This value indicates if the video can be embedded on another website.
     */
    public boolean embeddable;
    /**
     * This value explains why a video failed to upload. This property is only present if the uploadStatus property indicates that the upload failed.
     */
    public FAILUREREASON failureReason;
    /**
     * The video's license.
     */
    public LICENSE license;
    /**
     * The video's privacy status.
     */
    public PRIVACYSTATUS privacyStatus;
    /**
     * This value indicates if the extended video statistics on the watch page can be viewed by everyone. Note that the view count, likes, etc will still be visible if this is disabled.
     */
    public boolean publicStatsViewable;
    /**
     * The date and time when the video is scheduled to publish. It can be set only if the privacy status of the video is private. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String publishAt;
    /**
     * This value explains why YouTube rejected an uploaded video. This property is only present if the uploadStatus property indicates that the upload was rejected.
     */
    public REJECTIONREASON rejectionReason;
    /**
     * The status of the uploaded video.
     */
    public UPLOADSTATUS uploadStatus;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoStatus othersame = ((VideoStatus) other);
        if (embeddable!= othersame.embeddable) {
            return false;
        }
        if ((failureReason!= othersame.failureReason)&&((failureReason == null)||(!failureReason.equals(othersame.failureReason)))) {
            return false;
        }
        if ((license!= othersame.license)&&((license == null)||(!license.equals(othersame.license)))) {
            return false;
        }
        if ((privacyStatus!= othersame.privacyStatus)&&((privacyStatus == null)||(!privacyStatus.equals(othersame.privacyStatus)))) {
            return false;
        }
        if (publicStatsViewable!= othersame.publicStatsViewable) {
            return false;
        }
        if ((publishAt!= othersame.publishAt)&&((publishAt == null)||(!publishAt.equals(othersame.publishAt)))) {
            return false;
        }
        if ((rejectionReason!= othersame.rejectionReason)&&((rejectionReason == null)||(!rejectionReason.equals(othersame.rejectionReason)))) {
            return false;
        }
        if ((uploadStatus!= othersame.uploadStatus)&&((uploadStatus == null)||(!uploadStatus.equals(othersame.uploadStatus)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(embeddable)+((failureReason == null)? 0 :failureReason.hashCode()))+((license == null)? 0 :license.hashCode()))+((privacyStatus == null)? 0 :privacyStatus.hashCode()))+ Boolean.hashCode(publicStatsViewable))+((publishAt == null)? 0 :publishAt.hashCode()))+((rejectionReason == null)? 0 :rejectionReason.hashCode()))+((uploadStatus == null)? 0 :uploadStatus.hashCode()));
    }
}
