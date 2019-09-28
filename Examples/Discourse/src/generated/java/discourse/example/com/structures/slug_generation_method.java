package discourse.example.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum slug_generation_method {
    @JsonProperty("ascii")
    ascii("ascii"),
    @JsonProperty("enocded")
    enocded("enocded"),
    @JsonProperty("none")
    none("none");
    public final String toString;

    slug_generation_method(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
