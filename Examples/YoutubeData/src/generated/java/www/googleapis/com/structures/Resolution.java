package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Resolution {
    @JsonProperty("1080p")
    _1080p("1080p"),
    @JsonProperty("1440p")
    _1440p("1440p"),
    @JsonProperty("2160p")
    _2160p("2160p"),
    @JsonProperty("240p")
    _240p("240p"),
    @JsonProperty("360p")
    _360p("360p"),
    @JsonProperty("480p")
    _480p("480p"),
    @JsonProperty("720p")
    _720p("720p"),
    @JsonProperty("variable")
    variable("variable");
    public final String toString;

    Resolution(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
