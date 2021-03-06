package esi.evetech.net.responses;

public class GetSovereigntyMap {
    /**
     * alliance_id integer
     */
    public int alliance_id;
    /**
     * corporation_id integer
     */
    public int corporation_id;
    /**
     * faction_id integer
     */
    public int faction_id;
    /**
     * system_id integer
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
        GetSovereigntyMap othersame = ((GetSovereigntyMap) other);
        if (alliance_id!= othersame.alliance_id) {
            return false;
        }
        if (corporation_id!= othersame.corporation_id) {
            return false;
        }
        if (faction_id!= othersame.faction_id) {
            return false;
        }
        if (system_id!= othersame.system_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((alliance_id + corporation_id)+ faction_id)+ system_id);
    }
}
