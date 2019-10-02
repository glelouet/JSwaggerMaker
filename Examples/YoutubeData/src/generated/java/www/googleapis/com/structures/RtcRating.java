package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum RtcRating {
    @JsonProperty("rtcA")
    rtcA("rtcA"),
    @JsonProperty("rtcAa")
    rtcAa("rtcAa"),
    @JsonProperty("rtcB")
    rtcB("rtcB"),
    @JsonProperty("rtcB15")
    rtcB15("rtcB15"),
    @JsonProperty("rtcC")
    rtcC("rtcC"),
    @JsonProperty("rtcD")
    rtcD("rtcD"),
    @JsonProperty("rtcUnrated")
    rtcUnrated("rtcUnrated");
    public final String toString;

    RtcRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
