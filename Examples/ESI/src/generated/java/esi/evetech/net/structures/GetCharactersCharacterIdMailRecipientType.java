package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCharactersCharacterIdMailRecipientType {
    @JsonProperty("alliance")
    alliance("alliance"),
    @JsonProperty("character")
    character("character"),
    @JsonProperty("corporation")
    corporation("corporation"),
    @JsonProperty("mailing_list")
    mailing_list("mailing_list");
    public final String toString;

    GetCharactersCharacterIdMailRecipientType(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
