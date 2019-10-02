package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCorporationCorporationIdMiningObserversObserverType {
    @JsonProperty("structure")
    structure("structure");
    public final String toString;

    GetCorporationCorporationIdMiningObserversObserverType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
