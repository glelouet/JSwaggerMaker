package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum VideoGameRating {
    @JsonProperty("anyone")
    anyone("anyone"),
    @JsonProperty("m15Plus")
    m15Plus("m15Plus"),
    @JsonProperty("m16Plus")
    m16Plus("m16Plus"),
    @JsonProperty("m17Plus")
    m17Plus("m17Plus");
    public final String toString;

    VideoGameRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
