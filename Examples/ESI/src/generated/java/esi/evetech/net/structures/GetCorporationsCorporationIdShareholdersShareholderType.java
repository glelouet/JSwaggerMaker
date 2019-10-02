package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCorporationsCorporationIdShareholdersShareholderType {
    @JsonProperty("character")
    character("character"),
    @JsonProperty("corporation")
    corporation("corporation");
    public final String toString;

    GetCorporationsCorporationIdShareholdersShareholderType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
