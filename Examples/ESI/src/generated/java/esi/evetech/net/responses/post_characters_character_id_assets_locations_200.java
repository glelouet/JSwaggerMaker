package esi.evetech.net.responses;

public class post_characters_character_id_assets_locations_200 {
    /**
     * item_id integer
     */
    public long item_id;
    /**
     * position object
     */
    public get_corporations_corporation_id_bookmarks_coordinates position;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        post_characters_character_id_assets_locations_200 othersame = ((post_characters_character_id_assets_locations_200) other);
        if (item_id!= othersame.item_id) {
            return false;
        }
        if ((position!= othersame.position)&&((position == null)||(!position.equals(othersame.position)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(item_id)+((position == null)? 0 :position.hashCode()));
    }
}
