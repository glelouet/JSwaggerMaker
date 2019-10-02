package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCharactersCharacterIdCalendarEventIdOwnerType {
    @JsonProperty("eve_server")
    eve_server("eve_server"),
    @JsonProperty("corporation")
    corporation("corporation"),
    @JsonProperty("faction")
    faction("faction"),
    @JsonProperty("character")
    character("character"),
    @JsonProperty("alliance")
    alliance("alliance");
    public final String toString;

    GetCharactersCharacterIdCalendarEventIdOwnerType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
