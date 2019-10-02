package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ModerationStatus {
    @JsonProperty("heldForReview")
    heldForReview("heldForReview"),
    @JsonProperty("likelySpam")
    likelySpam("likelySpam"),
    @JsonProperty("published")
    published("published"),
    @JsonProperty("rejected")
    rejected("rejected");
    public final String toString;

    ModerationStatus(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
