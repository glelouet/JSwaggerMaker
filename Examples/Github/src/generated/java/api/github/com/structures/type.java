package api.github.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum type {
    @JsonProperty("all")
    all("all"),
    @JsonProperty("public")
    _public("public"),
    @JsonProperty("private")
    _private("private"),
    @JsonProperty("forks")
    forks("forks"),
    @JsonProperty("sources")
    sources("sources"),
    @JsonProperty("member")
    member("member");
    public final String toString;

    type(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
