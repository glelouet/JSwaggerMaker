package api.github.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Encoding {
    @JsonProperty("utf-8")
    utf_8("utf-8"),
    @JsonProperty("base64")
    base64("base64");
    public final String toString;

    Encoding(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
