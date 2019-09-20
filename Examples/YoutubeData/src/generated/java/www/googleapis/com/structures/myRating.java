package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum myRating {
    @JsonProperty("dislike")
    dislike("dislike"),
    @JsonProperty("like")
    like("like");
    public final String toString;

    myRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
