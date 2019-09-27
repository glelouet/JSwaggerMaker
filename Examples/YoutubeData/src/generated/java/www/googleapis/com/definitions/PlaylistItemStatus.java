package www.googleapis.com.definitions;

import www.googleapis.com.structures.Privacystatus;

public class PlaylistItemStatus {
    /**
     * This resource's privacy status.
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
        PlaylistItemStatus othersame = ((PlaylistItemStatus) other);
        if ((privacyStatus!= othersame.privacyStatus)&&((privacyStatus == null)||(!privacyStatus.equals(othersame.privacyStatus)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((privacyStatus == null)? 0 :privacyStatus.hashCode());
    }
}
