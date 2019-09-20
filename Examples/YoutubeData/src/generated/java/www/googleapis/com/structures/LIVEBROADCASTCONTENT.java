package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum LIVEBROADCASTCONTENT {
    @JsonProperty("live")
    live("live"),
    @JsonProperty("none")
    none("none"),
    @JsonProperty("upcoming")
    upcoming("upcoming");
    public final String toString;

    LIVEBROADCASTCONTENT(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
