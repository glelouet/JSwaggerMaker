package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCharactersCharacterIdContractsAvailability {
    @JsonProperty("public")
    public_("public"),
    @JsonProperty("personal")
    personal("personal"),
    @JsonProperty("corporation")
    corporation("corporation"),
    @JsonProperty("alliance")
    alliance("alliance");
    public final String toString;

    GetCharactersCharacterIdContractsAvailability(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
