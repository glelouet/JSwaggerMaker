package esi.evetech.net.responses;

public class get_insurance_prices_200 {
    /**
     * A list of a available insurance levels for this ship type
     */
    public get_insurance_prices_levels[] levels;
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
        get_insurance_prices_200 othersame = ((get_insurance_prices_200) other);
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
