package esi.evetech.net.responses;

import esi.evetech.net.responses.getcharacterscharacteridmedals.GetCharactersCharacterIdMedalsGraphics;
import esi.evetech.net.structures.GetCharactersCharacterIdMedalsStatus;

public class GetCharactersCharacterIdMedals {
    /**
     * corporation_id integer
     */
    public int corporation_id;
    /**
     * date string
     */
    public String date;
    /**
     * description string
     */
    public String description;
    /**
     * graphics array
     */
    public GetCharactersCharacterIdMedalsGraphics[] graphics;
    /**
     * issuer_id integer
     */
    public int issuer_id;
    /**
     * medal_id integer
     */
    public int medal_id;
    /**
     * reason string
     */
    public String reason;
    /**
     * status string
     */
    public GetCharactersCharacterIdMedalsStatus status;
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
        GetCharactersCharacterIdMedals othersame = ((GetCharactersCharacterIdMedals) other);
        if (corporation_id!= othersame.corporation_id) {
            return false;
        }
        if ((date!= othersame.date)&&((date == null)||(!date.equals(othersame.date)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((graphics!= othersame.graphics)&&((graphics == null)||(!graphics.equals(othersame.graphics)))) {
            return false;
        }
        if (issuer_id!= othersame.issuer_id) {
            return false;
        }
        if (medal_id!= othersame.medal_id) {
            return false;
        }
        if ((reason!= othersame.reason)&&((reason == null)||(!reason.equals(othersame.reason)))) {
            return false;
        }
        if ((status!= othersame.status)&&((status == null)||(!status.equals(othersame.status)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((corporation_id +((date == null)? 0 :date.hashCode()))+((description == null)? 0 :description.hashCode()))+((graphics == null)? 0 :graphics.hashCode()))+ issuer_id)+ medal_id)+((reason == null)? 0 :reason.hashCode()))+((status == null)? 0 :status.hashCode()))+((title == null)? 0 :title.hashCode()));
    }
}
