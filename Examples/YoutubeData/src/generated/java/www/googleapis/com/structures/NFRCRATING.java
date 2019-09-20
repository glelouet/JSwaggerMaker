package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum NFRCRATING {
    @JsonProperty("nfrcA")
    nfrcA("nfrcA"),
    @JsonProperty("nfrcB")
    nfrcB("nfrcB"),
    @JsonProperty("nfrcC")
    nfrcC("nfrcC"),
    @JsonProperty("nfrcD")
    nfrcD("nfrcD"),
    @JsonProperty("nfrcUnrated")
    nfrcUnrated("nfrcUnrated"),
    @JsonProperty("nfrcX")
    nfrcX("nfrcX");
    public final String toString;

    NFRCRATING(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
