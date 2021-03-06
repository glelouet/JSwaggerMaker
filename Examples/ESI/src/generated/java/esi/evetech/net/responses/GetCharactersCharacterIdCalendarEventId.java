package esi.evetech.net.responses;

import esi.evetech.net.structures.GetCharactersCharacterIdCalendarEventIdOwnerType;

public class GetCharactersCharacterIdCalendarEventId {
    /**
     * date string
     */
    public String date;
    /**
     * Length in minutes
     */
    public int duration;
    /**
     * event_id integer
     */
    public int event_id;
    /**
     * importance integer
     */
    public int importance;
    /**
     * owner_id integer
     */
    public int owner_id;
    /**
     * owner_name string
     */
    public String owner_name;
    /**
     * owner_type string
     */
    public GetCharactersCharacterIdCalendarEventIdOwnerType owner_type;
    /**
     * response string
     */
    public String response;
    /**
     * text string
     */
    public String text;
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
        GetCharactersCharacterIdCalendarEventId othersame = ((GetCharactersCharacterIdCalendarEventId) other);
        if ((date!= othersame.date)&&((date == null)||(!date.equals(othersame.date)))) {
            return false;
        }
        if (duration!= othersame.duration) {
            return false;
        }
        if (event_id!= othersame.event_id) {
            return false;
        }
        if (importance!= othersame.importance) {
            return false;
        }
        if (owner_id!= othersame.owner_id) {
            return false;
        }
        if ((owner_name!= othersame.owner_name)&&((owner_name == null)||(!owner_name.equals(othersame.owner_name)))) {
            return false;
        }
        if ((owner_type!= othersame.owner_type)&&((owner_type == null)||(!owner_type.equals(othersame.owner_type)))) {
            return false;
        }
        if ((response!= othersame.response)&&((response == null)||(!response.equals(othersame.response)))) {
            return false;
        }
        if ((text!= othersame.text)&&((text == null)||(!text.equals(othersame.text)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((date == null)? 0 :date.hashCode())+ duration)+ event_id)+ importance)+ owner_id)+((owner_name == null)? 0 :owner_name.hashCode()))+((owner_type == null)? 0 :owner_type.hashCode()))+((response == null)? 0 :response.hashCode()))+((text == null)? 0 :text.hashCode()))+((title == null)? 0 :title.hashCode()));
    }
}
