package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetIncursionsState {
    @JsonProperty("withdrawing")
    withdrawing("withdrawing"),
    @JsonProperty("mobilizing")
    mobilizing("mobilizing"),
    @JsonProperty("established")
    established("established");
    public final String toString;

    GetIncursionsState(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
