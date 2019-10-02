package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CatvfrRating {
    @JsonProperty("catvfr13plus")
    catvfr13plus("catvfr13plus"),
    @JsonProperty("catvfr16plus")
    catvfr16plus("catvfr16plus"),
    @JsonProperty("catvfr18plus")
    catvfr18plus("catvfr18plus"),
    @JsonProperty("catvfr8plus")
    catvfr8plus("catvfr8plus"),
    @JsonProperty("catvfrG")
    catvfrG("catvfrG"),
    @JsonProperty("catvfrUnrated")
    catvfrUnrated("catvfrUnrated");
    public final String toString;

    CatvfrRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
