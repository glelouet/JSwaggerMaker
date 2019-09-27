package esi.evetech.net.responses.getcharacterscharacteridclones;

import esi.evetech.net.structures.get_characters_character_id_clones_location_type;

public class Getcharacterscharacteridcloneshomelocation {
    /**
     * location_id integer
     */
    public long location_id;
    /**
     * location_type string
     */
    public get_characters_character_id_clones_location_type location_type;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getcharacterscharacteridcloneshomelocation othersame = ((Getcharacterscharacteridcloneshomelocation) other);
        if (location_id!= othersame.location_id) {
            return false;
        }
        if ((location_type!= othersame.location_type)&&((location_type == null)||(!location_type.equals(othersame.location_type)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(location_id)+((location_type == null)? 0 :location_type.hashCode()));
    }
}
