package esi.evetech.net.responses;

import esi.evetech.net.structures.GetCorporationsCorporationIdBlueprintsLocationFlag;

public class GetCorporationsCorporationIdBlueprints {
    /**
     * Unique ID for this item.
     */
    public long item_id;
    /**
     * Type of the location_id
     */
    public GetCorporationsCorporationIdBlueprintsLocationFlag location_flag;
    /**
     * References a solar system, station or item_id if this blueprint is located within a container.
     */
    public long location_id;
    /**
     * Material Efficiency Level of the blueprint.
     */
    public int material_efficiency;
    /**
     * A range of numbers with a minimum of -2 and no maximum value where -1 is an original and -2 is a copy. It can be a positive integer if it is a stack of blueprint originals fresh from the market (e.g. no activities performed on them yet).
     */
    public int quantity;
    /**
     * Number of runs remaining if the blueprint is a copy, -1 if it is an original.
     */
    public int runs;
    /**
     * Time Efficiency Level of the blueprint.
     */
    public int time_efficiency;
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
        GetCorporationsCorporationIdBlueprints othersame = ((GetCorporationsCorporationIdBlueprints) other);
        if (item_id!= othersame.item_id) {
            return false;
        }
        if ((location_flag!= othersame.location_flag)&&((location_flag == null)||(!location_flag.equals(othersame.location_flag)))) {
            return false;
        }
        if (location_id!= othersame.location_id) {
            return false;
        }
        if (material_efficiency!= othersame.material_efficiency) {
            return false;
        }
        if (quantity!= othersame.quantity) {
            return false;
        }
        if (runs!= othersame.runs) {
            return false;
        }
        if (time_efficiency!= othersame.time_efficiency) {
            return false;
        }
        if (type_id!= othersame.type_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((Long.hashCode(item_id)+((location_flag == null)? 0 :location_flag.hashCode()))+ Long.hashCode(location_id))+ material_efficiency)+ quantity)+ runs)+ time_efficiency)+ type_id);
    }
}
