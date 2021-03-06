package esi.evetech.net.responses;

import esi.evetech.net.structures.GetCorporationsCorporationIdRolesHistoryNewRoles;
import esi.evetech.net.structures.GetCorporationsCorporationIdRolesHistoryOldRoles;
import esi.evetech.net.structures.GetCorporationsCorporationIdRolesHistoryRoleType;

public class GetCorporationsCorporationIdRolesHistory {
    /**
     * changed_at string
     */
    public String changed_at;
    /**
     * The character whose roles are changed
     */
    public int character_id;
    /**
     * ID of the character who issued this change
     */
    public int issuer_id;
    /**
     * new_roles array
     */
    public GetCorporationsCorporationIdRolesHistoryNewRoles[] new_roles;
    /**
     * old_roles array
     */
    public GetCorporationsCorporationIdRolesHistoryOldRoles[] old_roles;
    /**
     * role_type string
     */
    public GetCorporationsCorporationIdRolesHistoryRoleType role_type;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCorporationsCorporationIdRolesHistory othersame = ((GetCorporationsCorporationIdRolesHistory) other);
        if ((changed_at!= othersame.changed_at)&&((changed_at == null)||(!changed_at.equals(othersame.changed_at)))) {
            return false;
        }
        if (character_id!= othersame.character_id) {
            return false;
        }
        if (issuer_id!= othersame.issuer_id) {
            return false;
        }
        if ((new_roles!= othersame.new_roles)&&((new_roles == null)||(!new_roles.equals(othersame.new_roles)))) {
            return false;
        }
        if ((old_roles!= othersame.old_roles)&&((old_roles == null)||(!old_roles.equals(othersame.old_roles)))) {
            return false;
        }
        if ((role_type!= othersame.role_type)&&((role_type == null)||(!role_type.equals(othersame.role_type)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((changed_at == null)? 0 :changed_at.hashCode())+ character_id)+ issuer_id)+((new_roles == null)? 0 :new_roles.hashCode()))+((old_roles == null)? 0 :old_roles.hashCode()))+((role_type == null)? 0 :role_type.hashCode()));
    }
}
