package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetFleetsFleetIdMembersRole {
    @JsonProperty("fleet_commander")
    fleet_commander("fleet_commander"),
    @JsonProperty("wing_commander")
    wing_commander("wing_commander"),
    @JsonProperty("squad_commander")
    squad_commander("squad_commander"),
    @JsonProperty("squad_member")
    squad_member("squad_member");
    public final String toString;

    GetFleetsFleetIdMembersRole(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
