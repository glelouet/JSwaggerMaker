package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Caption {
    @JsonProperty("false")
    false_("false"),
    @JsonProperty("true")
    true_("true");
    public final String toString;

    Caption(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
