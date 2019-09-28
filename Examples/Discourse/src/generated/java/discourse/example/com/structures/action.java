package discourse.example.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum action {
    @JsonProperty("sent")
    sent("sent"),
    @JsonProperty("skipped")
    skipped("skipped"),
    @JsonProperty("bounced")
    bounced("bounced"),
    @JsonProperty("received")
    received("received"),
    @JsonProperty("rejected")
    rejected("rejected");
    public final String toString;

    action(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
