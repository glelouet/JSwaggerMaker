package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCorporationsCorporationIdAssetsLocationType {
    @JsonProperty("station")
    station("station"),
    @JsonProperty("solar_system")
    solar_system("solar_system"),
    @JsonProperty("other")
    other("other");
    public final String toString;

    GetCorporationsCorporationIdAssetsLocationType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
