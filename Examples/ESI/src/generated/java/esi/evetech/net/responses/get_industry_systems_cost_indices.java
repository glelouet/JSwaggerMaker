package esi.evetech.net.responses;

import esi.evetech.net.structures.get_industry_systems_activity;

public class get_industry_systems_cost_indices {
    /**
     * activity string
     */
    public get_industry_systems_activity activity;
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
        get_industry_systems_cost_indices othersame = ((get_industry_systems_cost_indices) other);
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
