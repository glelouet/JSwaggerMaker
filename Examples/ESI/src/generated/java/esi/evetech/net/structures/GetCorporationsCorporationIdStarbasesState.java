package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCorporationsCorporationIdStarbasesState {
    @JsonProperty("offline")
    offline("offline"),
    @JsonProperty("online")
    online("online"),
    @JsonProperty("onlining")
    onlining("onlining"),
    @JsonProperty("reinforced")
    reinforced("reinforced"),
    @JsonProperty("unanchoring")
    unanchoring("unanchoring");
    public final String toString;

    GetCorporationsCorporationIdStarbasesState(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
