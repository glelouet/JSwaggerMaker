package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Uploadstatus {
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

    Uploadstatus(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
