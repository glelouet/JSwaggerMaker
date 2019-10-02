package esi.evetech.net.responses;

import esi.evetech.net.structures.GetCorporationsCorporationIdTitlesGrantableRoles;
import esi.evetech.net.structures.GetCorporationsCorporationIdTitlesGrantableRolesAtBase;
import esi.evetech.net.structures.GetCorporationsCorporationIdTitlesGrantableRolesAtHq;
import esi.evetech.net.structures.GetCorporationsCorporationIdTitlesGrantableRolesAtOther;
import esi.evetech.net.structures.GetCorporationsCorporationIdTitlesRoles;
import esi.evetech.net.structures.GetCorporationsCorporationIdTitlesRolesAtBase;
import esi.evetech.net.structures.GetCorporationsCorporationIdTitlesRolesAtHq;
import esi.evetech.net.structures.GetCorporationsCorporationIdTitlesRolesAtOther;

public class GetCorporationsCorporationIdTitles {
    /**
     * grantable_roles array
     */
    public GetCorporationsCorporationIdTitlesGrantableRoles[] grantable_roles;
    /**
     * grantable_roles_at_base array
     */
    public GetCorporationsCorporationIdTitlesGrantableRolesAtBase[] grantable_roles_at_base;
    /**
     * grantable_roles_at_hq array
     */
    public GetCorporationsCorporationIdTitlesGrantableRolesAtHq[] grantable_roles_at_hq;
    /**
     * grantable_roles_at_other array
     */
    public GetCorporationsCorporationIdTitlesGrantableRolesAtOther[] grantable_roles_at_other;
    /**
     * name string
     */
    public String name;
    /**
     * roles array
     */
    public GetCorporationsCorporationIdTitlesRoles[] roles;
    /**
     * roles_at_base array
     */
    public GetCorporationsCorporationIdTitlesRolesAtBase[] roles_at_base;
    /**
     * roles_at_hq array
     */
    public GetCorporationsCorporationIdTitlesRolesAtHq[] roles_at_hq;
    /**
     * roles_at_other array
     */
    public GetCorporationsCorporationIdTitlesRolesAtOther[] roles_at_other;
    /**
     * title_id integer
     */
    public int title_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCorporationsCorporationIdTitles othersame = ((GetCorporationsCorporationIdTitles) other);
        if ((grantable_roles!= othersame.grantable_roles)&&((grantable_roles == null)||(!grantable_roles.equals(othersame.grantable_roles)))) {
            return false;
        }
        if ((grantable_roles_at_base!= othersame.grantable_roles_at_base)&&((grantable_roles_at_base == null)||(!grantable_roles_at_base.equals(othersame.grantable_roles_at_base)))) {
            return false;
        }
        if ((grantable_roles_at_hq!= othersame.grantable_roles_at_hq)&&((grantable_roles_at_hq == null)||(!grantable_roles_at_hq.equals(othersame.grantable_roles_at_hq)))) {
            return false;
        }
        if ((grantable_roles_at_other!= othersame.grantable_roles_at_other)&&((grantable_roles_at_other == null)||(!grantable_roles_at_other.equals(othersame.grantable_roles_at_other)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((roles!= othersame.roles)&&((roles == null)||(!roles.equals(othersame.roles)))) {
            return false;
        }
        if ((roles_at_base!= othersame.roles_at_base)&&((roles_at_base == null)||(!roles_at_base.equals(othersame.roles_at_base)))) {
            return false;
        }
        if ((roles_at_hq!= othersame.roles_at_hq)&&((roles_at_hq == null)||(!roles_at_hq.equals(othersame.roles_at_hq)))) {
            return false;
        }
        if ((roles_at_other!= othersame.roles_at_other)&&((roles_at_other == null)||(!roles_at_other.equals(othersame.roles_at_other)))) {
            return false;
        }
        if (title_id!= othersame.title_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((grantable_roles == null)? 0 :grantable_roles.hashCode())+((grantable_roles_at_base == null)? 0 :grantable_roles_at_base.hashCode()))+((grantable_roles_at_hq == null)? 0 :grantable_roles_at_hq.hashCode()))+((grantable_roles_at_other == null)? 0 :grantable_roles_at_other.hashCode()))+((name == null)? 0 :name.hashCode()))+((roles == null)? 0 :roles.hashCode()))+((roles_at_base == null)? 0 :roles_at_base.hashCode()))+((roles_at_hq == null)? 0 :roles_at_hq.hashCode()))+((roles_at_other == null)? 0 :roles_at_other.hashCode()))+ title_id);
    }
}
