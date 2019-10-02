package esi.evetech.net.responses.getcharacterscharacteridclones;

import esi.evetech.net.structures.GetCharactersCharacterIdClonesJumpCloneLocationType;

public class GetCharactersCharacterIdClonesJumpClones {
    /**
     * implants array
     */
    public int[] implants;
    /**
     * jump_clone_id integer
     */
    public int jump_clone_id;
    /**
     * location_id integer
     */
    public long location_id;
    /**
     * location_type string
     */
    public GetCharactersCharacterIdClonesJumpCloneLocationType location_type;
    /**
     * name string
     */
    public String name;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCharactersCharacterIdClonesJumpClones othersame = ((GetCharactersCharacterIdClonesJumpClones) other);
        if ((implants!= othersame.implants)&&((implants == null)||(!implants.equals(othersame.implants)))) {
            return false;
        }
        if (jump_clone_id!= othersame.jump_clone_id) {
            return false;
        }
        if (location_id!= othersame.location_id) {
            return false;
        }
        if ((location_type!= othersame.location_type)&&((location_type == null)||(!location_type.equals(othersame.location_type)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((implants == null)? 0 :implants.hashCode())+ jump_clone_id)+ Long.hashCode(location_id))+((location_type == null)? 0 :location_type.hashCode()))+((name == null)? 0 :name.hashCode()));
    }
}
