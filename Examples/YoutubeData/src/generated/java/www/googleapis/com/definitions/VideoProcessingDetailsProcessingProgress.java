package www.googleapis.com.definitions;

public class VideoProcessingDetailsProcessingProgress {
    /**
     * The number of parts of the video that YouTube has already processed. You can estimate the percentage of the video that YouTube has already processed by calculating:
     *  100 * parts_processed / parts_total
     * 
     * Note that since the estimated number of parts could increase without a corresponding increase in the number of parts that have already been processed, it is possible that the calculated progress could periodically decrease while YouTube processes a video.
     */
    public String partsProcessed;
    /**
     * An estimate of the total number of parts that need to be processed for the video. The number may be updated with more precise estimates while YouTube processes the video.
     */
    public String partsTotal;
    /**
     * An estimate of the amount of time, in millseconds, that YouTube needs to finish processing the video.
     */
    public String timeLeftMs;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoProcessingDetailsProcessingProgress othersame = ((VideoProcessingDetailsProcessingProgress) other);
        if ((partsProcessed!= othersame.partsProcessed)&&((partsProcessed == null)||(!partsProcessed.equals(othersame.partsProcessed)))) {
            return false;
        }
        if ((partsTotal!= othersame.partsTotal)&&((partsTotal == null)||(!partsTotal.equals(othersame.partsTotal)))) {
            return false;
        }
        if ((timeLeftMs!= othersame.timeLeftMs)&&((timeLeftMs == null)||(!timeLeftMs.equals(othersame.timeLeftMs)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((partsProcessed == null)? 0 :partsProcessed.hashCode())+((partsTotal == null)? 0 :partsTotal.hashCode()))+((timeLeftMs == null)? 0 :timeLeftMs.hashCode()));
    }
}
