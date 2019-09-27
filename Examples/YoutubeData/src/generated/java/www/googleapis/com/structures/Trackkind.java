package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Trackkind {
    @JsonProperty("ASR")
    ASR("ASR"),
    @JsonProperty("forced")
    forced("forced"),
    @JsonProperty("standard")
    standard("standard");
    public final String toString;

    Trackkind(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
