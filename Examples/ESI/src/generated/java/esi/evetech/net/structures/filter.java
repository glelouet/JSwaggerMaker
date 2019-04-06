package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum filter {
    @JsonProperty("market")
    market("market"),
    @JsonProperty("manufacturing_basic")
    manufacturing_basic("manufacturing_basic");
    public final String toString;

    filter(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
