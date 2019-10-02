package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCharactersCharacterIdOrdersHistoryState {
    @JsonProperty("cancelled")
    cancelled("cancelled"),
    @JsonProperty("expired")
    expired("expired");
    public final String toString;

    GetCharactersCharacterIdOrdersHistoryState(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
