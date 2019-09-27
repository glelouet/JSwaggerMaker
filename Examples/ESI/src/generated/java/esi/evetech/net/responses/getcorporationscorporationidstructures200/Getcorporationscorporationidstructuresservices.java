package esi.evetech.net.responses.getcorporationscorporationidstructures200;

import esi.evetech.net.structures.get_corporations_corporation_id_structures_service_state;

public class Getcorporationscorporationidstructuresservices {
    /**
     * name string
     */
    public String name;
    /**
     * state string
     */
    public get_corporations_corporation_id_structures_service_state state;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getcorporationscorporationidstructuresservices othersame = ((Getcorporationscorporationidstructuresservices) other);
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((state!= othersame.state)&&((state == null)||(!state.equals(othersame.state)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((name == null)? 0 :name.hashCode())+((state == null)? 0 :state.hashCode()));
    }
}
