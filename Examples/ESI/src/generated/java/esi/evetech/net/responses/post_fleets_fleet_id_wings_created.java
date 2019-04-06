package esi.evetech.net.responses;

public class post_fleets_fleet_id_wings_created {
    /**
     * The wing_id of the newly created wing
     */
    public long wing_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        post_fleets_fleet_id_wings_created othersame = ((post_fleets_fleet_id_wings_created) other);
        if (wing_id!= othersame.wing_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Long.hashCode(wing_id);
    }
}
