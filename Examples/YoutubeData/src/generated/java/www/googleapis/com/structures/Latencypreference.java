package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Latencypreference {
    @JsonProperty("low")
    low("low"),
    @JsonProperty("normal")
    normal("normal"),
    @JsonProperty("ultraLow")
    ultraLow("ultraLow");
    public final String toString;

    Latencypreference(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
