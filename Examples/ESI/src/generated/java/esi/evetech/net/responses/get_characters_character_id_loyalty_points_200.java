package esi.evetech.net.responses;

public class get_characters_character_id_loyalty_points_200 {
    /**
     * corporation_id integer
     */
    public int corporation_id;
    /**
     * loyalty_points integer
     */
    public int loyalty_points;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        get_characters_character_id_loyalty_points_200 othersame = ((get_characters_character_id_loyalty_points_200) other);
        if (corporation_id!= othersame.corporation_id) {
            return false;
        }
        if (loyalty_points!= othersame.loyalty_points) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (corporation_id + loyalty_points);
    }
}
