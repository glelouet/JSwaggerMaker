package esi.evetech.net.responses;

import esi.evetech.net.structures.GetFwSystemsContested;

public class GetFwSystems {
    /**
     * contested string
     */
    public GetFwSystemsContested contested;
    /**
     * occupier_faction_id integer
     */
    public int occupier_faction_id;
    /**
     * owner_faction_id integer
     */
    public int owner_faction_id;
    /**
     * solar_system_id integer
     */
    public int solar_system_id;
    /**
     * victory_points integer
     */
    public int victory_points;
    /**
     * victory_points_threshold integer
     */
    public int victory_points_threshold;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetFwSystems othersame = ((GetFwSystems) other);
        if ((contested!= othersame.contested)&&((contested == null)||(!contested.equals(othersame.contested)))) {
            return false;
        }
        if (occupier_faction_id!= othersame.occupier_faction_id) {
            return false;
        }
        if (owner_faction_id!= othersame.owner_faction_id) {
            return false;
        }
        if (solar_system_id!= othersame.solar_system_id) {
            return false;
        }
        if (victory_points!= othersame.victory_points) {
            return false;
        }
        if (victory_points_threshold!= othersame.victory_points_threshold) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((contested == null)? 0 :contested.hashCode())+ occupier_faction_id)+ owner_faction_id)+ solar_system_id)+ victory_points)+ victory_points_threshold);
    }
}
