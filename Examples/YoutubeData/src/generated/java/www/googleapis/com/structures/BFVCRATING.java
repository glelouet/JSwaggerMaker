package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum BFVCRATING {
    @JsonProperty("bfvc13")
    bfvc13("bfvc13"),
    @JsonProperty("bfvc15")
    bfvc15("bfvc15"),
    @JsonProperty("bfvc18")
    bfvc18("bfvc18"),
    @JsonProperty("bfvc20")
    bfvc20("bfvc20"),
    @JsonProperty("bfvcB")
    bfvcB("bfvcB"),
    @JsonProperty("bfvcE")
    bfvcE("bfvcE"),
    @JsonProperty("bfvcG")
    bfvcG("bfvcG"),
    @JsonProperty("bfvcUnrated")
    bfvcUnrated("bfvcUnrated");
    public final String toString;

    BFVCRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
