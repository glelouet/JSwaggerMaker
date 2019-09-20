package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum order {
    @JsonProperty("relevance")
    relevance("relevance"),
    @JsonProperty("time")
    time("time");
    public final String toString;

    order(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
