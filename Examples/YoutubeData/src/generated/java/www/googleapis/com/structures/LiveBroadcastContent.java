package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum LiveBroadcastContent {
    @JsonProperty("live")
    live("live"),
    @JsonProperty("none")
    none("none"),
    @JsonProperty("upcoming")
    upcoming("upcoming");
    public final String toString;

    LiveBroadcastContent(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
