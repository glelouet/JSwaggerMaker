package esi.evetech.net.responses;

import esi.evetech.net.structures.get_characters_character_id_calendar_event_response;

public class Getcharacterscharacteridcalendar {
    /**
     * event_date string
     */
    public String event_date;
    /**
     * event_id integer
     */
    public int event_id;
    /**
     * event_response string
     */
    public get_characters_character_id_calendar_event_response event_response;
    /**
     * importance integer
     */
    public int importance;
    /**
     * title string
     */
    public String title;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getcharacterscharacteridcalendar othersame = ((Getcharacterscharacteridcalendar) other);
        if ((event_date!= othersame.event_date)&&((event_date == null)||(!event_date.equals(othersame.event_date)))) {
            return false;
        }
        if (event_id!= othersame.event_id) {
            return false;
        }
        if ((event_response!= othersame.event_response)&&((event_response == null)||(!event_response.equals(othersame.event_response)))) {
            return false;
        }
        if (importance!= othersame.importance) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((event_date == null)? 0 :event_date.hashCode())+ event_id)+((event_response == null)? 0 :event_response.hashCode()))+ importance)+((title == null)? 0 :title.hashCode()));
    }
}
