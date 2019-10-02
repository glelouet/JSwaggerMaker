package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PostUniverseNamesCategory {
    @JsonProperty("alliance")
    alliance("alliance"),
    @JsonProperty("character")
    character("character"),
    @JsonProperty("constellation")
    constellation("constellation"),
    @JsonProperty("corporation")
    corporation("corporation"),
    @JsonProperty("inventory_type")
    inventory_type("inventory_type"),
    @JsonProperty("region")
    region("region"),
    @JsonProperty("solar_system")
    solar_system("solar_system"),
    @JsonProperty("station")
    station("station"),
    @JsonProperty("faction")
    faction("faction");
    public final String toString;

    PostUniverseNamesCategory(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
