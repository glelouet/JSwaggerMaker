package www.googleapis.com.definitions;

import www.googleapis.com.structures.PrivacyStatus;

public class PlaylistStatus {
    /**
     * The playlist's privacy status.
     */
    public PrivacyStatus privacyStatus;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        PlaylistStatus othersame = ((PlaylistStatus) other);
        if ((privacyStatus!= othersame.privacyStatus)&&((privacyStatus == null)||(!privacyStatus.equals(othersame.privacyStatus)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((privacyStatus == null)? 0 :privacyStatus.hashCode());
    }
}
