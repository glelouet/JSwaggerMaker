package esi.evetech.net.responses;

public class post_characters_character_id_assets_names_200 {
    /**
     * item_id integer
     */
    public long item_id;
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
        post_characters_character_id_assets_names_200 othersame = ((post_characters_character_id_assets_names_200) other);
        if (item_id!= othersame.item_id) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(item_id)+((name == null)? 0 :name.hashCode()));
    }
}
