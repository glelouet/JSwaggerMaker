package esi.evetech.net.responses.getuniversestargatesstargateid;

public class Getuniversestargatesstargateiddestination {
    /**
     * The stargate this stargate connects to
     */
    public int stargate_id;
    /**
     * The solar system this stargate connects to
     */
    public int system_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getuniversestargatesstargateiddestination othersame = ((Getuniversestargatesstargateiddestination) other);
        if (stargate_id!= othersame.stargate_id) {
            return false;
        }
        if (system_id!= othersame.system_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (stargate_id + system_id);
    }
}
