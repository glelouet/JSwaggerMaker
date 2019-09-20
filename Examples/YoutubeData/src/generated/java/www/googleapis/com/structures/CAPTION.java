package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CAPTION {
    @JsonProperty("false")
    _false("false"),
    @JsonProperty("true")
    _true("true");
    public final String toString;

    CAPTION(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
