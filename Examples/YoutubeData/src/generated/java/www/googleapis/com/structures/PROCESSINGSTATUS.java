package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PROCESSINGSTATUS {
    @JsonProperty("failed")
    failed("failed"),
    @JsonProperty("processing")
    processing("processing"),
    @JsonProperty("succeeded")
    succeeded("succeeded"),
    @JsonProperty("terminated")
    terminated("terminated");
    public final String toString;

    PROCESSINGSTATUS(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
