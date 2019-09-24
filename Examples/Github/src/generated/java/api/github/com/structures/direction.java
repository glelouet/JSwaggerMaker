package api.github.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum direction {
    @JsonProperty("asc")
    asc("asc"),
    @JsonProperty("desc")
    desc("desc");
    public final String toString;

    direction(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
