package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetMarketsRegionIdOrdersRange {
    @JsonProperty("station")
    station("station"),
    @JsonProperty("region")
    region("region"),
    @JsonProperty("solarsystem")
    solarsystem("solarsystem"),
    @JsonProperty("1")
    _1("1"),
    @JsonProperty("2")
    _2("2"),
    @JsonProperty("3")
    _3("3"),
    @JsonProperty("4")
    _4("4"),
    @JsonProperty("5")
    _5("5"),
    @JsonProperty("10")
    _10("10"),
    @JsonProperty("20")
    _20("20"),
    @JsonProperty("30")
    _30("30"),
    @JsonProperty("40")
    _40("40");
    public final String toString;

    GetMarketsRegionIdOrdersRange(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
