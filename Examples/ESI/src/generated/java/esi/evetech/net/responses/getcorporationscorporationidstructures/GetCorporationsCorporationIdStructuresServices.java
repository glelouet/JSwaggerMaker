package esi.evetech.net.responses.getcorporationscorporationidstructures;

import esi.evetech.net.structures.GetCorporationsCorporationIdStructuresServiceState;

public class GetCorporationsCorporationIdStructuresServices {
    /**
     * name string
     */
    public String name;
    /**
     * state string
     */
    public GetCorporationsCorporationIdStructuresServiceState state;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCorporationsCorporationIdStructuresServices othersame = ((GetCorporationsCorporationIdStructuresServices) other);
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
