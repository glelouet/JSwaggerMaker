package esi.evetech.net.responses;

public class PostCharactersAffiliation {
    /**
     * The character's alliance ID, if their corporation is in an alliance
     */
    public int alliance_id;
    /**
     * The character's ID
     */
    public int character_id;
    /**
     * The character's corporation ID
     */
    public int corporation_id;
    /**
     * The character's faction ID, if their corporation is in a faction
     */
    public int faction_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        PostCharactersAffiliation othersame = ((PostCharactersAffiliation) other);
        if (alliance_id!= othersame.alliance_id) {
            return false;
        }
        if (character_id!= othersame.character_id) {
            return false;
        }
        if (corporation_id!= othersame.corporation_id) {
            return false;
        }
        if (faction_id!= othersame.faction_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((alliance_id + character_id)+ corporation_id)+ faction_id);
    }
}
