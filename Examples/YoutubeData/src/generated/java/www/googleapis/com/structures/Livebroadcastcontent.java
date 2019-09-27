package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Livebroadcastcontent {
    @JsonProperty("live")
    live("live"),
    @JsonProperty("none")
    none("none"),
    @JsonProperty("upcoming")
    upcoming("upcoming");
    public final String toString;

    Livebroadcastcontent(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
