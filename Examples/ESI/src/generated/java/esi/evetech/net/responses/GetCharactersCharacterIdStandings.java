package esi.evetech.net.responses;

import esi.evetech.net.structures.GetCharactersCharacterIdStandingsFromType;

public class GetCharactersCharacterIdStandings {
    /**
     * from_id integer
     */
    public int from_id;
    /**
     * from_type string
     */
    public GetCharactersCharacterIdStandingsFromType from_type;
    /**
     * standing number
     */
    public float standing;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCharactersCharacterIdStandings othersame = ((GetCharactersCharacterIdStandings) other);
        if (from_id!= othersame.from_id) {
            return false;
        }
        if ((from_type!= othersame.from_type)&&((from_type == null)||(!from_type.equals(othersame.from_type)))) {
            return false;
        }
        if (standing!= othersame.standing) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((from_id +((from_type == null)? 0 :from_type.hashCode()))+ Double.hashCode(standing));
    }
}
