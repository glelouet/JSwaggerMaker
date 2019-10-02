package esi.evetech.net.responses.getindustrysystems;

import esi.evetech.net.structures.GetIndustrySystemsActivity;

public class GetIndustrySystemsCostIndices {
    /**
     * activity string
     */
    public GetIndustrySystemsActivity activity;
    /**
     * cost_index number
     */
    public float cost_index;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetIndustrySystemsCostIndices othersame = ((GetIndustrySystemsCostIndices) other);
        if ((activity!= othersame.activity)&&((activity == null)||(!activity.equals(othersame.activity)))) {
            return false;
        }
        if (cost_index!= othersame.cost_index) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((activity == null)? 0 :activity.hashCode())+ Double.hashCode(cost_index));
    }
}
