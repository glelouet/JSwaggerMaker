package www.googleapis.com.definitions;

import www.googleapis.com.structures.EDITORSUGGESTIONS;
import www.googleapis.com.structures.PROCESSINGERRORS;
import www.googleapis.com.structures.PROCESSINGHINTS;
import www.googleapis.com.structures.PROCESSINGWARNINGS;

public class VideoSuggestions {
    /**
     * A list of video editing operations that might improve the video quality or playback experience of the uploaded video.
     */
    public EDITORSUGGESTIONS[] editorSuggestions;
    /**
     * A list of errors that will prevent YouTube from successfully processing the uploaded video video. These errors indicate that, regardless of the video's current processing status, eventually, that status will almost certainly be failed.
     */
    public PROCESSINGERRORS[] processingErrors;
    /**
     * A list of suggestions that may improve YouTube's ability to process the video.
     */
    public PROCESSINGHINTS[] processingHints;
    /**
     * A list of reasons why YouTube may have difficulty transcoding the uploaded video or that might result in an erroneous transcoding. These warnings are generated before YouTube actually processes the uploaded video file. In addition, they identify issues that are unlikely to cause the video processing to fail but that might cause problems such as sync issues, video artifacts, or a missing audio track.
     */
    public PROCESSINGWARNINGS[] processingWarnings;
    /**
     * A list of keyword tags that could be added to the video's metadata to increase the likelihood that users will locate your video when searching or browsing on YouTube.
     */
    public VideoSuggestionsTagSuggestion[] tagSuggestions;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoSuggestions othersame = ((VideoSuggestions) other);
        if ((editorSuggestions!= othersame.editorSuggestions)&&((editorSuggestions == null)||(!editorSuggestions.equals(othersame.editorSuggestions)))) {
            return false;
        }
        if ((processingErrors!= othersame.processingErrors)&&((processingErrors == null)||(!processingErrors.equals(othersame.processingErrors)))) {
            return false;
        }
        if ((processingHints!= othersame.processingHints)&&((processingHints == null)||(!processingHints.equals(othersame.processingHints)))) {
            return false;
        }
        if ((processingWarnings!= othersame.processingWarnings)&&((processingWarnings == null)||(!processingWarnings.equals(othersame.processingWarnings)))) {
            return false;
        }
        if ((tagSuggestions!= othersame.tagSuggestions)&&((tagSuggestions == null)||(!tagSuggestions.equals(othersame.tagSuggestions)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((editorSuggestions == null)? 0 :editorSuggestions.hashCode())+((processingErrors == null)? 0 :processingErrors.hashCode()))+((processingHints == null)? 0 :processingHints.hashCode()))+((processingWarnings == null)? 0 :processingWarnings.hashCode()))+((tagSuggestions == null)? 0 :tagSuggestions.hashCode()));
    }
}
