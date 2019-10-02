package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCharactersCharacterIdNotificationsSenderType {
    @JsonProperty("character")
    character("character"),
    @JsonProperty("corporation")
    corporation("corporation"),
    @JsonProperty("alliance")
    alliance("alliance"),
    @JsonProperty("faction")
    faction("faction"),
    @JsonProperty("other")
    other("other");
    public final String toString;

    GetCharactersCharacterIdNotificationsSenderType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
