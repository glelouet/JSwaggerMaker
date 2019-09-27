package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Longuploadsstatus {
    @JsonProperty("allowed")
    allowed("allowed"),
    @JsonProperty("disallowed")
    disallowed("disallowed"),
    @JsonProperty("eligible")
    eligible("eligible"),
    @JsonProperty("longUploadsUnspecified")
    longUploadsUnspecified("longUploadsUnspecified");
    public final String toString;

    Longuploadsstatus(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
