package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum broadcastStatus {
    @JsonProperty("active")
    active("active"),
    @JsonProperty("all")
    all("all"),
    @JsonProperty("completed")
    completed("completed"),
    @JsonProperty("upcoming")
    upcoming("upcoming");
    public final String toString;

    broadcastStatus(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
