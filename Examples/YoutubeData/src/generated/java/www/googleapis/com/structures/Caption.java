package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Caption {
    @JsonProperty("false")
    _false("false"),
    @JsonProperty("true")
    _true("true");
    public final String toString;

    Caption(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
