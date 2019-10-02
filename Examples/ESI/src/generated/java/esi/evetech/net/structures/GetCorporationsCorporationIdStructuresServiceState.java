package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCorporationsCorporationIdStructuresServiceState {
    @JsonProperty("online")
    online("online"),
    @JsonProperty("offline")
    offline("offline"),
    @JsonProperty("cleanup")
    cleanup("cleanup");
    public final String toString;

    GetCorporationsCorporationIdStructuresServiceState(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
