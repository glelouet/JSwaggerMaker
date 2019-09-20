package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TRACKKIND {
    @JsonProperty("ASR")
    ASR("ASR"),
    @JsonProperty("forced")
    forced("forced"),
    @JsonProperty("standard")
    standard("standard");
    public final String toString;

    TRACKKIND(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
