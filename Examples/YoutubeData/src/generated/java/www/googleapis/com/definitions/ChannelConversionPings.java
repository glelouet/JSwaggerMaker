package www.googleapis.com.definitions;

public class ChannelConversionPings {
    /**
     * Pings that the app shall fire (authenticated by biscotti cookie). Each ping has a context, in which the app must fire the ping, and a url identifying the ping.
     */
    public ChannelConversionPing[] pings;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ChannelConversionPings othersame = ((ChannelConversionPings) other);
        if ((pings!= othersame.pings)&&((pings == null)||(!pings.equals(othersame.pings)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((pings == null)? 0 :pings.hashCode());
    }
}
