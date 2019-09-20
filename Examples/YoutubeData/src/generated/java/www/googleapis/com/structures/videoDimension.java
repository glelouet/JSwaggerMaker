package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum videoDimension {
    @JsonProperty("2d")
    _2d("2d"),
    @JsonProperty("3d")
    _3d("3d"),
    @JsonProperty("any")
    any("any");
    public final String toString;

    videoDimension(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
