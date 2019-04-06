package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum datasource {
    @JsonProperty("tranquility")
    tranquility("tranquility"),
    @JsonProperty("singularity")
    singularity("singularity");
    public final String toString;

    datasource(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
