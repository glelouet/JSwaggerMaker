package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum StreamStatus {
    @JsonProperty("active")
    active("active"),
    @JsonProperty("created")
    created("created"),
    @JsonProperty("error")
    error("error"),
    @JsonProperty("inactive")
    inactive("inactive"),
    @JsonProperty("ready")
    ready("ready");
    public final String toString;

    StreamStatus(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
