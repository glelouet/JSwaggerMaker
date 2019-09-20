package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum videoSyndicated {
    @JsonProperty("any")
    any("any"),
    @JsonProperty("true")
    _true("true");
    public final String toString;

    videoSyndicated(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
