package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum UPLOADSTATUS {
    @JsonProperty("deleted")
    deleted("deleted"),
    @JsonProperty("failed")
    failed("failed"),
    @JsonProperty("processed")
    processed("processed"),
    @JsonProperty("rejected")
    rejected("rejected"),
    @JsonProperty("uploaded")
    uploaded("uploaded");
    public final String toString;

    UPLOADSTATUS(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
