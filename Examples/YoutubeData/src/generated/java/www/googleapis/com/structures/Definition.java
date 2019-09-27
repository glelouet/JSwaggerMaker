package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Definition {
    @JsonProperty("hd")
    hd("hd"),
    @JsonProperty("sd")
    sd("sd");
    public final String toString;

    Definition(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
