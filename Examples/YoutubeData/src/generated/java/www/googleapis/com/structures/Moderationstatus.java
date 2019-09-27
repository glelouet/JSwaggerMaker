package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Moderationstatus {
    @JsonProperty("heldForReview")
    heldForReview("heldForReview"),
    @JsonProperty("likelySpam")
    likelySpam("likelySpam"),
    @JsonProperty("published")
    published("published"),
    @JsonProperty("rejected")
    rejected("rejected");
    public final String toString;

    Moderationstatus(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
