package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum BanType {
    @JsonProperty("permanent")
    permanent("permanent"),
    @JsonProperty("temporary")
    temporary("temporary");
    public final String toString;

    BanType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
