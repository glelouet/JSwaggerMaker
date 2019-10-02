package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCorporationsCorporationIdStarbasesStarbaseIdFuelBayView {
    @JsonProperty("alliance_member")
    alliance_member("alliance_member"),
    @JsonProperty("config_starbase_equipment_role")
    config_starbase_equipment_role("config_starbase_equipment_role"),
    @JsonProperty("corporation_member")
    corporation_member("corporation_member"),
    @JsonProperty("starbase_fuel_technician_role")
    starbase_fuel_technician_role("starbase_fuel_technician_role");
    public final String toString;

    GetCorporationsCorporationIdStarbasesStarbaseIdFuelBayView(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
