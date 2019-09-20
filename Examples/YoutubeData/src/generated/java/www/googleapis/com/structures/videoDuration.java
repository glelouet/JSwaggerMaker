package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum videoDuration {
    @JsonProperty("any")
    any("any"),
    @JsonProperty("long")
    _long("long"),
    @JsonProperty("medium")
    medium("medium"),
    @JsonProperty("short")
    _short("short");
    public final String toString;

    videoDuration(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
