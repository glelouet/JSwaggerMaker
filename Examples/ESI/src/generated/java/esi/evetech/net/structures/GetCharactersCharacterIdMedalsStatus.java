package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCharactersCharacterIdMedalsStatus {
    @JsonProperty("public")
    public_("public"),
    @JsonProperty("private")
    private_("private");
    public final String toString;

    GetCharactersCharacterIdMedalsStatus(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
