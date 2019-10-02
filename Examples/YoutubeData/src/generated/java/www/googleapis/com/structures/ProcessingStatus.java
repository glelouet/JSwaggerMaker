package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ProcessingStatus {
    @JsonProperty("failed")
    failed("failed"),
    @JsonProperty("processing")
    processing("processing"),
    @JsonProperty("succeeded")
    succeeded("succeeded"),
    @JsonProperty("terminated")
    terminated("terminated");
    public final String toString;

    ProcessingStatus(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
