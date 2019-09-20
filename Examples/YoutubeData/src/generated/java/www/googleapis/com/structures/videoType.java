package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum videoType {
    @JsonProperty("any")
    any("any"),
    @JsonProperty("episode")
    episode("episode"),
    @JsonProperty("movie")
    movie("movie");
    public final String toString;

    videoType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
