package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetAlliancesAllianceIdContactsContactType {
    @JsonProperty("character")
    character("character"),
    @JsonProperty("corporation")
    corporation("corporation"),
    @JsonProperty("alliance")
    alliance("alliance"),
    @JsonProperty("faction")
    faction("faction");
    public final String toString;

    GetAlliancesAllianceIdContactsContactType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
