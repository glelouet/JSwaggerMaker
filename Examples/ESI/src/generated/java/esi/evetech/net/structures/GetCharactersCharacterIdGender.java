package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCharactersCharacterIdGender {
    @JsonProperty("female")
    female("female"),
    @JsonProperty("male")
    male("male");
    public final String toString;

    GetCharactersCharacterIdGender(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
