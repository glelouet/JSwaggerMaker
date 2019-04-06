package esi.evetech.net.responses;

public class post_fleets_fleet_id_wings_wing_id_squads_created {
    /**
     * The squad_id of the newly created squad
     */
    public long squad_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        post_fleets_fleet_id_wings_wing_id_squads_created othersame = ((post_fleets_fleet_id_wings_wing_id_squads_created) other);
        if (squad_id!= othersame.squad_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Long.hashCode(squad_id);
    }
}
