package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Stereolayout {
    @JsonProperty("left_right")
    left_right("left_right"),
    @JsonProperty("mono")
    mono("mono"),
    @JsonProperty("top_bottom")
    top_bottom("top_bottom");
    public final String toString;

    Stereolayout(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
