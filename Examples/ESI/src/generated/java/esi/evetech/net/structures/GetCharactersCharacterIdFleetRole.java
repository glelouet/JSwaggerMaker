package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCharactersCharacterIdFleetRole {
    @JsonProperty("fleet_commander")
    fleet_commander("fleet_commander"),
    @JsonProperty("squad_commander")
    squad_commander("squad_commander"),
    @JsonProperty("squad_member")
    squad_member("squad_member"),
    @JsonProperty("wing_commander")
    wing_commander("wing_commander");
    public final String toString;

    GetCharactersCharacterIdFleetRole(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
