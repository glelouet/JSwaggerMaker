package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCharactersCharacterIdClonesLocationType {
    @JsonProperty("station")
    station("station"),
    @JsonProperty("structure")
    structure("structure");
    public final String toString;

    GetCharactersCharacterIdClonesLocationType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
