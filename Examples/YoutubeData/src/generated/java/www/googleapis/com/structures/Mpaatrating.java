package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Mpaatrating {
    @JsonProperty("mpaatGb")
    mpaatGb("mpaatGb"),
    @JsonProperty("mpaatRb")
    mpaatRb("mpaatRb");
    public final String toString;

    Mpaatrating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
