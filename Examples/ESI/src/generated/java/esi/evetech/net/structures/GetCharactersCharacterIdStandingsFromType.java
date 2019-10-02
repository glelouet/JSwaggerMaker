package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCharactersCharacterIdStandingsFromType {
    @JsonProperty("agent")
    agent("agent"),
    @JsonProperty("npc_corp")
    npc_corp("npc_corp"),
    @JsonProperty("faction")
    faction("faction");
    public final String toString;

    GetCharactersCharacterIdStandingsFromType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
