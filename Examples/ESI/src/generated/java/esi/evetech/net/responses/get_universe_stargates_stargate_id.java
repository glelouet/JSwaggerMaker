package esi.evetech.net.responses;

public class get_universe_stargates_stargate_id {
    /**
     * destination object
     */
    public get_universe_stargates_stargate_id_destination destination;
    /**
     * name string
     */
    public String name;
    /**
     * position object
     */
    public get_corporations_corporation_id_bookmarks_coordinates position;
    /**
     * stargate_id integer
     */
    public int stargate_id;
    /**
     * The solar system this stargate is in
     */
    public int system_id;
    /**
     * type_id integer
     */
    public int type_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        get_universe_stargates_stargate_id othersame = ((get_universe_stargates_stargate_id) other);
        if ((destination!= othersame.destination)&&((destination == null)||(!destination.equals(othersame.destination)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((position!= othersame.position)&&((position == null)||(!position.equals(othersame.position)))) {
            return false;
        }
        if (stargate_id!= othersame.stargate_id) {
            return false;
        }
        if (system_id!= othersame.system_id) {
            return false;
        }
        if (type_id!= othersame.type_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((destination == null)? 0 :destination.hashCode())+((name == null)? 0 :name.hashCode()))+((position == null)? 0 :position.hashCode()))+ stargate_id)+ system_id)+ type_id);
    }
}
