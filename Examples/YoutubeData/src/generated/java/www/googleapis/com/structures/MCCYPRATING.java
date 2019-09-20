package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum MCCYPRATING {
    @JsonProperty("mccyp11")
    mccyp11("mccyp11"),
    @JsonProperty("mccyp15")
    mccyp15("mccyp15"),
    @JsonProperty("mccyp7")
    mccyp7("mccyp7"),
    @JsonProperty("mccypA")
    mccypA("mccypA"),
    @JsonProperty("mccypUnrated")
    mccypUnrated("mccypUnrated");
    public final String toString;

    MCCYPRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
