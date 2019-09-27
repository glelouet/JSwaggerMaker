package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Status {
    @JsonProperty("failed")
    failed("failed"),
    @JsonProperty("serving")
    serving("serving"),
    @JsonProperty("syncing")
    syncing("syncing");
    public final String toString;

    Status(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
