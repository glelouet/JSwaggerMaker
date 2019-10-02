package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum MtrcbRating {
    @JsonProperty("mtrcbG")
    mtrcbG("mtrcbG"),
    @JsonProperty("mtrcbPg")
    mtrcbPg("mtrcbPg"),
    @JsonProperty("mtrcbR13")
    mtrcbR13("mtrcbR13"),
    @JsonProperty("mtrcbR16")
    mtrcbR16("mtrcbR16"),
    @JsonProperty("mtrcbR18")
    mtrcbR18("mtrcbR18"),
    @JsonProperty("mtrcbUnrated")
    mtrcbUnrated("mtrcbUnrated"),
    @JsonProperty("mtrcbX")
    mtrcbX("mtrcbX");
    public final String toString;

    MtrcbRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
