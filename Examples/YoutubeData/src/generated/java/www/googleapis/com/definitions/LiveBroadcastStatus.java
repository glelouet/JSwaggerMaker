package www.googleapis.com.definitions;

import www.googleapis.com.structures.LIFECYCLESTATUS;
import www.googleapis.com.structures.LIVEBROADCASTPRIORITY;
import www.googleapis.com.structures.PRIVACYSTATUS;
import www.googleapis.com.structures.RECORDINGSTATUS;

public class LiveBroadcastStatus {
    /**
     * The broadcast's status. The status can be updated using the API's liveBroadcasts.transition method.
     */
    public LIFECYCLESTATUS lifeCycleStatus;
    /**
     * Priority of the live broadcast event (internal state).
     */
    public LIVEBROADCASTPRIORITY liveBroadcastPriority;
    /**
     * The broadcast's privacy status. Note that the broadcast represents exactly one YouTube video, so the privacy settings are identical to those supported for videos. In addition, you can set this field by modifying the broadcast resource or by setting the privacyStatus field of the corresponding video resource.
     */
    public PRIVACYSTATUS privacyStatus;
    /**
     * The broadcast's recording status.
     */
    public RECORDINGSTATUS recordingStatus;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveBroadcastStatus othersame = ((LiveBroadcastStatus) other);
        if ((lifeCycleStatus!= othersame.lifeCycleStatus)&&((lifeCycleStatus == null)||(!lifeCycleStatus.equals(othersame.lifeCycleStatus)))) {
            return false;
        }
        if ((liveBroadcastPriority!= othersame.liveBroadcastPriority)&&((liveBroadcastPriority == null)||(!liveBroadcastPriority.equals(othersame.liveBroadcastPriority)))) {
            return false;
        }
        if ((privacyStatus!= othersame.privacyStatus)&&((privacyStatus == null)||(!privacyStatus.equals(othersame.privacyStatus)))) {
            return false;
        }
        if ((recordingStatus!= othersame.recordingStatus)&&((recordingStatus == null)||(!recordingStatus.equals(othersame.recordingStatus)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((lifeCycleStatus == null)? 0 :lifeCycleStatus.hashCode())+((liveBroadcastPriority == null)? 0 :liveBroadcastPriority.hashCode()))+((privacyStatus == null)? 0 :privacyStatus.hashCode()))+((recordingStatus == null)? 0 :recordingStatus.hashCode()));
    }
}
