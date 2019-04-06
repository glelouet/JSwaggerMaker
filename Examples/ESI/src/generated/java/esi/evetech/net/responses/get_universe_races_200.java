package esi.evetech.net.responses;

public class get_universe_races_200 {
    /**
     * The alliance generally associated with this race
     */
    public int alliance_id;
    /**
     * description string
     */
    public String description;
    /**
     * name string
     */
    public String name;
    /**
     * race_id integer
     */
    public int race_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        get_universe_races_200 othersame = ((get_universe_races_200) other);
        if (alliance_id!= othersame.alliance_id) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if (race_id!= othersame.race_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((alliance_id +((description == null)? 0 :description.hashCode()))+((name == null)? 0 :name.hashCode()))+ race_id);
    }
}
