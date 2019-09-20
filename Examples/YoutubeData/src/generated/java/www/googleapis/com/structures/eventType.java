package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum eventType {
    @JsonProperty("completed")
    completed("completed"),
    @JsonProperty("live")
    live("live"),
    @JsonProperty("upcoming")
    upcoming("upcoming");
    public final String toString;

    eventType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
