package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum safeSearch {
    @JsonProperty("moderate")
    moderate("moderate"),
    @JsonProperty("none")
    none("none"),
    @JsonProperty("strict")
    strict("strict");
    public final String toString;

    safeSearch(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
