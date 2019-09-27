package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Activitytype {
    @JsonProperty("all")
    all("all"),
    @JsonProperty("uploads")
    uploads("uploads");
    public final String toString;

    Activitytype(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
