package api.github.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum sort {
    @JsonProperty("created")
    created("created"),
    @JsonProperty("updated")
    updated("updated"),
    @JsonProperty("comments")
    comments("comments");
    public final String toString;

    sort(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
