package www.googleapis.com.definitions;

import www.googleapis.com.structures.STREAMSTATUS;

public class LiveStreamStatus {
    /**
     * The health status of the stream.
     */
    public LiveStreamHealthStatus healthStatus;
    public STREAMSTATUS streamStatus;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveStreamStatus othersame = ((LiveStreamStatus) other);
        if ((healthStatus!= othersame.healthStatus)&&((healthStatus == null)||(!healthStatus.equals(othersame.healthStatus)))) {
            return false;
        }
        if ((streamStatus!= othersame.streamStatus)&&((streamStatus == null)||(!streamStatus.equals(othersame.streamStatus)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((healthStatus == null)? 0 :healthStatus.hashCode())+((streamStatus == null)? 0 :streamStatus.hashCode()));
    }
}
