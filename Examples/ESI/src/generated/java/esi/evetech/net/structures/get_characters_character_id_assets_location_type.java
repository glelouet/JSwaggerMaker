package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum get_characters_character_id_assets_location_type {
    @JsonProperty("station")
    station("station"),
    @JsonProperty("solar_system")
    solar_system("solar_system"),
    @JsonProperty("other")
    other("other");
    public final String toString;

    get_characters_character_id_assets_location_type(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
