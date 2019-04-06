package esi.evetech.net.responses;

public class get_industry_systems_200 {
    /**
     * cost_indices array
     */
    public get_industry_systems_cost_indices[] cost_indices;
    /**
     * solar_system_id integer
     */
    public int solar_system_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        get_industry_systems_200 othersame = ((get_industry_systems_200) other);
        if ((cost_indices!= othersame.cost_indices)&&((cost_indices == null)||(!cost_indices.equals(othersame.cost_indices)))) {
            return false;
        }
        if (solar_system_id!= othersame.solar_system_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((cost_indices == null)? 0 :cost_indices.hashCode())+ solar_system_id);
    }
}
