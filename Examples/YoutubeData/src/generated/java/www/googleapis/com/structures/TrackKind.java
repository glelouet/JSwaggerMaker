package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TrackKind {
    @JsonProperty("ASR")
    ASR("ASR"),
    @JsonProperty("forced")
    forced("forced"),
    @JsonProperty("standard")
    standard("standard");
    public final String toString;

    TrackKind(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
