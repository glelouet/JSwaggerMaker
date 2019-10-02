package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCorporationsCorporationIdContainersLogsPasswordType {
    @JsonProperty("config")
    config("config"),
    @JsonProperty("general")
    general("general");
    public final String toString;

    GetCorporationsCorporationIdContainersLogsPasswordType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
