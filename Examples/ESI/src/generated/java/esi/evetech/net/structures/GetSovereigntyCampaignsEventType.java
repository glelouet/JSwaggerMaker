package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetSovereigntyCampaignsEventType {
    @JsonProperty("tcu_defense")
    tcu_defense("tcu_defense"),
    @JsonProperty("ihub_defense")
    ihub_defense("ihub_defense"),
    @JsonProperty("station_defense")
    station_defense("station_defense"),
    @JsonProperty("station_freeport")
    station_freeport("station_freeport");
    public final String toString;

    GetSovereigntyCampaignsEventType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
