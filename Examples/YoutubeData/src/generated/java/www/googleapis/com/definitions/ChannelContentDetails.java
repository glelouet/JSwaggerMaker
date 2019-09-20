package www.googleapis.com.definitions;

public class ChannelContentDetails {
    public RELATEDPLAYLISTS relatedPlaylists;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ChannelContentDetails othersame = ((ChannelContentDetails) other);
        if ((relatedPlaylists!= othersame.relatedPlaylists)&&((relatedPlaylists == null)||(!relatedPlaylists.equals(othersame.relatedPlaylists)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((relatedPlaylists == null)? 0 :relatedPlaylists.hashCode());
    }
}
