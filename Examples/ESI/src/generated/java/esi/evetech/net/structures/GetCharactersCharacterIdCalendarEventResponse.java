package esi.evetech.net.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetCharactersCharacterIdCalendarEventResponse {
    @JsonProperty("declined")
    declined("declined"),
    @JsonProperty("not_responded")
    not_responded("not_responded"),
    @JsonProperty("accepted")
    accepted("accepted"),
    @JsonProperty("tentative")
    tentative("tentative");
    public final String toString;

    GetCharactersCharacterIdCalendarEventResponse(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
