package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetFwSystemsContested {
    @JsonProperty("captured")
    captured("captured"),
    @JsonProperty("contested")
    contested("contested"),
    @JsonProperty("uncontested")
    uncontested("uncontested"),
    @JsonProperty("vulnerable")
    vulnerable("vulnerable");
    public final String toString;

    GetFwSystemsContested(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
