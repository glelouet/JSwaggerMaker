package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum SEVERITY {
    @JsonProperty("error")
    error("error"),
    @JsonProperty("info")
    info("info"),
    @JsonProperty("warning")
    warning("warning");
    public final String toString;

    SEVERITY(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
