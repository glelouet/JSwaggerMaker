package esi.evetech.net.responses;

import esi.evetech.net.structures.GetCharactersCharacterIdFleetRole;

public class GetCharactersCharacterIdFleet {
    /**
     * The character's current fleet ID
     */
    public long fleet_id;
    /**
     * Member’s role in fleet
     */
    public GetCharactersCharacterIdFleetRole role;
    /**
     * ID of the squad the member is in. If not applicable, will be set to -1
     */
    public long squad_id;
    /**
     * ID of the wing the member is in. If not applicable, will be set to -1
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
        GetCharactersCharacterIdFleet othersame = ((GetCharactersCharacterIdFleet) other);
        if (fleet_id!= othersame.fleet_id) {
            return false;
        }
        if ((role!= othersame.role)&&((role == null)||(!role.equals(othersame.role)))) {
            return false;
        }
        if (squad_id!= othersame.squad_id) {
            return false;
        }
        if (wing_id!= othersame.wing_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((Long.hashCode(fleet_id)+((role == null)? 0 :role.hashCode()))+ Long.hashCode(squad_id))+ Long.hashCode(wing_id));
    }
}
