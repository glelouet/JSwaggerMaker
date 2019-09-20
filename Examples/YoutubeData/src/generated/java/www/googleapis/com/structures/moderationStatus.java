package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum moderationStatus {
    @JsonProperty("heldForReview")
    heldForReview("heldForReview"),
    @JsonProperty("likelySpam")
    likelySpam("likelySpam"),
    @JsonProperty("published")
    published("published");
    public final String toString;

    moderationStatus(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
