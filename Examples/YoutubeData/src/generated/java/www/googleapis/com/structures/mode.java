package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum mode {
    @JsonProperty("all_current")
    all_current("all_current"),
    @JsonProperty("updates")
    updates("updates");
    public final String toString;

    mode(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
