package esi.evetech.net.responses.getinsuranceprices;

public class GetInsurancePricesLevels {
    /**
     * cost number
     */
    public float cost;
    /**
     * Localized insurance level
     */
    public String name;
    /**
     * payout number
     */
    public float payout;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetInsurancePricesLevels othersame = ((GetInsurancePricesLevels) other);
        if (cost!= othersame.cost) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if (payout!= othersame.payout) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((Double.hashCode(cost)+((name == null)? 0 :name.hashCode()))+ Double.hashCode(payout));
    }
}
