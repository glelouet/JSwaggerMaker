package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCorporationsCorporationIdOrdersHistoryState {
    @JsonProperty("cancelled")
    cancelled("cancelled"),
    @JsonProperty("expired")
    expired("expired");
    public final String toString;

    GetCorporationsCorporationIdOrdersHistoryState(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
