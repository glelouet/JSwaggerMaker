package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCorporationsCorporationIdCustomsOfficesStandingLevel {
    @JsonProperty("bad")
    bad("bad"),
    @JsonProperty("excellent")
    excellent("excellent"),
    @JsonProperty("good")
    good("good"),
    @JsonProperty("neutral")
    neutral("neutral"),
    @JsonProperty("terrible")
    terrible("terrible");
    public final String toString;

    GetCorporationsCorporationIdCustomsOfficesStandingLevel(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
