package www.googleapis.com.definitions;

import www.googleapis.com.structures.Status;

public class LiveStreamHealthStatus {
    /**
     * The configurations issues on this stream
     */
    public LiveStreamConfigurationIssue[] configurationIssues;
    /**
     * The last time this status was updated (in seconds)
     */
    public String lastUpdateTimeSeconds;
    /**
     * The status code of this stream
     */
    public Status status;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveStreamHealthStatus othersame = ((LiveStreamHealthStatus) other);
        if ((configurationIssues!= othersame.configurationIssues)&&((configurationIssues == null)||(!configurationIssues.equals(othersame.configurationIssues)))) {
            return false;
        }
        if ((lastUpdateTimeSeconds!= othersame.lastUpdateTimeSeconds)&&((lastUpdateTimeSeconds == null)||(!lastUpdateTimeSeconds.equals(othersame.lastUpdateTimeSeconds)))) {
            return false;
        }
        if ((status!= othersame.status)&&((status == null)||(!status.equals(othersame.status)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((configurationIssues == null)? 0 :configurationIssues.hashCode())+((lastUpdateTimeSeconds == null)? 0 :lastUpdateTimeSeconds.hashCode()))+((status == null)? 0 :status.hashCode()));
    }
}
