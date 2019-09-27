package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Bantype {
    @JsonProperty("permanent")
    permanent("permanent"),
    @JsonProperty("temporary")
    temporary("temporary");
    public final String toString;

    Bantype(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
