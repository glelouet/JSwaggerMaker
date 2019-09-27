package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Framerate {
    @JsonProperty("30fps")
    _30fps("30fps"),
    @JsonProperty("60fps")
    _60fps("60fps"),
    @JsonProperty("variable")
    variable("variable");
    public final String toString;

    Framerate(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
