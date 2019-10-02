package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum LongUploadsStatus {
    @JsonProperty("allowed")
    allowed("allowed"),
    @JsonProperty("disallowed")
    disallowed("disallowed"),
    @JsonProperty("eligible")
    eligible("eligible"),
    @JsonProperty("longUploadsUnspecified")
    longUploadsUnspecified("longUploadsUnspecified");
    public final String toString;

    LongUploadsStatus(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
