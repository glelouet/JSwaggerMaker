package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CONTEXT {
    @JsonProperty("cview")
    cview("cview"),
    @JsonProperty("subscribe")
    subscribe("subscribe"),
    @JsonProperty("unsubscribe")
    unsubscribe("unsubscribe");
    public final String toString;

    CONTEXT(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
