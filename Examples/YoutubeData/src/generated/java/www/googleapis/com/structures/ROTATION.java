package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ROTATION {
    @JsonProperty("clockwise")
    clockwise("clockwise"),
    @JsonProperty("counterClockwise")
    counterClockwise("counterClockwise"),
    @JsonProperty("none")
    none("none"),
    @JsonProperty("other")
    other("other"),
    @JsonProperty("upsideDown")
    upsideDown("upsideDown");
    public final String toString;

    ROTATION(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
