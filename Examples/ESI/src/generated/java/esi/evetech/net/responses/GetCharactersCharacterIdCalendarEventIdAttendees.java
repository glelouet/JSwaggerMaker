package esi.evetech.net.responses;

import esi.evetech.net.structures.GetCharactersCharacterIdCalendarEventIdAttendeesEventResponse;

public class GetCharactersCharacterIdCalendarEventIdAttendees {
    /**
     * character_id integer
     */
    public int character_id;
    /**
     * event_response string
     */
    public GetCharactersCharacterIdCalendarEventIdAttendeesEventResponse event_response;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCharactersCharacterIdCalendarEventIdAttendees othersame = ((GetCharactersCharacterIdCalendarEventIdAttendees) other);
        if (character_id!= othersame.character_id) {
            return false;
        }
        if ((event_response!= othersame.event_response)&&((event_response == null)||(!event_response.equals(othersame.event_response)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (character_id +((event_response == null)? 0 :event_response.hashCode()));
    }
}
