package fr.lelouet.jswaggermaker.compiler.client.compiled.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum STATUS {
    @JsonProperty("available")
    available("available"),
    @JsonProperty("pending")
    pending("pending"),
    @JsonProperty("sold")
    sold("sold");
    public final String toString;

    STATUS(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
