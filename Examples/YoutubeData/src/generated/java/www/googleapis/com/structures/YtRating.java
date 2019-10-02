package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum YtRating {
    @JsonProperty("ytAgeRestricted")
    ytAgeRestricted("ytAgeRestricted");
    public final String toString;

    YtRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
