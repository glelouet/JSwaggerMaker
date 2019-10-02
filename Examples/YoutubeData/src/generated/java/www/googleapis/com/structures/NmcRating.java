package www.googleapis.com.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum NmcRating {
    @JsonProperty("nmc15plus")
    nmc15plus("nmc15plus"),
    @JsonProperty("nmc18plus")
    nmc18plus("nmc18plus"),
    @JsonProperty("nmc18tc")
    nmc18tc("nmc18tc"),
    @JsonProperty("nmcG")
    nmcG("nmcG"),
    @JsonProperty("nmcPg")
    nmcPg("nmcPg"),
    @JsonProperty("nmcPg13")
    nmcPg13("nmcPg13"),
    @JsonProperty("nmcPg15")
    nmcPg15("nmcPg15"),
    @JsonProperty("nmcUnrated")
    nmcUnrated("nmcUnrated");
    public final String toString;

    NmcRating(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
