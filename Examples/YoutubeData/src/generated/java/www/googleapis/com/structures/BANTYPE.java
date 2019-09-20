package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum BANTYPE {
    @JsonProperty("permanent")
    permanent("permanent"),
    @JsonProperty("temporary")
    temporary("temporary");
    public final String toString;

    BANTYPE(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
