package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCorporationsCorporationIdOrdersHistoryRange {
    @JsonProperty("1")
    _1("1"),
    @JsonProperty("10")
    _10("10"),
    @JsonProperty("2")
    _2("2"),
    @JsonProperty("20")
    _20("20"),
    @JsonProperty("3")
    _3("3"),
    @JsonProperty("30")
    _30("30"),
    @JsonProperty("4")
    _4("4"),
    @JsonProperty("40")
    _40("40"),
    @JsonProperty("5")
    _5("5"),
    @JsonProperty("region")
    region("region"),
    @JsonProperty("solarsystem")
    solarsystem("solarsystem"),
    @JsonProperty("station")
    station("station");
    public final String toString;

    GetCorporationsCorporationIdOrdersHistoryRange(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
