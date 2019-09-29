package esi.evetech.net.responses;

import esi.evetech.net.structures.get_alliances_alliance_id_contacts_contact_type;

public class Getalliancesallianceidcontacts {
    /**
     * contact_id integer
     */
    public int contact_id;
    /**
     * contact_type string
     */
    public get_alliances_alliance_id_contacts_contact_type contact_type;
    /**
     * label_ids array
     */
    public long[] label_ids;
    /**
     * Standing of the contact
     */
    public float standing;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getalliancesallianceidcontacts othersame = ((Getalliancesallianceidcontacts) other);
        if (contact_id!= othersame.contact_id) {
            return false;
        }
        if ((contact_type!= othersame.contact_type)&&((contact_type == null)||(!contact_type.equals(othersame.contact_type)))) {
            return false;
        }
        if ((label_ids!= othersame.label_ids)&&((label_ids == null)||(!label_ids.equals(othersame.label_ids)))) {
            return false;
        }
        if (standing!= othersame.standing) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((contact_id +((contact_type == null)? 0 :contact_type.hashCode()))+((label_ids == null)? 0 :label_ids.hashCode()))+ Double.hashCode(standing));
    }
}
