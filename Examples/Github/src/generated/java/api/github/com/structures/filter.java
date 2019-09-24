package api.github.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum filter {
    @JsonProperty("assigned")
    assigned("assigned"),
    @JsonProperty("created")
    created("created"),
    @JsonProperty("mentioned")
    mentioned("mentioned"),
    @JsonProperty("subscribed")
    subscribed("subscribed"),
    @JsonProperty("all")
    all("all");
    public final String toString;

    filter(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
