package api.github.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum state {
    @JsonProperty("open")
    open("open"),
    @JsonProperty("closed")
    closed("closed");
    public final String toString;

    state(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
