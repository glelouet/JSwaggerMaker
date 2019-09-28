package discourse.example.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum status {
    @JsonProperty("closed")
    closed("closed"),
    @JsonProperty("pinned")
    pinned("pinned"),
    @JsonProperty("pinned-globally")
    pinned_globally("pinned-globally"),
    @JsonProperty("archived")
    archived("archived"),
    @JsonProperty("visible")
    visible("visible");
    public final String toString;

    status(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
