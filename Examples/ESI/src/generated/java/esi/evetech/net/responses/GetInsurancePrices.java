package esi.evetech.net.responses;

import esi.evetech.net.responses.getinsuranceprices.GetInsurancePricesLevels;

public class GetInsurancePrices {
    /**
     * A list of a available insurance levels for this ship type
     */
    public GetInsurancePricesLevels[] levels;
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
        GetInsurancePrices othersame = ((GetInsurancePrices) other);
        if ((levels!= othersame.levels)&&((levels == null)||(!levels.equals(othersame.levels)))) {
            return false;
        }
        if (type_id!= othersame.type_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((levels == null)? 0 :levels.hashCode())+ type_id);
    }
}
