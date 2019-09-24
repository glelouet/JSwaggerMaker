package api.github.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum order {
    @JsonProperty("desc")
    desc("desc"),
    @JsonProperty("asc")
    asc("asc");
    public final String toString;

    order(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
