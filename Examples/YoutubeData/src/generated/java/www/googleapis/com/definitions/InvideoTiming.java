package www.googleapis.com.definitions;

import www.googleapis.com.structures.TYPE;

public class InvideoTiming {
    /**
     * Defines the duration in milliseconds for which the promotion should be displayed. If missing, the client should use the default.
     */
    public String durationMs;
    /**
     * Defines the time at which the promotion will appear. Depending on the value of type the value of the offsetMs field will represent a time offset from the start or from the end of the video, expressed in milliseconds.
     */
    public String offsetMs;
    /**
     * Describes a timing type. If the value is offsetFromStart, then the offsetMs field represents an offset from the start of the video. If the value is offsetFromEnd, then the offsetMs field represents an offset from the end of the video.
     */
    public TYPE type;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        InvideoTiming othersame = ((InvideoTiming) other);
        if ((durationMs!= othersame.durationMs)&&((durationMs == null)||(!durationMs.equals(othersame.durationMs)))) {
            return false;
        }
        if ((offsetMs!= othersame.offsetMs)&&((offsetMs == null)||(!offsetMs.equals(othersame.offsetMs)))) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((durationMs == null)? 0 :durationMs.hashCode())+((offsetMs == null)? 0 :offsetMs.hashCode()))+((type == null)? 0 :type.hashCode()));
    }
}
