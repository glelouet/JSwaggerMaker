package www.googleapis.com.definitions;

import www.googleapis.com.structures.Longuploadsstatus;
import www.googleapis.com.structures.Privacystatus;

public class ChannelStatus {
    /**
     * If true, then the user is linked to either a YouTube username or G+ account. Otherwise, the user doesn't have a public YouTube identity.
     */
    public boolean isLinked;
    /**
     * The long uploads status of this channel. See
     */
    public Longuploadsstatus longUploadsStatus;
    /**
     * Privacy status of the channel.
     */
    public Privacystatus privacyStatus;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ChannelStatus othersame = ((ChannelStatus) other);
        if (isLinked!= othersame.isLinked) {
            return false;
        }
        if ((longUploadsStatus!= othersame.longUploadsStatus)&&((longUploadsStatus == null)||(!longUploadsStatus.equals(othersame.longUploadsStatus)))) {
            return false;
        }
        if ((privacyStatus!= othersame.privacyStatus)&&((privacyStatus == null)||(!privacyStatus.equals(othersame.privacyStatus)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((Boolean.hashCode(isLinked)+((longUploadsStatus == null)? 0 :longUploadsStatus.hashCode()))+((privacyStatus == null)? 0 :privacyStatus.hashCode()));
    }
}
