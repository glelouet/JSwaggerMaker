package www.googleapis.com.definitions;

public class VideoRecordingDetails {
    /**
     * The geolocation information associated with the video.
     */
    public GeoPoint location;
    /**
     * The text description of the location where the video was recorded.
     */
    public String locationDescription;
    /**
     * The date and time when the video was recorded. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sssZ) format.
     */
    public String recordingDate;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoRecordingDetails othersame = ((VideoRecordingDetails) other);
        if ((location!= othersame.location)&&((location == null)||(!location.equals(othersame.location)))) {
            return false;
        }
        if ((locationDescription!= othersame.locationDescription)&&((locationDescription == null)||(!locationDescription.equals(othersame.locationDescription)))) {
            return false;
        }
        if ((recordingDate!= othersame.recordingDate)&&((recordingDate == null)||(!recordingDate.equals(othersame.recordingDate)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((location == null)? 0 :location.hashCode())+((locationDescription == null)? 0 :locationDescription.hashCode()))+((recordingDate == null)? 0 :recordingDate.hashCode()));
    }
}
