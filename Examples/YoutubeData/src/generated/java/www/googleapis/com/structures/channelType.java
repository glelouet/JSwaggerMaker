package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum channelType {
    @JsonProperty("any")
    any("any"),
    @JsonProperty("show")
    show("show");
    public final String toString;

    channelType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
