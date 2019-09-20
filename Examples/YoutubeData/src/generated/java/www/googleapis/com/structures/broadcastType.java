package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum broadcastType {
    @JsonProperty("all")
    all("all"),
    @JsonProperty("event")
    event("event"),
    @JsonProperty("persistent")
    persistent("persistent");
    public final String toString;

    broadcastType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
