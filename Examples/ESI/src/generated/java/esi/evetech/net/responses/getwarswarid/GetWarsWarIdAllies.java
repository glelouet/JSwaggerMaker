package esi.evetech.net.responses.getwarswarid;

public class GetWarsWarIdAllies {
    /**
     * Alliance ID if and only if this ally is an alliance
     */
    public int alliance_id;
    /**
     * Corporation ID if and only if this ally is a corporation
     */
    public int corporation_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetWarsWarIdAllies othersame = ((GetWarsWarIdAllies) other);
        if (alliance_id!= othersame.alliance_id) {
            return false;
        }
        if (corporation_id!= othersame.corporation_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (alliance_id + corporation_id);
    }
}
