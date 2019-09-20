package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum LATENCYPREFERENCE {
    @JsonProperty("low")
    low("low"),
    @JsonProperty("normal")
    normal("normal"),
    @JsonProperty("ultraLow")
    ultraLow("ultraLow");
    public final String toString;

    LATENCYPREFERENCE(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
