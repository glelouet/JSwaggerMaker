package www.googleapis.com.definitions;

import www.googleapis.com.structures.AudioTrackType;
import www.googleapis.com.structures.FailureReason;
import www.googleapis.com.structures.Status;
import www.googleapis.com.structures.TrackKind;

public class CaptionSnippet {
    /**
     * The type of audio track associated with the caption track.
     */
    public AudioTrackType audioTrackType;
    /**
     * The reason that YouTube failed to process the caption track. This property is only present if the state property's value is failed.
     */
    public FailureReason failureReason;
    /**
     * Indicates whether YouTube synchronized the caption track to the audio track in the video. The value will be true if a sync was explicitly requested when the caption track was uploaded. For example, when calling the captions.insert or captions.update methods, you can set the sync parameter to true to instruct YouTube to sync the uploaded track to the video. If the value is false, YouTube uses the time codes in the uploaded caption track to determine when to display captions.
     */
    public boolean isAutoSynced;
    /**
     * Indicates whether the track contains closed captions for the deaf and hard of hearing. The default value is false.
     */
    public boolean isCC;
    /**
     * Indicates whether the caption track is a draft. If the value is true, then the track is not publicly visible. The default value is false.
     */
    public boolean isDraft;
    /**
     * Indicates whether caption track is formatted for "easy reader," meaning it is at a third-grade level for language learners. The default value is false.
     */
    public boolean isEasyReader;
    /**
     * Indicates whether the caption track uses large text for the vision-impaired. The default value is false.
     */
    public boolean isLarge;
    /**
     * The language of the caption track. The property value is a BCP-47 language tag.
     */
    public String language;
    /**
     * The date and time when the caption track was last updated. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String lastUpdated;
    /**
     * The name of the caption track. The name is intended to be visible to the user as an option during playback.
     */
    public String name;
    /**
     * The caption track's status.
     */
    public Status status;
    /**
     * The caption track's type.
     */
    public TrackKind trackKind;
    /**
     * The ID that YouTube uses to uniquely identify the video associated with the caption track.
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
        CaptionSnippet othersame = ((CaptionSnippet) other);
        if ((audioTrackType!= othersame.audioTrackType)&&((audioTrackType == null)||(!audioTrackType.equals(othersame.audioTrackType)))) {
            return false;
        }
        if ((failureReason!= othersame.failureReason)&&((failureReason == null)||(!failureReason.equals(othersame.failureReason)))) {
            return false;
        }
        if (isAutoSynced!= othersame.isAutoSynced) {
            return false;
        }
        if (isCC!= othersame.isCC) {
            return false;
        }
        if (isDraft!= othersame.isDraft) {
            return false;
        }
        if (isEasyReader!= othersame.isEasyReader) {
            return false;
        }
        if (isLarge!= othersame.isLarge) {
            return false;
        }
        if ((language!= othersame.language)&&((language == null)||(!language.equals(othersame.language)))) {
            return false;
        }
        if ((lastUpdated!= othersame.lastUpdated)&&((lastUpdated == null)||(!lastUpdated.equals(othersame.lastUpdated)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((status!= othersame.status)&&((status == null)||(!status.equals(othersame.status)))) {
            return false;
        }
        if ((trackKind!= othersame.trackKind)&&((trackKind == null)||(!trackKind.equals(othersame.trackKind)))) {
            return false;
        }
        if ((videoId!= othersame.videoId)&&((videoId == null)||(!videoId.equals(othersame.videoId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((audioTrackType == null)? 0 :audioTrackType.hashCode())+((failureReason == null)? 0 :failureReason.hashCode()))+ Boolean.hashCode(isAutoSynced))+ Boolean.hashCode(isCC))+ Boolean.hashCode(isDraft))+ Boolean.hashCode(isEasyReader))+ Boolean.hashCode(isLarge))+((language == null)? 0 :language.hashCode()))+((lastUpdated == null)? 0 :lastUpdated.hashCode()))+((name == null)? 0 :name.hashCode()))+((status == null)? 0 :status.hashCode()))+((trackKind == null)? 0 :trackKind.hashCode()))+((videoId == null)? 0 :videoId.hashCode()));
    }
}
