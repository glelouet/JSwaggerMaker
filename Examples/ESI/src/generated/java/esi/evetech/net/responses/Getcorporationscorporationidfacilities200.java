package esi.evetech.net.responses;

public class Getcorporationscorporationidfacilities200 {
    /**
     * facility_id integer
     */
    public long facility_id;
    /**
     * system_id integer
     */
    public int system_id;
    /**
     * type_id integer
     */
    public int type_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getcorporationscorporationidfacilities200 othersame = ((Getcorporationscorporationidfacilities200) other);
        if (facility_id!= othersame.facility_id) {
            return false;
        }
        if (system_id!= othersame.system_id) {
            return false;
        }
        if (type_id!= othersame.type_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((Long.hashCode(facility_id)+ system_id)+ type_id);
    }
}
