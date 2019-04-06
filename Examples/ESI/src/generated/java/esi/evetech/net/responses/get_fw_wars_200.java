package esi.evetech.net.responses;

public class get_fw_wars_200 {
    /**
     * The faction ID of the enemy faction.
     */
    public int against_id;
    /**
     * faction_id integer
     */
    public int faction_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        get_fw_wars_200 othersame = ((get_fw_wars_200) other);
        if (against_id!= othersame.against_id) {
            return false;
        }
        if (faction_id!= othersame.faction_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (against_id + faction_id);
    }
}
