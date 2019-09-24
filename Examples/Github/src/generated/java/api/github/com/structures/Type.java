package api.github.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Type {
    @JsonProperty("User")
    User("User"),
    @JsonProperty("Organization")
    Organization("Organization");
    public final String toString;

    Type(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
