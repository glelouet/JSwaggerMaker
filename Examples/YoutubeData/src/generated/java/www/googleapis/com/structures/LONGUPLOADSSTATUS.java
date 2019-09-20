package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum LONGUPLOADSSTATUS {
    @JsonProperty("allowed")
    allowed("allowed"),
    @JsonProperty("disallowed")
    disallowed("disallowed"),
    @JsonProperty("eligible")
    eligible("eligible"),
    @JsonProperty("longUploadsUnspecified")
    longUploadsUnspecified("longUploadsUnspecified");
    public final String toString;

    LONGUPLOADSSTATUS(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
