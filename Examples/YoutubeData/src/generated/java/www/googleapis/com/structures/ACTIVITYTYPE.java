package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ACTIVITYTYPE {
    @JsonProperty("all")
    all("all"),
    @JsonProperty("uploads")
    uploads("uploads");
    public final String toString;

    ACTIVITYTYPE(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
