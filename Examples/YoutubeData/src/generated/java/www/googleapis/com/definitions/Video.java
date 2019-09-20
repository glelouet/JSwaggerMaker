package www.googleapis.com.definitions;

import java.util.HashMap;

public class Video {
    /**
     * Age restriction details related to a video. This data can only be retrieved by the video owner.
     */
    public VideoAgeGating ageGating;
    /**
     * The contentDetails object contains information about the video content, including the length of the video and its aspect ratio.
     */
    public VideoContentDetails contentDetails;
    /**
     * Etag of this resource.
     */
    public String etag;
    /**
     * The fileDetails object encapsulates information about the video file that was uploaded to YouTube, including the file's resolution, duration, audio and video codecs, stream bitrates, and more. This data can only be retrieved by the video owner.
     */
    public VideoFileDetails fileDetails;
    /**
     * The ID that YouTube uses to uniquely identify the video.
     */
    public String id;
    /**
     * Identifies what kind of resource this is. Value: the fixed string "youtube#video".
     */
    public String kind;
    /**
     * The liveStreamingDetails object contains metadata about a live video broadcast. The object will only be present in a video resource if the video is an upcoming, live, or completed live broadcast.
     */
    public VideoLiveStreamingDetails liveStreamingDetails;
    /**
     * List with all localizations.
     */
    public HashMap<String, ChannelLocalization> localizations;
    /**
     * The monetizationDetails object encapsulates information about the monetization status of the video.
     */
    public VideoMonetizationDetails monetizationDetails;
    /**
     * The player object contains information that you would use to play the video in an embedded player.
     */
    public VideoPlayer player;
    /**
     * The processingDetails object encapsulates information about YouTube's progress in processing the uploaded video file. The properties in the object identify the current processing status and an estimate of the time remaining until YouTube finishes processing the video. This part also indicates whether different types of data or content, such as file details or thumbnail images, are available for the video.
     * 
     * The processingProgress object is designed to be polled so that the video uploaded can track the progress that YouTube has made in processing the uploaded video file. This data can only be retrieved by the video owner.
     */
    public VideoProcessingDetails processingDetails;
    /**
     * The projectDetails object contains information about the project specific video metadata.
     */
    public VideoProjectDetails projectDetails;
    /**
     * The recordingDetails object encapsulates information about the location, date and address where the video was recorded.
     */
    public VideoRecordingDetails recordingDetails;
    /**
     * The snippet object contains basic details about the video, such as its title, description, and category.
     */
    public VideoSnippet snippet;
    /**
     * The statistics object contains statistics about the video.
     */
    public VideoStatistics statistics;
    /**
     * The status object contains information about the video's uploading, processing, and privacy statuses.
     */
    public VideoStatus status;
    /**
     * The suggestions object encapsulates suggestions that identify opportunities to improve the video quality or the metadata for the uploaded video. This data can only be retrieved by the video owner.
     */
    public VideoSuggestions suggestions;
    /**
     * The topicDetails object encapsulates information about Freebase topics associated with the video.
     */
    public VideoTopicDetails topicDetails;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Video othersame = ((Video) other);
        if ((ageGating!= othersame.ageGating)&&((ageGating == null)||(!ageGating.equals(othersame.ageGating)))) {
            return false;
        }
        if ((contentDetails!= othersame.contentDetails)&&((contentDetails == null)||(!contentDetails.equals(othersame.contentDetails)))) {
            return false;
        }
        if ((etag!= othersame.etag)&&((etag == null)||(!etag.equals(othersame.etag)))) {
            return false;
        }
        if ((fileDetails!= othersame.fileDetails)&&((fileDetails == null)||(!fileDetails.equals(othersame.fileDetails)))) {
            return false;
        }
        if ((id!= othersame.id)&&((id == null)||(!id.equals(othersame.id)))) {
            return false;
        }
        if ((kind!= othersame.kind)&&((kind == null)||(!kind.equals(othersame.kind)))) {
            return false;
        }
        if ((liveStreamingDetails!= othersame.liveStreamingDetails)&&((liveStreamingDetails == null)||(!liveStreamingDetails.equals(othersame.liveStreamingDetails)))) {
            return false;
        }
        if ((localizations!= othersame.localizations)&&((localizations == null)||(!localizations.equals(othersame.localizations)))) {
            return false;
        }
        if ((monetizationDetails!= othersame.monetizationDetails)&&((monetizationDetails == null)||(!monetizationDetails.equals(othersame.monetizationDetails)))) {
            return false;
        }
        if ((player!= othersame.player)&&((player == null)||(!player.equals(othersame.player)))) {
            return false;
        }
        if ((processingDetails!= othersame.processingDetails)&&((processingDetails == null)||(!processingDetails.equals(othersame.processingDetails)))) {
            return false;
        }
        if ((projectDetails!= othersame.projectDetails)&&((projectDetails == null)||(!projectDetails.equals(othersame.projectDetails)))) {
            return false;
        }
        if ((recordingDetails!= othersame.recordingDetails)&&((recordingDetails == null)||(!recordingDetails.equals(othersame.recordingDetails)))) {
            return false;
        }
        if ((snippet!= othersame.snippet)&&((snippet == null)||(!snippet.equals(othersame.snippet)))) {
            return false;
        }
        if ((statistics!= othersame.statistics)&&((statistics == null)||(!statistics.equals(othersame.statistics)))) {
            return false;
        }
        if ((status!= othersame.status)&&((status == null)||(!status.equals(othersame.status)))) {
            return false;
        }
        if ((suggestions!= othersame.suggestions)&&((suggestions == null)||(!suggestions.equals(othersame.suggestions)))) {
            return false;
        }
        if ((topicDetails!= othersame.topicDetails)&&((topicDetails == null)||(!topicDetails.equals(othersame.topicDetails)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((ageGating == null)? 0 :ageGating.hashCode())+((contentDetails == null)? 0 :contentDetails.hashCode()))+((etag == null)? 0 :etag.hashCode()))+((fileDetails == null)? 0 :fileDetails.hashCode()))+((id == null)? 0 :id.hashCode()))+((kind == null)? 0 :kind.hashCode()))+((liveStreamingDetails == null)? 0 :liveStreamingDetails.hashCode()))+((localizations == null)? 0 :localizations.hashCode()))+((monetizationDetails == null)? 0 :monetizationDetails.hashCode()))+((player == null)? 0 :player.hashCode()))+((processingDetails == null)? 0 :processingDetails.hashCode()))+((projectDetails == null)? 0 :projectDetails.hashCode()))+((recordingDetails == null)? 0 :recordingDetails.hashCode()))+((snippet == null)? 0 :snippet.hashCode()))+((statistics == null)? 0 :statistics.hashCode()))+((status == null)? 0 :status.hashCode()))+((suggestions == null)? 0 :suggestions.hashCode()))+((topicDetails == null)? 0 :topicDetails.hashCode()));
    }
}
