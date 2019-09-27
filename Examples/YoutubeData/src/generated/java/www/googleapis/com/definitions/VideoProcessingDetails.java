package www.googleapis.com.definitions;

import www.googleapis.com.structures.Processingfailurereason;
import www.googleapis.com.structures.Processingstatus;

public class VideoProcessingDetails {
    /**
     * This value indicates whether video editing suggestions, which might improve video quality or the playback experience, are available for the video. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
     */
    public String editorSuggestionsAvailability;
    /**
     * This value indicates whether file details are available for the uploaded video. You can retrieve a video's file details by requesting the fileDetails part in your videos.list() request.
     */
    public String fileDetailsAvailability;
    /**
     * The reason that YouTube failed to process the video. This property will only have a value if the processingStatus property's value is failed.
     */
    public Processingfailurereason processingFailureReason;
    /**
     * This value indicates whether the video processing engine has generated suggestions that might improve YouTube's ability to process the the video, warnings that explain video processing problems, or errors that cause video processing problems. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
     */
    public String processingIssuesAvailability;
    /**
     * The processingProgress object contains information about the progress YouTube has made in processing the video. The values are really only relevant if the video's processing status is processing.
     */
    public VideoProcessingDetailsProcessingProgress processingProgress;
    /**
     * The video's processing status. This value indicates whether YouTube was able to process the video or if the video is still being processed.
     */
    public Processingstatus processingStatus;
    /**
     * This value indicates whether keyword (tag) suggestions are available for the video. Tags can be added to a video's metadata to make it easier for other users to find the video. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
     */
    public String tagSuggestionsAvailability;
    /**
     * This value indicates whether thumbnail images have been generated for the video.
     */
    public String thumbnailsAvailability;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoProcessingDetails othersame = ((VideoProcessingDetails) other);
        if ((editorSuggestionsAvailability!= othersame.editorSuggestionsAvailability)&&((editorSuggestionsAvailability == null)||(!editorSuggestionsAvailability.equals(othersame.editorSuggestionsAvailability)))) {
            return false;
        }
        if ((fileDetailsAvailability!= othersame.fileDetailsAvailability)&&((fileDetailsAvailability == null)||(!fileDetailsAvailability.equals(othersame.fileDetailsAvailability)))) {
            return false;
        }
        if ((processingFailureReason!= othersame.processingFailureReason)&&((processingFailureReason == null)||(!processingFailureReason.equals(othersame.processingFailureReason)))) {
            return false;
        }
        if ((processingIssuesAvailability!= othersame.processingIssuesAvailability)&&((processingIssuesAvailability == null)||(!processingIssuesAvailability.equals(othersame.processingIssuesAvailability)))) {
            return false;
        }
        if ((processingProgress!= othersame.processingProgress)&&((processingProgress == null)||(!processingProgress.equals(othersame.processingProgress)))) {
            return false;
        }
        if ((processingStatus!= othersame.processingStatus)&&((processingStatus == null)||(!processingStatus.equals(othersame.processingStatus)))) {
            return false;
        }
        if ((tagSuggestionsAvailability!= othersame.tagSuggestionsAvailability)&&((tagSuggestionsAvailability == null)||(!tagSuggestionsAvailability.equals(othersame.tagSuggestionsAvailability)))) {
            return false;
        }
        if ((thumbnailsAvailability!= othersame.thumbnailsAvailability)&&((thumbnailsAvailability == null)||(!thumbnailsAvailability.equals(othersame.thumbnailsAvailability)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((editorSuggestionsAvailability == null)? 0 :editorSuggestionsAvailability.hashCode())+((fileDetailsAvailability == null)? 0 :fileDetailsAvailability.hashCode()))+((processingFailureReason == null)? 0 :processingFailureReason.hashCode()))+((processingIssuesAvailability == null)? 0 :processingIssuesAvailability.hashCode()))+((processingProgress == null)? 0 :processingProgress.hashCode()))+((processingStatus == null)? 0 :processingStatus.hashCode()))+((tagSuggestionsAvailability == null)? 0 :tagSuggestionsAvailability.hashCode()))+((thumbnailsAvailability == null)? 0 :thumbnailsAvailability.hashCode()));
    }
}
