package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum videoCaption {
    @JsonProperty("any")
    any("any"),
    @JsonProperty("closedCaption")
    closedCaption("closedCaption"),
    @JsonProperty("none")
    none("none");
    public final String toString;

    videoCaption(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
