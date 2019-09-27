package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Smsarating {
    @JsonProperty("smsa11")
    smsa11("smsa11"),
    @JsonProperty("smsa15")
    smsa15("smsa15"),
    @JsonProperty("smsa7")
    smsa7("smsa7"),
    @JsonProperty("smsaA")
    smsaA("smsaA"),
    @JsonProperty("smsaUnrated")
    smsaUnrated("smsaUnrated");
    public final String toString;

    Smsarating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
