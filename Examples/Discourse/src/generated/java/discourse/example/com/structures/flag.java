package discourse.example.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum flag {
    @JsonProperty("active")
    active("active"),
    @JsonProperty("new")
    _new("new"),
    @JsonProperty("staff")
    staff("staff"),
    @JsonProperty("suspended")
    suspended("suspended"),
    @JsonProperty("blocked")
    blocked("blocked"),
    @JsonProperty("suspect")
    suspect("suspect");
    public final String toString;

    flag(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
