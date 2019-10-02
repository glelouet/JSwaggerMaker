package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCharactersCharacterIdIndustryJobsStatus {
    @JsonProperty("active")
    active("active"),
    @JsonProperty("cancelled")
    cancelled("cancelled"),
    @JsonProperty("delivered")
    delivered("delivered"),
    @JsonProperty("paused")
    paused("paused"),
    @JsonProperty("ready")
    ready("ready"),
    @JsonProperty("reverted")
    reverted("reverted");
    public final String toString;

    GetCharactersCharacterIdIndustryJobsStatus(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
