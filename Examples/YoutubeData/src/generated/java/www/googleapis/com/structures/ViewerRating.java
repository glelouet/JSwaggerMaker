package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ViewerRating {
    @JsonProperty("dislike")
    dislike("dislike"),
    @JsonProperty("like")
    like("like"),
    @JsonProperty("none")
    none("none"),
    @JsonProperty("unspecified")
    unspecified("unspecified");
    public final String toString;

    ViewerRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
