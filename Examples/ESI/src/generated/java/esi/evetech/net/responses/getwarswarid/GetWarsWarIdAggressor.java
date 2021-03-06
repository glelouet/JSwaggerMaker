package esi.evetech.net.responses.getwarswarid;

public class GetWarsWarIdAggressor {
    /**
     * Alliance ID if and only if the aggressor is an alliance
     */
    public int alliance_id;
    /**
     * Corporation ID if and only if the aggressor is a corporation
     */
    public int corporation_id;
    /**
     * ISK value of ships the aggressor has destroyed
     */
    public float isk_destroyed;
    /**
     * The number of ships the aggressor has killed
     */
    public int ships_killed;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetWarsWarIdAggressor othersame = ((GetWarsWarIdAggressor) other);
        if (alliance_id!= othersame.alliance_id) {
            return false;
        }
        if (corporation_id!= othersame.corporation_id) {
            return false;
        }
        if (isk_destroyed!= othersame.isk_destroyed) {
            return false;
        }
        if (ships_killed!= othersame.ships_killed) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((alliance_id + corporation_id)+ Double.hashCode(isk_destroyed))+ ships_killed);
    }
}
