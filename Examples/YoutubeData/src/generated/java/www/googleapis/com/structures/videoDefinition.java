package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum videoDefinition {
    @JsonProperty("any")
    any("any"),
    @JsonProperty("high")
    high("high"),
    @JsonProperty("standard")
    standard("standard");
    public final String toString;

    videoDefinition(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
