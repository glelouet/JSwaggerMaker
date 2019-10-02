package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCharactersCharacterIdAssetsLocationType {
    @JsonProperty("station")
    station("station"),
    @JsonProperty("solar_system")
    solar_system("solar_system"),
    @JsonProperty("other")
    other("other");
    public final String toString;

    GetCharactersCharacterIdAssetsLocationType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
