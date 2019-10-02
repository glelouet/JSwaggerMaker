package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ActivityType {
    @JsonProperty("all")
    all("all"),
    @JsonProperty("uploads")
    uploads("uploads");
    public final String toString;

    ActivityType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
