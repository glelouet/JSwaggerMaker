package api.github.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Permission {
    @JsonProperty("pull")
    pull("pull"),
    @JsonProperty("push")
    push("push"),
    @JsonProperty("admin")
    admin("admin");
    public final String toString;

    Permission(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
