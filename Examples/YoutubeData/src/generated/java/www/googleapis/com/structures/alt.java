package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum alt {
    @JsonProperty("json")
    json("json");
    public final String toString;

    alt(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
