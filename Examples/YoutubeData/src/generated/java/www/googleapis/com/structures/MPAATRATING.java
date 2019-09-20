package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum MPAATRATING {
    @JsonProperty("mpaatGb")
    mpaatGb("mpaatGb"),
    @JsonProperty("mpaatRb")
    mpaatRb("mpaatRb");
    public final String toString;

    MPAATRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
